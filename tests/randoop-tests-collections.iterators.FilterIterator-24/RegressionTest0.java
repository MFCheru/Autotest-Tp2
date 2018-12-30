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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        try {
            boolean b48 = filterIterator47.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) 1.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        try {
            filterIterator47.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.Factory factory16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        defaultedMap45.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap26.get(obj36);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap26.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap26.equals((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.Factory factory59 = null;
        try {
            java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        try {
            boolean b68 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        try {
            boolean b68 = filterIterator67.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.util.Collection collection16 = defaultedMap11.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        int i19 = defaultedMap1.size();
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap1.get(obj20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj19 = defaultedMap8.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate26, predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        boolean b34 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate35, predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate27, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj55 = defaultedMap44.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 1);
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate62, predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (byte) 1);
        boolean b70 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate71, predicate72);
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate63, predicate71);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection77 = defaultedMap76.values();
        java.lang.Object obj78 = defaultedMap1.put((java.lang.Object) map74, (java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) (byte) 1);
        boolean b84 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate85, predicate86);
        java.util.Map map88 = collections.map.DefaultedMap.decorate(map74, (java.lang.Object) defaultedMap80);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map88);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b46 = defaultedMap7.equals((java.lang.Object) 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Collection collection24 = defaultedMap17.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        java.lang.Object obj28 = defaultedMap17.get((java.lang.Object) 100);
        java.util.Map map29 = null;
        try {
            defaultedMap17.putAll(map29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap13.containsKey(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap26.get(obj36);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap26.equals(obj41);
        boolean b43 = defaultedMap13.containsKey((java.lang.Object) defaultedMap26);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 1);
        boolean b50 = defaultedMap46.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate44, predicate52);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate44);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = defaultedMap57.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj66 = defaultedMap57.get((java.lang.Object) defaultedMap63);
        java.lang.Object obj67 = null;
        boolean b68 = defaultedMap57.containsKey(obj67);
        java.lang.String str69 = defaultedMap57.toString();
        defaultedMap57.clear();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator71.setPredicate(predicate72);
        boolean b74 = defaultedMap57.equals((java.lang.Object) predicate72);
        filterIterator55.setPredicate(predicate72);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) predicate72);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0 + "'", obj66.equals(0));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0 + "'", obj76.equals(0));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.util.Collection collection16 = defaultedMap11.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        int i19 = defaultedMap1.size();
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        collections.Transformer transformer54 = null;
        try {
            java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        int i13 = defaultedMap7.size();
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap23.get(obj33);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap23.equals(obj38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj45 = defaultedMap41.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj50 = defaultedMap41.get((java.lang.Object) defaultedMap47);
        boolean b52 = defaultedMap47.containsKey((java.lang.Object) (short) -1);
        boolean b53 = defaultedMap23.equals((java.lang.Object) (short) -1);
        defaultedMap18.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) ' ');
        java.util.Set set61 = defaultedMap56.entrySet();
        boolean b62 = defaultedMap56.isEmpty();
        java.util.Set set63 = defaultedMap56.keySet();
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) defaultedMap56);
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0 + "'", obj60.equals(0));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNotNull(set63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set6 = defaultedMap1.keySet();
        int i7 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        java.util.Set set10 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap12.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        boolean b29 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate31, predicate39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate31, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = defaultedMap48.get((java.lang.Object) defaultedMap54);
        java.lang.Object obj59 = defaultedMap48.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 1);
        boolean b65 = defaultedMap61.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate66, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj72 = defaultedMap70.remove((java.lang.Object) (byte) 1);
        boolean b74 = defaultedMap70.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate75, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate67, predicate75);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection81 = defaultedMap80.values();
        java.lang.Object obj82 = defaultedMap5.put((java.lang.Object) map78, (java.lang.Object) defaultedMap80);
        boolean b83 = defaultedMap1.equals(obj82);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(collection81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        try {
            java.lang.Object obj68 = filterIterator67.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) ' ');
        java.util.Set set8 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj21 = defaultedMap10.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 1);
        boolean b27 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate28, predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate29, predicate37);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator41.setPredicate(predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate29, predicate42);
        try {
            java.util.Map map45 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.util.Collection collection16 = defaultedMap11.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        defaultedMap1.clear();
        int i19 = defaultedMap1.size();
        collections.Transformer transformer20 = null;
        try {
            java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 1);
        int i17 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 1);
        boolean b17 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap15.containsKey(obj25);
        java.lang.String str27 = defaultedMap15.toString();
        java.lang.Object obj29 = defaultedMap15.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        java.util.Set set36 = defaultedMap31.entrySet();
        boolean b37 = defaultedMap31.isEmpty();
        java.util.Collection collection38 = defaultedMap31.values();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        int i42 = defaultedMap31.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertTrue(i42 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap14.get(obj24);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap14.equals(obj29);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate40);
        int i43 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(i43 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.get(obj37);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap27.equals(obj42);
        boolean b44 = defaultedMap14.containsKey((java.lang.Object) defaultedMap27);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate45, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        filterIterator9.setPredicate(predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        filterIterator76.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate80);
        try {
            filterIterator82.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap9.containsKey(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap22.get(obj32);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap22.equals(obj37);
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) defaultedMap22);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 1);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate40, predicate48);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate40);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate40);
        java.util.Iterator iterator53 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(iterator53);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap8.containsKey(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap21.get(obj31);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap21.equals(obj36);
        boolean b38 = defaultedMap8.containsKey((java.lang.Object) defaultedMap21);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 1);
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate39, predicate47);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) predicate47);
        boolean b52 = defaultedMap1.equals((java.lang.Object) 10);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertTrue(b52 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 1);
        java.lang.String str17 = defaultedMap1.toString();
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{0=1}" + "'", str17.equals("{0=1}"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        java.util.Iterator iterator58 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            boolean b60 = filterIterator59.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(iterator58);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap9.containsKey(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap22.get(obj32);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap22.equals(obj37);
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) defaultedMap22);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 1);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate40, predicate48);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate40);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate40);
        try {
            filterIterator52.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap10.containsKey(obj20);
        java.lang.String str22 = defaultedMap10.toString();
        defaultedMap10.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) predicate25);
        filterIterator8.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate25);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, (java.lang.Object) '4');
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate(map9, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map11);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate9 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap15.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap28.get(obj38);
        java.lang.Object obj42 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap28.equals(obj43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) defaultedMap28);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate46);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        filterIterator10.setPredicate(predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate75);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = filterIterator78.getPredicate();
        filterIterator77.setPredicate(predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate81);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map85 = collections.map.PredicatedMap.decorate(map0, predicate81, predicate84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = filterIterator68.getPredicate();
        filterIterator67.setPredicate(predicate71);
        collections.Predicate predicate73 = filterIterator67.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.lang.Object obj53 = defaultedMap7.get((java.lang.Object) set52);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        int i54 = defaultedMap7.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = defaultedMap1.get(obj18);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) defaultedMap55);
        java.lang.Object obj59 = null;
        boolean b60 = defaultedMap49.containsKey(obj59);
        java.lang.String str61 = defaultedMap49.toString();
        defaultedMap49.clear();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        boolean b66 = defaultedMap49.equals((java.lang.Object) predicate64);
        filterIterator47.setPredicate(predicate64);
        try {
            filterIterator47.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0 + "'", obj58.equals(0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap30.containsKey(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap43.get(obj53);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap43.equals(obj58);
        boolean b60 = defaultedMap30.containsKey((java.lang.Object) defaultedMap43);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate61, predicate69);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate61);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate61);
        filterIterator16.setIterator((java.util.Iterator) filterIterator73);
        boolean b75 = defaultedMap1.equals((java.lang.Object) filterIterator73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap18.containsKey(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap31.equals(obj46);
        boolean b48 = defaultedMap18.containsKey((java.lang.Object) defaultedMap31);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate49, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate49);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate49);
        filterIterator4.setIterator((java.util.Iterator) filterIterator61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) ' ');
        java.util.Set set69 = defaultedMap64.entrySet();
        collections.Predicate predicate70 = null;
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection75 = defaultedMap74.values();
        int i76 = defaultedMap74.size();
        defaultedMap64.putAll((java.util.Map) defaultedMap74);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj81 = defaultedMap79.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj83 = defaultedMap79.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj87 = defaultedMap85.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj88 = defaultedMap79.get((java.lang.Object) defaultedMap85);
        java.lang.Object obj89 = null;
        boolean b90 = defaultedMap79.containsKey(obj89);
        java.lang.String str91 = defaultedMap79.toString();
        defaultedMap79.clear();
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator();
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        filterIterator93.setPredicate(predicate94);
        boolean b96 = defaultedMap79.equals((java.lang.Object) predicate94);
        collections.Predicate predicate97 = collections.PredicateUtils.truePredicate();
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate94, predicate97);
        filterIterator61.setPredicate(predicate97);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 0 + "'", obj68.equals(0));
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(collection75);
        org.junit.Assert.assertTrue(i76 == 0);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0 + "'", obj83.equals(0));
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 0 + "'", obj88.equals(0));
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{}" + "'", str91.equals("{}"));
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertNotNull(predicate97);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap26.get(obj36);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap26.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap26.equals((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        java.util.Set set59 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(set59);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap14.get(obj24);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap14.equals(obj29);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) map42);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = defaultedMap1.get(obj18);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap1.equals(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap19.entrySet();
        boolean b25 = defaultedMap19.isEmpty();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) b25);
        collections.Transformer transformer27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap9.containsKey(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap22.get(obj32);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap22.equals(obj37);
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) defaultedMap22);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 1);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate40, predicate48);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate40);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = defaultedMap53.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj62 = defaultedMap53.get((java.lang.Object) defaultedMap59);
        java.lang.Object obj63 = null;
        boolean b64 = defaultedMap53.containsKey(obj63);
        java.lang.String str65 = defaultedMap53.toString();
        defaultedMap53.clear();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate68);
        boolean b70 = defaultedMap53.equals((java.lang.Object) predicate68);
        filterIterator51.setPredicate(predicate68);
        filterIterator3.setPredicate(predicate68);
        try {
            boolean b73 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0 + "'", obj62.equals(0));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = new java.lang.Object();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Collection collection24 = defaultedMap17.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.Factory factory26 = null;
        try {
            java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap6.get((java.lang.Object) defaultedMap12);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap6.containsKey(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap19.get(obj29);
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap19.equals(obj34);
        boolean b36 = defaultedMap6.containsKey((java.lang.Object) defaultedMap19);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 1);
        boolean b43 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate44, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate37, predicate45);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate37);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate56);
        filterIterator1.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.Predicate predicate62 = filterIterator59.getPredicate();
        collections.Predicate predicate63 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map66 = collections.map.PredicatedMap.decorate(map0, predicate63, predicate65);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap10.containsKey(obj20);
        java.lang.String str22 = defaultedMap10.toString();
        defaultedMap10.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) predicate25);
        filterIterator8.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate25);
        try {
            filterIterator29.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        int i9 = defaultedMap1.size();
        boolean b10 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection2 = defaultedMap1.values();
        int i3 = defaultedMap1.size();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = null;
        boolean b20 = defaultedMap9.containsKey(obj19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap22.get(obj32);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap22.equals(obj37);
        boolean b39 = defaultedMap9.containsKey((java.lang.Object) defaultedMap22);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 1);
        boolean b46 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate47, predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate40, predicate48);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate40);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) (byte) 1);
        boolean b57 = defaultedMap53.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate58, predicate59);
        filterIterator4.setPredicate(predicate59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate69);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        collections.Predicate predicate75 = filterIterator72.getPredicate();
        filterIterator71.setPredicate(predicate75);
        java.lang.Object obj77 = defaultedMap1.get((java.lang.Object) filterIterator71);
        collections.Factory factory78 = null;
        try {
            java.util.Map map79 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory78);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0 + "'", obj77.equals(0));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap30.containsKey(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap43.get(obj53);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap43.equals(obj58);
        boolean b60 = defaultedMap30.containsKey((java.lang.Object) defaultedMap43);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate61, predicate69);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate61);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate61);
        filterIterator16.setIterator((java.util.Iterator) filterIterator73);
        boolean b75 = defaultedMap1.equals((java.lang.Object) filterIterator73);
        collections.Transformer transformer76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        java.lang.String str28 = defaultedMap16.toString();
        java.lang.Object obj30 = defaultedMap16.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        java.util.Set set37 = defaultedMap32.entrySet();
        boolean b38 = defaultedMap32.isEmpty();
        java.util.Collection collection39 = defaultedMap32.values();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = defaultedMap42.get((java.lang.Object) defaultedMap48);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap42.get(obj52);
        boolean b54 = defaultedMap42.isEmpty();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) ' ');
        java.util.Set set61 = defaultedMap56.entrySet();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj72 = defaultedMap63.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj74 = defaultedMap63.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (byte) 1);
        boolean b80 = defaultedMap76.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate81, predicate82);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj87 = defaultedMap85.remove((java.lang.Object) (byte) 1);
        boolean b89 = defaultedMap85.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap85, predicate90, predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate82, predicate90);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator();
        collections.Predicate predicate95 = collections.PredicateUtils.truePredicate();
        filterIterator94.setPredicate(predicate95);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate82, predicate95);
        java.lang.Object obj98 = defaultedMap42.remove((java.lang.Object) predicate95);
        java.lang.Object obj99 = defaultedMap11.put((java.lang.Object) defaultedMap32, (java.lang.Object) predicate95);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertNotNull(collection39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0 + "'", obj60.equals(0));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0 + "'", obj67.equals(0));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0 + "'", obj72.equals(0));
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(map97);
        org.junit.Assert.assertNull(obj98);
        org.junit.Assert.assertNull(obj99);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate9 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap15.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap28.get(obj38);
        java.lang.Object obj42 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap28.equals(obj43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) defaultedMap28);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate46);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        filterIterator10.setPredicate(predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate75);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = filterIterator78.getPredicate();
        filterIterator77.setPredicate(predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate81);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator0, predicate81);
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        filterIterator84.setPredicate(predicate85);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate85);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj29 = defaultedMap20.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj30 = null;
        java.lang.Object obj31 = defaultedMap20.get(obj30);
        java.lang.Object obj34 = defaultedMap20.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap20.equals(obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap38.get((java.lang.Object) defaultedMap44);
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) (short) -1);
        boolean b50 = defaultedMap20.equals((java.lang.Object) (short) -1);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = defaultedMap53.get((java.lang.Object) ' ');
        java.util.Set set58 = defaultedMap53.entrySet();
        boolean b59 = defaultedMap53.isEmpty();
        java.util.Set set60 = defaultedMap53.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap53);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj72 = defaultedMap63.get((java.lang.Object) defaultedMap69);
        java.lang.Object obj73 = defaultedMap15.get(obj72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0 + "'", obj67.equals(0));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0 + "'", obj72.equals(0));
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0 + "'", obj73.equals(0));
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate64);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        filterIterator67.setPredicate(predicate75);
        try {
            boolean b78 = filterIterator67.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        java.lang.String str28 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        boolean b33 = defaultedMap16.equals((java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate34);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) '#');
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object obj45 = defaultedMap12.get(obj44);
        java.util.Set set46 = defaultedMap12.entrySet();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        java.lang.Object obj55 = defaultedMap48.remove((java.lang.Object) filterIterator51);
        java.lang.Object obj56 = defaultedMap12.get((java.lang.Object) defaultedMap48);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        java.lang.String str28 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        boolean b33 = defaultedMap16.equals((java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate34);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) ' ');
        java.util.Set set44 = defaultedMap39.entrySet();
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection50 = defaultedMap49.values();
        int i51 = defaultedMap49.size();
        defaultedMap39.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection55 = defaultedMap54.values();
        boolean b56 = defaultedMap39.containsValue((java.lang.Object) collection55);
        java.lang.Object obj57 = defaultedMap1.remove((java.lang.Object) defaultedMap39);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue(i51 == 0);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj57);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = filterIterator68.getPredicate();
        filterIterator67.setPredicate(predicate71);
        try {
            filterIterator67.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Map map0 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj6 = defaultedMap2.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = defaultedMap2.get((java.lang.Object) defaultedMap8);
        java.lang.Object obj12 = null;
        java.lang.Object obj13 = defaultedMap2.get(obj12);
        boolean b14 = defaultedMap2.isEmpty();
        java.lang.Object obj17 = defaultedMap2.put((java.lang.Object) 0L, (java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap27.containsKey(obj37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap40.get((java.lang.Object) defaultedMap46);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap40.get(obj50);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap40.equals(obj55);
        boolean b57 = defaultedMap27.containsKey((java.lang.Object) defaultedMap40);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate58, predicate66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate58);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate58);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate58, predicate71);
        try {
            java.util.Map map73 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) defaultedMap2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0 + "'", obj6.equals(0));
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        collections.Predicate predicate13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        java.util.Set set20 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap22.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate41, predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate41, predicate54);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate54);
        int i58 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(i58 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap30.containsKey(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap43.get(obj53);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap43.equals(obj58);
        boolean b60 = defaultedMap30.containsKey((java.lang.Object) defaultedMap43);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate61, predicate69);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate61);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate61);
        filterIterator16.setIterator((java.util.Iterator) filterIterator73);
        boolean b75 = defaultedMap1.equals((java.lang.Object) filterIterator73);
        collections.Factory factory76 = null;
        try {
            java.util.Map map77 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory76);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) collection17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) false);
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.String str10 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap29.get(obj39);
        java.lang.Object obj43 = defaultedMap29.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap29.equals(obj44);
        boolean b46 = defaultedMap16.containsKey((java.lang.Object) defaultedMap29);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate47, predicate55);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate47);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        filterIterator11.setPredicate(predicate66);
        java.util.Iterator iterator69 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        boolean b71 = defaultedMap1.containsKey((java.lang.Object) filterIterator70);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.util.Collection collection16 = defaultedMap11.values();
        boolean b17 = defaultedMap1.equals((java.lang.Object) defaultedMap11);
        java.lang.Object obj19 = defaultedMap11.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        boolean b25 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        java.util.Set set32 = defaultedMap27.entrySet();
        java.lang.Object obj34 = defaultedMap21.put((java.lang.Object) set32, (java.lang.Object) (short) -1);
        defaultedMap11.putAll((java.util.Map) defaultedMap21);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap10.containsKey(obj20);
        java.lang.String str22 = defaultedMap10.toString();
        defaultedMap10.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) predicate25);
        filterIterator8.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        boolean b43 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = defaultedMap52.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap52.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) (byte) 1);
        boolean b69 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (byte) 1);
        boolean b78 = defaultedMap74.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate71, predicate79);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate71, predicate84);
        java.lang.Object obj87 = defaultedMap31.remove((java.lang.Object) predicate84);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate84);
        try {
            java.lang.Object obj89 = filterIterator29.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        java.util.Collection collection32 = defaultedMap27.values();
        boolean b33 = defaultedMap17.equals((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b35 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap1.equals(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap19.entrySet();
        boolean b25 = defaultedMap19.isEmpty();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) b25);
        java.util.Collection collection27 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection27);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) b25);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        java.util.Set set34 = defaultedMap29.entrySet();
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate35, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection40 = defaultedMap39.values();
        int i41 = defaultedMap39.size();
        defaultedMap29.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        java.lang.Object obj54 = null;
        boolean b55 = defaultedMap44.containsKey(obj54);
        java.lang.String str56 = defaultedMap44.toString();
        defaultedMap44.clear();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        boolean b61 = defaultedMap44.equals((java.lang.Object) predicate59);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate59, predicate62);
        java.lang.Object obj65 = defaultedMap29.get((java.lang.Object) '#');
        boolean b66 = defaultedMap7.equals((java.lang.Object) defaultedMap29);
        java.util.Set set67 = defaultedMap29.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(i41 == 0);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0 + "'", obj65.equals(0));
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(set67);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 1);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap26.containsKey(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap39.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap39.get(obj49);
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj54 = null;
        boolean b55 = defaultedMap39.equals(obj54);
        boolean b56 = defaultedMap26.containsKey((java.lang.Object) defaultedMap39);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate57, predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate57);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate57);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate57, predicate70);
        java.util.Map map72 = null;
        try {
            defaultedMap1.putAll(map72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        int i8 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        boolean b16 = defaultedMap10.equals((java.lang.Object) 10);
        java.util.Set set17 = defaultedMap10.keySet();
        boolean b18 = defaultedMap1.equals((java.lang.Object) set17);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate3);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj14 = defaultedMap3.remove((java.lang.Object) 100.0d);
        java.lang.String str15 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap21.containsKey(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap34.get(obj44);
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap34.equals(obj49);
        boolean b51 = defaultedMap21.containsKey((java.lang.Object) defaultedMap34);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 1);
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate52, predicate60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate52);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) (byte) 1);
        boolean b69 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate70, predicate71);
        filterIterator16.setPredicate(predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) (byte) 1);
        boolean b79 = defaultedMap75.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate80, predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate81);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83);
        java.lang.Object obj85 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) filterIterator84);
        try {
            java.lang.Object obj86 = filterIterator84.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.util.Set set45 = defaultedMap12.keySet();
        int i46 = defaultedMap12.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.util.Collection collection4 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap14.get(obj24);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj44 = defaultedMap35.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap35.containsKey(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = defaultedMap48.get((java.lang.Object) defaultedMap54);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap48.get(obj58);
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj63 = null;
        boolean b64 = defaultedMap48.equals(obj63);
        boolean b65 = defaultedMap35.containsKey((java.lang.Object) defaultedMap48);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate66, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate66);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator30);
        try {
            java.lang.Object obj79 = filterIterator30.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Collection collection8 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap10.containsKey(obj20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap23.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = null;
        java.lang.Object obj34 = defaultedMap23.get(obj33);
        java.lang.Object obj37 = defaultedMap23.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap23.equals(obj38);
        boolean b40 = defaultedMap10.containsKey((java.lang.Object) defaultedMap23);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        boolean b47 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate48, predicate49);
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate41, predicate49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = defaultedMap57.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj66 = defaultedMap57.get((java.lang.Object) defaultedMap63);
        java.lang.Object obj67 = null;
        boolean b68 = defaultedMap57.containsKey(obj67);
        java.lang.String str69 = defaultedMap57.toString();
        defaultedMap57.clear();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator71.setPredicate(predicate72);
        boolean b74 = defaultedMap57.equals((java.lang.Object) predicate72);
        filterIterator55.setPredicate(predicate72);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate49, predicate72);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0 + "'", obj66.equals(0));
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "{}" + "'", str69.equals("{}"));
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(map76);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) defaultedMap55);
        java.lang.Object obj59 = null;
        boolean b60 = defaultedMap49.containsKey(obj59);
        java.lang.String str61 = defaultedMap49.toString();
        defaultedMap49.clear();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        boolean b66 = defaultedMap49.equals((java.lang.Object) predicate64);
        filterIterator47.setPredicate(predicate64);
        try {
            java.lang.Object obj68 = filterIterator47.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0 + "'", obj58.equals(0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) b25);
        defaultedMap7.clear();
        int i28 = defaultedMap7.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertTrue(i28 == 0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) collection17);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) false);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator21);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap13.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj24 = defaultedMap13.remove((java.lang.Object) 100.0d);
        java.lang.String str25 = defaultedMap13.toString();
        java.util.Set set26 = defaultedMap13.keySet();
        java.lang.Object obj27 = defaultedMap3.get((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        boolean b44 = defaultedMap12.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap1.get(obj26);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        java.lang.String str28 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        boolean b33 = defaultedMap16.equals((java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate34);
        boolean b36 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap38.get((java.lang.Object) defaultedMap44);
        boolean b49 = defaultedMap44.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj55 = defaultedMap51.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj60 = defaultedMap51.get((java.lang.Object) defaultedMap57);
        java.lang.Object obj61 = null;
        boolean b62 = defaultedMap51.containsKey(obj61);
        java.lang.Object obj63 = defaultedMap44.get((java.lang.Object) b62);
        java.lang.Object obj64 = defaultedMap1.get((java.lang.Object) b62);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0 + "'", obj55.equals(0));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0 + "'", obj60.equals(0));
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0 + "'", obj63.equals(0));
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        int i26 = defaultedMap1.size();
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        int i44 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) ' ');
        java.util.Set set51 = defaultedMap46.entrySet();
        collections.Predicate predicate52 = null;
        collections.Predicate predicate53 = null;
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate52, predicate53);
        java.lang.String str55 = defaultedMap46.toString();
        java.lang.Object obj57 = defaultedMap46.get((java.lang.Object) 'a');
        java.lang.Object obj58 = defaultedMap12.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj69 = defaultedMap60.get((java.lang.Object) defaultedMap66);
        java.lang.Object obj70 = null;
        java.lang.Object obj71 = defaultedMap60.get(obj70);
        boolean b72 = defaultedMap60.isEmpty();
        java.util.Set set73 = defaultedMap60.keySet();
        boolean b74 = defaultedMap12.containsValue((java.lang.Object) defaultedMap60);
        java.util.Set set75 = defaultedMap60.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0 + "'", obj69.equals(0));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0 + "'", obj71.equals(0));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b4 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            java.lang.Object obj69 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        int i44 = defaultedMap12.size();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) ' ');
        java.util.Set set51 = defaultedMap46.entrySet();
        collections.Predicate predicate52 = null;
        collections.Predicate predicate53 = null;
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate52, predicate53);
        java.lang.String str55 = defaultedMap46.toString();
        java.lang.Object obj57 = defaultedMap46.get((java.lang.Object) 'a');
        java.lang.Object obj58 = defaultedMap12.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj69 = defaultedMap60.get((java.lang.Object) defaultedMap66);
        java.lang.Object obj70 = null;
        java.lang.Object obj71 = defaultedMap60.get(obj70);
        boolean b72 = defaultedMap60.isEmpty();
        java.util.Set set73 = defaultedMap60.keySet();
        boolean b74 = defaultedMap12.containsValue((java.lang.Object) defaultedMap60);
        collections.Factory factory75 = null;
        try {
            java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, factory75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0 + "'", obj69.equals(0));
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0 + "'", obj71.equals(0));
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate20 = filterIterator16.getPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap26.containsKey(obj36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = defaultedMap39.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap39.get((java.lang.Object) defaultedMap45);
        java.lang.Object obj49 = null;
        java.lang.Object obj50 = defaultedMap39.get(obj49);
        java.lang.Object obj53 = defaultedMap39.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj54 = null;
        boolean b55 = defaultedMap39.equals(obj54);
        boolean b56 = defaultedMap26.containsKey((java.lang.Object) defaultedMap39);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate57, predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate57);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj72 = defaultedMap70.remove((java.lang.Object) (byte) 1);
        boolean b74 = defaultedMap70.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate76 = collections.PredicateUtils.truePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate75, predicate76);
        filterIterator21.setPredicate(predicate76);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) (byte) 1);
        boolean b84 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate85, predicate86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate86);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        filterIterator89.setPredicate(predicate90);
        collections.Predicate predicate92 = filterIterator89.getPredicate();
        filterIterator88.setPredicate(predicate92);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate92);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator();
        collections.Predicate predicate96 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator95, predicate96);
        filterIterator94.setPredicate(predicate96);
        boolean b99 = defaultedMap3.containsKey((java.lang.Object) filterIterator94);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b74 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap8.containsKey(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap21.get(obj31);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap21.equals(obj36);
        boolean b38 = defaultedMap8.containsKey((java.lang.Object) defaultedMap21);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 1);
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate39, predicate47);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) predicate47);
        boolean b51 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertTrue(b51 == true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        boolean b18 = defaultedMap1.equals((java.lang.Object) filterIterator16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj11 = defaultedMap4.remove((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        filterIterator7.setPredicate(predicate15);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate15);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        java.util.Set set25 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj38 = defaultedMap27.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 1);
        boolean b44 = defaultedMap40.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap40, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate46, predicate54);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate46, predicate59);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = filterIterator62.getPredicate();
        collections.Predicate predicate66 = filterIterator62.getPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator67.setPredicate(predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj76 = defaultedMap72.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj81 = defaultedMap72.get((java.lang.Object) defaultedMap78);
        java.lang.Object obj82 = null;
        boolean b83 = defaultedMap72.containsKey(obj82);
        java.lang.String str84 = defaultedMap72.toString();
        defaultedMap72.clear();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        filterIterator86.setPredicate(predicate87);
        boolean b89 = defaultedMap72.equals((java.lang.Object) predicate87);
        filterIterator70.setPredicate(predicate87);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate87);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator();
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        filterIterator92.setPredicate(predicate93);
        collections.Predicate predicate95 = filterIterator92.getPredicate();
        collections.Predicate predicate96 = filterIterator92.getPredicate();
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate96);
        java.util.Map map98 = collections.map.PredicatedMap.decorate(map18, predicate46, predicate96);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0 + "'", obj76.equals(0));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0 + "'", obj81.equals(0));
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertTrue(b89 == false);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(predicate95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj58 = defaultedMap49.get((java.lang.Object) defaultedMap55);
        java.lang.Object obj59 = null;
        boolean b60 = defaultedMap49.containsKey(obj59);
        java.lang.String str61 = defaultedMap49.toString();
        defaultedMap49.clear();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        boolean b66 = defaultedMap49.equals((java.lang.Object) predicate64);
        filterIterator47.setPredicate(predicate64);
        java.util.Iterator iterator68 = filterIterator47.getIterator();
        try {
            boolean b69 = filterIterator47.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0 + "'", obj58.equals(0));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(iterator68);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap14.get(obj24);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap14.equals(obj29);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        boolean b38 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate40);
        java.util.Set set43 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set43);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate9 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap15.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap28.get(obj38);
        java.lang.Object obj42 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap28.equals(obj43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) defaultedMap28);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate46);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        filterIterator10.setPredicate(predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate75);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = filterIterator78.getPredicate();
        filterIterator77.setPredicate(predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate81);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator0, predicate81);
        collections.Predicate predicate85 = filterIterator84.getPredicate();
        try {
            java.lang.Object obj86 = filterIterator84.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate85);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        java.lang.Object obj26 = null;
        java.lang.Object obj27 = defaultedMap1.get(obj26);
        java.util.Collection collection28 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertNotNull(collection28);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) 10L);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap1.containsValue(obj25);
        java.util.Set set27 = defaultedMap1.keySet();
        int i28 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(i28 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap15.containsKey(obj25);
        java.lang.String str27 = defaultedMap15.toString();
        java.lang.Object obj29 = defaultedMap15.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        java.util.Set set36 = defaultedMap31.entrySet();
        boolean b37 = defaultedMap31.isEmpty();
        java.util.Collection collection38 = defaultedMap31.values();
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap31);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        defaultedMap31.clear();
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap26.get(obj36);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap26.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap26.equals((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate60, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) map71);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate9 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap15.containsKey(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj37 = defaultedMap28.get((java.lang.Object) defaultedMap34);
        java.lang.Object obj38 = null;
        java.lang.Object obj39 = defaultedMap28.get(obj38);
        java.lang.Object obj42 = defaultedMap28.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj43 = null;
        boolean b44 = defaultedMap28.equals(obj43);
        boolean b45 = defaultedMap15.containsKey((java.lang.Object) defaultedMap28);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        boolean b52 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate46, predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate46);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        filterIterator10.setPredicate(predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate75);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = filterIterator78.getPredicate();
        filterIterator77.setPredicate(predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate81);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator0, predicate81);
        collections.Predicate predicate85 = filterIterator84.getPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        filterIterator86.setPredicate(predicate87);
        collections.Predicate predicate89 = filterIterator86.getPredicate();
        collections.Predicate predicate90 = filterIterator86.getPredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate90);
        try {
            java.lang.Object obj92 = filterIterator84.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate90);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        int i26 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) i26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        java.util.Iterator iterator48 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(iterator48);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap1.containsValue((java.lang.Object) 10);
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.Predicate predicate16 = null;
        collections.Predicate predicate17 = null;
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate16, predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection21 = defaultedMap20.values();
        int i22 = defaultedMap20.size();
        defaultedMap10.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = null;
        boolean b36 = defaultedMap25.containsKey(obj35);
        java.lang.String str37 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        filterIterator39.setPredicate(predicate40);
        boolean b42 = defaultedMap25.equals((java.lang.Object) predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate40, predicate43);
        java.lang.Object obj46 = defaultedMap10.get((java.lang.Object) '#');
        java.lang.Object obj47 = defaultedMap1.get((java.lang.Object) '#');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap14.get(obj24);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap1.remove((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap35.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj44 = defaultedMap35.get((java.lang.Object) defaultedMap41);
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap35.containsKey(obj45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj57 = defaultedMap48.get((java.lang.Object) defaultedMap54);
        java.lang.Object obj58 = null;
        java.lang.Object obj59 = defaultedMap48.get(obj58);
        java.lang.Object obj62 = defaultedMap48.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj63 = null;
        boolean b64 = defaultedMap48.equals(obj63);
        boolean b65 = defaultedMap35.containsKey((java.lang.Object) defaultedMap48);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate66, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate66);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator30);
        java.lang.Object obj80 = defaultedMap1.remove((java.lang.Object) 1L);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 0 + "'", obj57.equals(0));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        int i13 = defaultedMap7.size();
        java.util.Set set14 = defaultedMap7.keySet();
        java.lang.String str15 = defaultedMap7.toString();
        java.lang.String str16 = defaultedMap7.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10);
        java.util.Set set8 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate18 = filterIterator14.getPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap24.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap24.containsKey(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj47 = null;
        java.lang.Object obj48 = defaultedMap37.get(obj47);
        java.lang.Object obj51 = defaultedMap37.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj52 = null;
        boolean b53 = defaultedMap37.equals(obj52);
        boolean b54 = defaultedMap24.containsKey((java.lang.Object) defaultedMap37);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) (byte) 1);
        boolean b61 = defaultedMap57.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate62, predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate55, predicate63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate55);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        filterIterator19.setPredicate(predicate74);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) (byte) 1);
        boolean b82 = defaultedMap78.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate83, predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        filterIterator87.setPredicate(predicate88);
        collections.Predicate predicate90 = filterIterator87.getPredicate();
        filterIterator86.setPredicate(predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate90);
        java.lang.Object obj93 = defaultedMap1.put((java.lang.Object) 0.0d, (java.lang.Object) filterIterator14);
        try {
            java.lang.Object obj94 = filterIterator14.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        collections.Predicate predicate68 = null;
        filterIterator0.setPredicate(predicate68);
        collections.Predicate predicate70 = filterIterator0.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(predicate70);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        int i44 = defaultedMap12.size();
        java.util.Set set45 = defaultedMap12.keySet();
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        boolean b47 = defaultedMap12.containsValue((java.lang.Object) predicate46);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i44 == 1);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap19.containsKey(obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap32.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj41 = defaultedMap32.get((java.lang.Object) defaultedMap38);
        java.lang.Object obj42 = null;
        java.lang.Object obj43 = defaultedMap32.get(obj42);
        java.lang.Object obj46 = defaultedMap32.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj47 = null;
        boolean b48 = defaultedMap32.equals(obj47);
        boolean b49 = defaultedMap19.containsKey((java.lang.Object) defaultedMap32);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (byte) 1);
        boolean b56 = defaultedMap52.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate57, predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate50, predicate58);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate50);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        filterIterator14.setPredicate(predicate69);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 1);
        boolean b77 = defaultedMap73.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate78, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate78);
        boolean b82 = defaultedMap1.containsKey((java.lang.Object) predicate78);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue(b82 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) ' ');
        java.util.Set set12 = defaultedMap7.entrySet();
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) set12, (java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.get(obj37);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap27.equals(obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj54 = defaultedMap45.get((java.lang.Object) defaultedMap51);
        boolean b56 = defaultedMap51.containsKey((java.lang.Object) (short) -1);
        boolean b57 = defaultedMap27.equals((java.lang.Object) (short) -1);
        defaultedMap22.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        java.util.Set set65 = defaultedMap60.entrySet();
        boolean b66 = defaultedMap60.isEmpty();
        java.util.Set set67 = defaultedMap60.keySet();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) defaultedMap60);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj72 = defaultedMap70.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj74 = defaultedMap70.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj79 = defaultedMap70.get((java.lang.Object) defaultedMap76);
        java.lang.Object obj80 = defaultedMap22.get(obj79);
        java.lang.Object obj81 = defaultedMap1.get(obj80);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 0 + "'", obj11.equals(0));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == true);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 0 + "'", obj74.equals(0));
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0 + "'", obj79.equals(0));
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0 + "'", obj80.equals(0));
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0 + "'", obj81.equals(0));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate65);
        collections.Predicate predicate68 = null;
        filterIterator0.setPredicate(predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 1);
        boolean b77 = defaultedMap73.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate78, predicate79);
        java.util.Map map81 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap71, (java.lang.Object) predicate79);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate79);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap1.get(obj8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        int i6 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) 10L);
        int i25 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(i25 == 1);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj44 = new java.lang.Object();
        java.lang.Object obj45 = defaultedMap12.get(obj44);
        java.lang.Object obj47 = defaultedMap12.get((java.lang.Object) (-1.0f));
        int i48 = defaultedMap12.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertTrue(i48 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap29.get(obj39);
        java.lang.Object obj43 = defaultedMap29.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap29.equals(obj44);
        boolean b46 = defaultedMap16.containsKey((java.lang.Object) defaultedMap29);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate47, predicate55);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate47);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        filterIterator11.setPredicate(predicate66);
        java.util.Iterator iterator69 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        boolean b72 = defaultedMap1.containsKey((java.lang.Object) filterIterator71);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertTrue(b72 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap29.get(obj39);
        java.lang.Object obj43 = defaultedMap29.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap29.equals(obj44);
        boolean b46 = defaultedMap16.containsKey((java.lang.Object) defaultedMap29);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate47, predicate55);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate47);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        filterIterator11.setPredicate(predicate66);
        java.util.Iterator iterator69 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        boolean b72 = defaultedMap1.containsKey((java.lang.Object) filterIterator71);
        collections.Predicate predicate73 = filterIterator71.getPredicate();
        try {
            java.lang.Object obj74 = filterIterator71.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(predicate73);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        java.util.Set set16 = defaultedMap11.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap18.containsKey(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap31.equals(obj46);
        boolean b48 = defaultedMap18.containsKey((java.lang.Object) defaultedMap31);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate49, predicate57);
        java.lang.Object obj60 = defaultedMap11.get((java.lang.Object) predicate57);
        boolean b61 = defaultedMap11.isEmpty();
        boolean b62 = defaultedMap1.containsValue((java.lang.Object) b61);
        java.lang.String str63 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0 + "'", obj60.equals(0));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) defaultedMap3);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap55.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj65 = defaultedMap7.get(obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) ' ');
        java.util.Set set72 = defaultedMap67.entrySet();
        collections.Predicate predicate73 = null;
        collections.Predicate predicate74 = null;
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate73, predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection78 = defaultedMap77.values();
        int i79 = defaultedMap77.size();
        defaultedMap67.putAll((java.util.Map) defaultedMap77);
        defaultedMap7.putAll((java.util.Map) defaultedMap77);
        collections.Factory factory82 = null;
        try {
            java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory82);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0 + "'", obj65.equals(0));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0 + "'", obj71.equals(0));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertTrue(i79 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Collection collection24 = defaultedMap17.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        java.lang.Object obj28 = defaultedMap17.get((java.lang.Object) 100);
        defaultedMap17.clear();
        int i30 = defaultedMap17.size();
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue(i30 == 0);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        java.lang.Object obj21 = defaultedMap10.get(obj20);
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap10.equals(obj25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) ' ');
        java.util.Set set33 = defaultedMap28.entrySet();
        boolean b34 = defaultedMap28.isEmpty();
        boolean b35 = defaultedMap10.containsKey((java.lang.Object) b34);
        java.util.Set set36 = defaultedMap10.keySet();
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) set36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        collections.Predicate predicate23 = null;
        collections.Predicate predicate24 = null;
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate23, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        java.util.Collection collection32 = defaultedMap27.values();
        boolean b33 = defaultedMap17.equals((java.lang.Object) defaultedMap27);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertTrue(b33 == true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = null;
        java.lang.Object obj40 = defaultedMap29.get(obj39);
        java.lang.Object obj43 = defaultedMap29.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap29.equals(obj44);
        boolean b46 = defaultedMap16.containsKey((java.lang.Object) defaultedMap29);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate47, predicate55);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate47);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        boolean b64 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate65, predicate66);
        filterIterator11.setPredicate(predicate66);
        java.util.Iterator iterator69 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        boolean b72 = defaultedMap1.containsKey((java.lang.Object) filterIterator71);
        java.util.Collection collection73 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(collection73);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) filterIterator11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        boolean b9 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection17 = defaultedMap16.values();
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) collection17);
        java.lang.String str19 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        int i11 = defaultedMap7.size();
        java.util.Set set12 = defaultedMap7.keySet();
        java.util.Collection collection13 = defaultedMap7.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        java.util.Collection collection20 = defaultedMap15.values();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 0.0f);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        int i24 = defaultedMap15.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(i24 == 0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        int i11 = defaultedMap7.size();
        java.util.Set set12 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj35 = null;
        java.lang.Object obj36 = defaultedMap25.get(obj35);
        java.lang.Object obj39 = defaultedMap25.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap25.equals(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        boolean b54 = defaultedMap49.containsKey((java.lang.Object) (short) -1);
        boolean b55 = defaultedMap25.equals((java.lang.Object) (short) -1);
        defaultedMap20.putAll((java.util.Map) defaultedMap25);
        int i57 = defaultedMap25.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj63 = defaultedMap59.get((java.lang.Object) ' ');
        java.util.Set set64 = defaultedMap59.entrySet();
        collections.Predicate predicate65 = null;
        collections.Predicate predicate66 = null;
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate65, predicate66);
        java.lang.String str68 = defaultedMap59.toString();
        java.lang.Object obj70 = defaultedMap59.get((java.lang.Object) 'a');
        java.lang.Object obj71 = defaultedMap25.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj77 = defaultedMap73.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj81 = defaultedMap79.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj82 = defaultedMap73.get((java.lang.Object) defaultedMap79);
        java.lang.Object obj83 = null;
        java.lang.Object obj84 = defaultedMap73.get(obj83);
        boolean b85 = defaultedMap73.isEmpty();
        java.util.Set set86 = defaultedMap73.keySet();
        boolean b87 = defaultedMap25.containsValue((java.lang.Object) defaultedMap73);
        boolean b88 = defaultedMap7.equals((java.lang.Object) b87);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(i57 == 1);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 0 + "'", obj63.equals(0));
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0 + "'", obj70.equals(0));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0 + "'", obj77.equals(0));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0 + "'", obj82.equals(0));
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 0 + "'", obj84.equals(0));
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNotNull(set86);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj14 = defaultedMap3.remove((java.lang.Object) 100.0d);
        java.lang.String str15 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = null;
        boolean b32 = defaultedMap21.containsKey(obj31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj43 = defaultedMap34.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = null;
        java.lang.Object obj45 = defaultedMap34.get(obj44);
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap34.equals(obj49);
        boolean b51 = defaultedMap21.containsKey((java.lang.Object) defaultedMap34);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) (byte) 1);
        boolean b58 = defaultedMap54.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate59, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate52, predicate60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate52);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) (byte) 1);
        boolean b69 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate70, predicate71);
        filterIterator16.setPredicate(predicate71);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) (byte) 1);
        boolean b79 = defaultedMap75.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate80, predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate81);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83);
        java.lang.Object obj85 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) filterIterator84);
        try {
            boolean b86 = filterIterator84.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0 + "'", obj43.equals(0));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(obj85);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.get(obj37);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap27.equals(obj42);
        boolean b44 = defaultedMap14.containsKey((java.lang.Object) defaultedMap27);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate45, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        filterIterator9.setPredicate(predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        filterIterator76.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate80);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate84);
        filterIterator82.setPredicate(predicate84);
        try {
            filterIterator82.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            filterIterator68.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj8 = defaultedMap4.get((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap4.entrySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap11.containsKey(obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap24.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = null;
        java.lang.Object obj35 = defaultedMap24.get(obj34);
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj39 = null;
        boolean b40 = defaultedMap24.equals(obj39);
        boolean b41 = defaultedMap11.containsKey((java.lang.Object) defaultedMap24);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate42, predicate50);
        java.lang.Object obj53 = defaultedMap4.get((java.lang.Object) predicate50);
        filterIterator2.setPredicate(predicate50);
        java.util.Iterator iterator55 = filterIterator2.getIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.Predicate predicate59 = filterIterator56.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator56);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNotNull(iterator55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap26.get(obj36);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap26.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap26.equals((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj69 = defaultedMap60.get((java.lang.Object) defaultedMap66);
        java.lang.Object obj70 = null;
        boolean b71 = defaultedMap60.containsKey(obj70);
        java.lang.String str72 = defaultedMap60.toString();
        defaultedMap60.clear();
        boolean b74 = defaultedMap60.isEmpty();
        boolean b75 = defaultedMap21.containsValue((java.lang.Object) b74);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0 + "'", obj69.equals(0));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        java.lang.Object obj26 = defaultedMap7.get((java.lang.Object) b25);
        java.util.Set set27 = defaultedMap7.entrySet();
        java.util.Set set28 = defaultedMap7.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        int i13 = defaultedMap7.size();
        java.util.Set set14 = defaultedMap7.keySet();
        java.lang.String str15 = defaultedMap7.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate17, predicate19);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Collection collection24 = defaultedMap17.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        java.util.Set set27 = defaultedMap26.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        boolean b12 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        int i13 = defaultedMap7.size();
        java.util.Set set14 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        boolean b22 = defaultedMap18.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate23, predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate32);
        filterIterator30.setIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate35 = filterIterator31.getPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate24, predicate35);
        java.util.Set set37 = defaultedMap7.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.util.Set set45 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) ' ');
        java.util.Set set52 = defaultedMap47.entrySet();
        collections.Predicate predicate53 = null;
        collections.Predicate predicate54 = null;
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection58 = defaultedMap57.values();
        int i59 = defaultedMap57.size();
        defaultedMap47.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj61 = defaultedMap12.get((java.lang.Object) defaultedMap57);
        java.lang.String str62 = defaultedMap57.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap10.containsKey(obj20);
        java.lang.String str22 = defaultedMap10.toString();
        defaultedMap10.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) predicate25);
        filterIterator8.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate25);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(iterator31);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        java.lang.String str10 = defaultedMap1.toString();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 'a');
        collections.Predicate predicate13 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        java.util.Set set20 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap22.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate41, predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate41, predicate54);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate54);
        collections.Transformer transformer58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate(map57, transformer58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) 0L, (java.lang.Object) (byte) 1);
        java.lang.String str17 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        collections.Predicate predicate22 = filterIterator18.getPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b24 = defaultedMap1.equals((java.lang.Object) filterIterator23);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{0=1}" + "'", str17.equals("{0=1}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        int i26 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = defaultedMap42.get((java.lang.Object) defaultedMap48);
        java.lang.Object obj52 = null;
        java.lang.Object obj53 = defaultedMap42.get(obj52);
        java.lang.Object obj56 = defaultedMap42.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap42.equals(obj57);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj62 = defaultedMap60.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap60.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj69 = defaultedMap60.get((java.lang.Object) defaultedMap66);
        boolean b71 = defaultedMap66.containsKey((java.lang.Object) (short) -1);
        boolean b72 = defaultedMap42.equals((java.lang.Object) (short) -1);
        defaultedMap37.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj79 = defaultedMap75.get((java.lang.Object) ' ');
        java.util.Set set80 = defaultedMap75.entrySet();
        boolean b81 = defaultedMap75.isEmpty();
        java.util.Set set82 = defaultedMap75.keySet();
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) defaultedMap75);
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj87 = defaultedMap85.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj89 = defaultedMap85.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj93 = defaultedMap91.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj94 = defaultedMap85.get((java.lang.Object) defaultedMap91);
        boolean b95 = defaultedMap75.containsValue((java.lang.Object) defaultedMap85);
        boolean b96 = defaultedMap28.containsKey((java.lang.Object) b95);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0 + "'", obj69.equals(0));
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + 0 + "'", obj79.equals(0));
        org.junit.Assert.assertNotNull(set80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 0 + "'", obj89.equals(0));
        org.junit.Assert.assertNull(obj93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + 0 + "'", obj94.equals(0));
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(b96 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj7 = defaultedMap3.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap3.get((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap3.containsKey(obj13);
        java.lang.String str15 = defaultedMap3.toString();
        java.lang.Object obj17 = defaultedMap3.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap19.entrySet();
        boolean b25 = defaultedMap19.isEmpty();
        java.util.Collection collection26 = defaultedMap19.values();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        defaultedMap19.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        boolean b42 = defaultedMap37.containsKey((java.lang.Object) (short) -1);
        int i43 = defaultedMap37.size();
        java.util.Set set44 = defaultedMap37.keySet();
        java.lang.Object obj45 = defaultedMap19.get((java.lang.Object) defaultedMap37);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = filterIterator46.getPredicate();
        collections.Predicate predicate50 = filterIterator46.getPredicate();
        java.lang.Object obj51 = defaultedMap37.get((java.lang.Object) predicate50);
        filterIterator0.setPredicate(predicate50);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 0 + "'", obj45.equals(0));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap18.containsKey(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap31.equals(obj46);
        boolean b48 = defaultedMap18.containsKey((java.lang.Object) defaultedMap31);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate49, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate49);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 1);
        boolean b66 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate67, predicate68);
        filterIterator13.setPredicate(predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) (byte) 1);
        boolean b76 = defaultedMap72.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate77, predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate78);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        collections.Predicate predicate84 = filterIterator81.getPredicate();
        filterIterator80.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator3, predicate84);
        filterIterator2.setIterator((java.util.Iterator) filterIterator87);
        try {
            filterIterator87.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        java.lang.Object obj24 = defaultedMap1.put((java.lang.Object) predicate20, (java.lang.Object) 10L);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) (byte) 1);
        boolean b7 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate8 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate8, predicate9);
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj20 = defaultedMap13.remove((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = null;
        boolean b41 = defaultedMap30.containsKey(obj40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = null;
        java.lang.Object obj54 = defaultedMap43.get(obj53);
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj58 = null;
        boolean b59 = defaultedMap43.equals(obj58);
        boolean b60 = defaultedMap30.containsKey((java.lang.Object) defaultedMap43);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) (byte) 1);
        boolean b67 = defaultedMap63.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate68, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate61, predicate69);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate61);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate61);
        filterIterator16.setIterator((java.util.Iterator) filterIterator73);
        boolean b75 = defaultedMap1.equals((java.lang.Object) filterIterator73);
        java.lang.String str76 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) (byte) 1);
        java.lang.String str81 = defaultedMap78.toString();
        boolean b82 = defaultedMap1.containsValue((java.lang.Object) str81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj86 = defaultedMap84.remove((java.lang.Object) (byte) 1);
        boolean b88 = defaultedMap84.containsKey((java.lang.Object) (-1L));
        boolean b90 = defaultedMap84.containsValue((java.lang.Object) 10);
        boolean b91 = defaultedMap84.isEmpty();
        java.lang.Object obj92 = defaultedMap1.get((java.lang.Object) defaultedMap84);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 0 + "'", obj54.equals(0));
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNull(obj86);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b90 == false);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 0 + "'", obj92.equals(0));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10);
        java.util.Collection collection8 = defaultedMap1.values();
        boolean b9 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap11.get((java.lang.Object) defaultedMap17);
        java.lang.Object obj21 = null;
        boolean b22 = defaultedMap11.containsKey(obj21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap25.get((java.lang.Object) defaultedMap31);
        int i35 = defaultedMap31.size();
        java.util.Set set36 = defaultedMap31.keySet();
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) 1);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        java.lang.Object obj43 = defaultedMap1.put((java.lang.Object) 1, (java.lang.Object) filterIterator41);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set6 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj28 = defaultedMap19.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap19.get(obj29);
        java.lang.Object obj33 = defaultedMap19.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj34 = null;
        boolean b35 = defaultedMap19.equals(obj34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj46 = defaultedMap37.get((java.lang.Object) defaultedMap43);
        boolean b48 = defaultedMap43.containsKey((java.lang.Object) (short) -1);
        boolean b49 = defaultedMap19.equals((java.lang.Object) (short) -1);
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) ' ');
        java.util.Set set57 = defaultedMap52.entrySet();
        boolean b58 = defaultedMap52.isEmpty();
        java.util.Set set59 = defaultedMap52.keySet();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap52);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj66 = defaultedMap62.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj71 = defaultedMap62.get((java.lang.Object) defaultedMap68);
        java.lang.Object obj72 = defaultedMap14.get(obj71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj78 = defaultedMap74.get((java.lang.Object) ' ');
        java.util.Set set79 = defaultedMap74.entrySet();
        collections.Predicate predicate80 = null;
        collections.Predicate predicate81 = null;
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate80, predicate81);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection85 = defaultedMap84.values();
        int i86 = defaultedMap84.size();
        defaultedMap74.putAll((java.util.Map) defaultedMap84);
        defaultedMap14.putAll((java.util.Map) defaultedMap84);
        java.util.Set set89 = defaultedMap84.entrySet();
        java.lang.Object obj90 = defaultedMap1.get((java.lang.Object) set89);
        java.util.Set set91 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0 + "'", obj46.equals(0));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertNotNull(set59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0 + "'", obj66.equals(0));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0 + "'", obj71.equals(0));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0 + "'", obj72.equals(0));
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + 0 + "'", obj78.equals(0));
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertTrue(i86 == 0);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0 + "'", obj90.equals(0));
        org.junit.Assert.assertNotNull(set91);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap55.get((java.lang.Object) defaultedMap61);
        boolean b65 = defaultedMap45.containsValue((java.lang.Object) defaultedMap55);
        java.util.Set set66 = defaultedMap55.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator8.setPredicate(predicate9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate12 = filterIterator8.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap18.containsKey(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap31.equals(obj46);
        boolean b48 = defaultedMap18.containsKey((java.lang.Object) defaultedMap31);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate49, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate49);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 1);
        boolean b66 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate67, predicate68);
        filterIterator13.setPredicate(predicate68);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) (byte) 1);
        boolean b76 = defaultedMap72.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate77 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate77, predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate78);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        collections.Predicate predicate84 = filterIterator81.getPredicate();
        filterIterator80.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator3, predicate84);
        filterIterator2.setIterator((java.util.Iterator) filterIterator87);
        try {
            boolean b89 = filterIterator2.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        java.lang.String str13 = defaultedMap1.toString();
        java.lang.Object obj15 = defaultedMap1.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        java.util.Set set22 = defaultedMap17.entrySet();
        boolean b23 = defaultedMap17.isEmpty();
        java.util.Collection collection24 = defaultedMap17.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap17);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap17);
        java.lang.Object obj28 = defaultedMap17.get((java.lang.Object) 100);
        int i29 = defaultedMap17.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator4.setIterator((java.util.Iterator) filterIterator12);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        java.util.Set set15 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap17.get((java.lang.Object) defaultedMap23);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap17.containsKey(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = null;
        java.lang.Object obj41 = defaultedMap30.get(obj40);
        java.lang.Object obj44 = defaultedMap30.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap30.equals(obj45);
        boolean b47 = defaultedMap17.containsKey((java.lang.Object) defaultedMap30);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        boolean b54 = defaultedMap50.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate48, predicate56);
        java.lang.Object obj59 = defaultedMap10.get((java.lang.Object) predicate56);
        filterIterator4.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate62);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNotNull(predicate62);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj59 = defaultedMap55.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj64 = defaultedMap55.get((java.lang.Object) defaultedMap61);
        java.lang.Object obj65 = defaultedMap7.get(obj64);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj76 = defaultedMap67.get((java.lang.Object) defaultedMap73);
        java.lang.Object obj77 = null;
        boolean b78 = defaultedMap67.containsKey(obj77);
        java.lang.String str79 = defaultedMap67.toString();
        java.lang.Object obj81 = defaultedMap67.remove((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj85 = defaultedMap83.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj87 = defaultedMap83.get((java.lang.Object) ' ');
        java.util.Set set88 = defaultedMap83.entrySet();
        boolean b89 = defaultedMap83.isEmpty();
        java.util.Collection collection90 = defaultedMap83.values();
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) defaultedMap83);
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap83);
        java.lang.Object obj94 = defaultedMap83.get((java.lang.Object) 100);
        java.lang.Object obj95 = defaultedMap7.remove((java.lang.Object) 100);
        defaultedMap7.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0 + "'", obj59.equals(0));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + 0 + "'", obj64.equals(0));
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0 + "'", obj65.equals(0));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 0 + "'", obj71.equals(0));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + 0 + "'", obj76.equals(0));
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 0 + "'", obj87.equals(0));
        org.junit.Assert.assertNotNull(set88);
        org.junit.Assert.assertTrue(b89 == true);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + 0 + "'", obj94.equals(0));
        org.junit.Assert.assertNull(obj95);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        int i9 = defaultedMap1.size();
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (short) 0, (java.lang.Object) collection12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj24 = defaultedMap15.get((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap26.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap26.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = null;
        java.lang.Object obj37 = defaultedMap26.get(obj36);
        java.lang.Object obj40 = defaultedMap26.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj41 = null;
        boolean b42 = defaultedMap26.equals(obj41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj53 = defaultedMap44.get((java.lang.Object) defaultedMap50);
        boolean b55 = defaultedMap50.containsKey((java.lang.Object) (short) -1);
        boolean b56 = defaultedMap26.equals((java.lang.Object) (short) -1);
        defaultedMap21.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap21);
        boolean b60 = defaultedMap21.equals((java.lang.Object) 100L);
        java.lang.String str61 = defaultedMap21.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0 + "'", obj24.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0 + "'", obj53.equals(0));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{100.0=0}" + "'", str61.equals("{100.0=0}"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate64);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) (byte) 1);
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate74, predicate75);
        filterIterator67.setPredicate(predicate75);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate78);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate78);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        boolean b13 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) ' ');
        java.util.Set set20 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj33 = defaultedMap22.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        boolean b39 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) (byte) 1);
        boolean b48 = defaultedMap44.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate49, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate41, predicate49);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate41, predicate54);
        java.lang.Object obj57 = defaultedMap1.remove((java.lang.Object) predicate54);
        defaultedMap1.clear();
        java.util.Collection collection59 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection59);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        boolean b51 = defaultedMap45.isEmpty();
        java.util.Set set52 = defaultedMap45.keySet();
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap45);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = filterIterator56.getPredicate();
        boolean b59 = defaultedMap7.containsValue((java.lang.Object) predicate58);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        boolean b12 = defaultedMap1.containsKey(obj11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        java.lang.Object obj25 = defaultedMap14.get(obj24);
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap14.equals(obj29);
        boolean b31 = defaultedMap1.containsKey((java.lang.Object) defaultedMap14);
        java.util.Set set32 = defaultedMap14.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = defaultedMap1.get(obj18);
        java.lang.String str20 = defaultedMap1.toString();
        java.util.Collection collection21 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(collection21);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap18.containsKey(obj28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        java.lang.Object obj45 = defaultedMap31.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap31.equals(obj46);
        boolean b48 = defaultedMap18.containsKey((java.lang.Object) defaultedMap31);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) (byte) 1);
        boolean b55 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate56, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate49, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate49);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate49);
        filterIterator4.setIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = filterIterator63.getPredicate();
        collections.Predicate predicate67 = filterIterator63.getPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj77 = defaultedMap73.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj81 = defaultedMap79.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj82 = defaultedMap73.get((java.lang.Object) defaultedMap79);
        java.lang.Object obj83 = null;
        boolean b84 = defaultedMap73.containsKey(obj83);
        java.lang.String str85 = defaultedMap73.toString();
        defaultedMap73.clear();
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        filterIterator87.setPredicate(predicate88);
        boolean b90 = defaultedMap73.equals((java.lang.Object) predicate88);
        filterIterator71.setPredicate(predicate88);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate88);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator92);
        filterIterator61.setIterator((java.util.Iterator) filterIterator92);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0 + "'", obj77.equals(0));
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + 0 + "'", obj82.equals(0));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + str85 + "' != '" + "{}" + "'", str85.equals("{}"));
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.get(obj37);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap27.equals(obj42);
        boolean b44 = defaultedMap14.containsKey((java.lang.Object) defaultedMap27);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate45, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        filterIterator9.setPredicate(predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        filterIterator76.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate80);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate84);
        filterIterator82.setPredicate(predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) ' ');
        java.util.Set set11 = defaultedMap6.entrySet();
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate12, predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        java.util.Collection collection21 = defaultedMap16.values();
        boolean b22 = defaultedMap6.equals((java.lang.Object) defaultedMap16);
        boolean b23 = defaultedMap3.equals((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.get(obj37);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap27.equals(obj42);
        boolean b44 = defaultedMap14.containsKey((java.lang.Object) defaultedMap27);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate45, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        filterIterator9.setPredicate(predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        filterIterator76.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate80);
        java.util.Iterator iterator83 = filterIterator82.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(iterator83);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator69 = filterIterator0.getIterator();
        java.util.Iterator iterator70 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNull(iterator70);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj19 = defaultedMap10.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj20 = null;
        boolean b21 = defaultedMap10.containsKey(obj20);
        java.lang.String str22 = defaultedMap10.toString();
        defaultedMap10.clear();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate25);
        boolean b27 = defaultedMap10.equals((java.lang.Object) predicate25);
        filterIterator8.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj35 = defaultedMap31.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) defaultedMap37);
        java.lang.Object obj41 = null;
        java.lang.Object obj42 = defaultedMap31.get(obj41);
        boolean b43 = defaultedMap31.isEmpty();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) ' ');
        java.util.Set set50 = defaultedMap45.entrySet();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = defaultedMap52.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj63 = defaultedMap52.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) (byte) 1);
        boolean b69 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) (byte) 1);
        boolean b78 = defaultedMap74.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate79, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate71, predicate79);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate71, predicate84);
        java.lang.Object obj87 = defaultedMap31.remove((java.lang.Object) predicate84);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate84);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0 + "'", obj35.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0 + "'", obj40.equals(0));
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNull(obj87);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set6 = defaultedMap1.keySet();
        java.util.Set set7 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap9.get((java.lang.Object) defaultedMap15);
        boolean b20 = defaultedMap15.containsKey((java.lang.Object) (short) -1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        boolean b33 = defaultedMap22.containsKey(obj32);
        java.lang.Object obj34 = defaultedMap15.get((java.lang.Object) b33);
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj41 = defaultedMap37.get((java.lang.Object) ' ');
        java.util.Set set42 = defaultedMap37.entrySet();
        collections.Predicate predicate43 = null;
        collections.Predicate predicate44 = null;
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate43, predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection48 = defaultedMap47.values();
        int i49 = defaultedMap47.size();
        defaultedMap37.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj61 = defaultedMap52.get((java.lang.Object) defaultedMap58);
        java.lang.Object obj62 = null;
        boolean b63 = defaultedMap52.containsKey(obj62);
        java.lang.String str64 = defaultedMap52.toString();
        defaultedMap52.clear();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate67);
        boolean b69 = defaultedMap52.equals((java.lang.Object) predicate67);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate67, predicate70);
        java.lang.Object obj73 = defaultedMap37.get((java.lang.Object) '#');
        boolean b74 = defaultedMap15.equals((java.lang.Object) defaultedMap37);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj80 = defaultedMap76.get((java.lang.Object) ' ');
        java.util.Set set81 = defaultedMap76.entrySet();
        collections.Predicate predicate82 = null;
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate82, predicate83);
        collections.map.DefaultedMap defaultedMap86 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj88 = defaultedMap86.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj90 = defaultedMap86.get((java.lang.Object) ' ');
        java.util.Collection collection91 = defaultedMap86.values();
        boolean b92 = defaultedMap76.equals((java.lang.Object) defaultedMap86);
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap86);
        java.lang.Object obj94 = defaultedMap1.remove((java.lang.Object) defaultedMap15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 0 + "'", obj56.equals(0));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0 + "'", obj73.equals(0));
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 0 + "'", obj80.equals(0));
        org.junit.Assert.assertNotNull(set81);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + 0 + "'", obj90.equals(0));
        org.junit.Assert.assertNotNull(collection91);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        java.lang.Object obj19 = defaultedMap8.get(obj18);
        java.lang.Object obj22 = defaultedMap8.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap8.equals(obj23);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) b24);
        int i26 = defaultedMap1.size();
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) (byte) 0);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 0 + "'", obj19.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj14 = defaultedMap5.get((java.lang.Object) defaultedMap11);
        java.lang.Object obj15 = null;
        boolean b16 = defaultedMap5.containsKey(obj15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj27 = defaultedMap18.get((java.lang.Object) defaultedMap24);
        java.lang.Object obj28 = null;
        java.lang.Object obj29 = defaultedMap18.get(obj28);
        java.lang.Object obj32 = defaultedMap18.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj33 = null;
        boolean b34 = defaultedMap18.equals(obj33);
        boolean b35 = defaultedMap5.containsKey((java.lang.Object) defaultedMap18);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) (byte) 1);
        boolean b42 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        boolean b53 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate54, predicate55);
        filterIterator0.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) (byte) 1);
        boolean b63 = defaultedMap59.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate64);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0 + "'", obj29.equals(0));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) defaultedMap18);
        java.lang.Object obj22 = null;
        java.lang.Object obj23 = defaultedMap12.get(obj22);
        java.lang.Object obj26 = defaultedMap12.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj27 = null;
        boolean b28 = defaultedMap12.equals(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj39 = defaultedMap30.get((java.lang.Object) defaultedMap36);
        boolean b41 = defaultedMap36.containsKey((java.lang.Object) (short) -1);
        boolean b42 = defaultedMap12.equals((java.lang.Object) (short) -1);
        defaultedMap7.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        java.util.Set set45 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj51 = defaultedMap47.get((java.lang.Object) ' ');
        java.util.Set set52 = defaultedMap47.entrySet();
        collections.Predicate predicate53 = null;
        collections.Predicate predicate54 = null;
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate53, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection58 = defaultedMap57.values();
        int i59 = defaultedMap57.size();
        defaultedMap47.putAll((java.util.Map) defaultedMap57);
        java.lang.Object obj61 = defaultedMap12.get((java.lang.Object) defaultedMap57);
        java.lang.String str62 = defaultedMap12.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0 + "'", obj16.equals(0));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue(i59 == 0);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 0 + "'", obj61.equals(0));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection12 = defaultedMap11.values();
        int i13 = defaultedMap11.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) defaultedMap22);
        java.lang.Object obj26 = null;
        boolean b27 = defaultedMap16.containsKey(obj26);
        java.lang.String str28 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate31);
        boolean b33 = defaultedMap16.equals((java.lang.Object) predicate31);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate31, predicate34);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) '#');
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        java.lang.Object obj12 = defaultedMap1.get(obj11);
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj16 = null;
        boolean b17 = defaultedMap1.equals(obj16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) ' ');
        java.util.Set set24 = defaultedMap19.entrySet();
        boolean b25 = defaultedMap19.isEmpty();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) b25);
        java.util.Set set27 = defaultedMap1.keySet();
        java.util.Set set28 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj17 = defaultedMap8.get((java.lang.Object) defaultedMap14);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap8.containsKey(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj30 = defaultedMap21.get((java.lang.Object) defaultedMap27);
        java.lang.Object obj31 = null;
        java.lang.Object obj32 = defaultedMap21.get(obj31);
        java.lang.Object obj35 = defaultedMap21.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj36 = null;
        boolean b37 = defaultedMap21.equals(obj36);
        boolean b38 = defaultedMap8.containsKey((java.lang.Object) defaultedMap21);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) (byte) 1);
        boolean b45 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate46, predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate39, predicate47);
        java.lang.Object obj50 = defaultedMap1.get((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 0.0f);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        filterIterator55.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        java.lang.Object obj59 = defaultedMap52.remove((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.Predicate predicate63 = filterIterator60.getPredicate();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) predicate63);
        filterIterator55.setPredicate(predicate63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        boolean b68 = defaultedMap1.containsValue((java.lang.Object) filterIterator67);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 0 + "'", obj30.equals(0));
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0 + "'", obj32.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 0 + "'", obj50.equals(0));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate5);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate8 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj23 = defaultedMap14.get((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = null;
        boolean b25 = defaultedMap14.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj36 = defaultedMap27.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = null;
        java.lang.Object obj38 = defaultedMap27.get(obj37);
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj42 = null;
        boolean b43 = defaultedMap27.equals(obj42);
        boolean b44 = defaultedMap14.containsKey((java.lang.Object) defaultedMap27);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) (byte) 1);
        boolean b51 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate45, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate45);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        boolean b62 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate63, predicate64);
        filterIterator9.setPredicate(predicate64);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) (byte) 1);
        boolean b72 = defaultedMap68.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        java.util.Map map75 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate73, predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = filterIterator77.getPredicate();
        filterIterator76.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate80);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82, predicate84);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 0 + "'", obj36.equals(0));
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj13 = defaultedMap9.get((java.lang.Object) ' ');
        java.util.Set set14 = defaultedMap9.entrySet();
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate16);
        java.lang.String str18 = defaultedMap9.toString();
        java.lang.Object obj20 = defaultedMap9.get((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj31 = defaultedMap22.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = null;
        java.lang.Object obj33 = defaultedMap22.get(obj32);
        java.lang.Object obj36 = defaultedMap22.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap9.remove((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj45 = defaultedMap43.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj47 = defaultedMap43.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj52 = defaultedMap43.get((java.lang.Object) defaultedMap49);
        java.lang.Object obj53 = null;
        boolean b54 = defaultedMap43.containsKey(obj53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj60 = defaultedMap56.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj65 = defaultedMap56.get((java.lang.Object) defaultedMap62);
        java.lang.Object obj66 = null;
        java.lang.Object obj67 = defaultedMap56.get(obj66);
        java.lang.Object obj70 = defaultedMap56.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj71 = null;
        boolean b72 = defaultedMap56.equals(obj71);
        boolean b73 = defaultedMap43.containsKey((java.lang.Object) defaultedMap56);
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) (byte) 1);
        boolean b80 = defaultedMap76.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate81, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate74, predicate82);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate74);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) filterIterator38);
        collections.Predicate predicate87 = filterIterator38.getPredicate();
        java.lang.Object obj88 = defaultedMap1.remove((java.lang.Object) filterIterator38);
        java.util.Iterator iterator89 = null;
        filterIterator38.setIterator(iterator89);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 0 + "'", obj47.equals(0));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0 + "'", obj52.equals(0));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 0 + "'", obj60.equals(0));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 0 + "'", obj65.equals(0));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0 + "'", obj67.equals(0));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNull(obj88);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) 100.0d);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) (byte) 1);
        boolean b19 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.util.Collection collection26 = defaultedMap25.values();
        java.lang.Object obj27 = defaultedMap15.put((java.lang.Object) (short) 0, (java.lang.Object) collection26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj38 = defaultedMap29.get((java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj49 = defaultedMap40.get((java.lang.Object) defaultedMap46);
        java.lang.Object obj50 = null;
        java.lang.Object obj51 = defaultedMap40.get(obj50);
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) 100.0f, (java.lang.Object) 0);
        java.lang.Object obj55 = null;
        boolean b56 = defaultedMap40.equals(obj55);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj60 = defaultedMap58.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj62 = defaultedMap58.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) (byte) 1);
        java.lang.Object obj67 = defaultedMap58.get((java.lang.Object) defaultedMap64);
        boolean b69 = defaultedMap64.containsKey((java.lang.Object) (short) -1);
        boolean b70 = defaultedMap40.equals((java.lang.Object) (short) -1);
        defaultedMap35.putAll((java.util.Map) defaultedMap40);
        defaultedMap15.putAll((java.util.Map) defaultedMap35);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.truePredicate();
        filterIterator73.setPredicate(predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj79 = defaultedMap77.remove((java.lang.Object) (byte) 1);
        boolean b81 = defaultedMap77.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate82, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate74, predicate83);
        java.lang.Object obj86 = defaultedMap1.remove((java.lang.Object) map85);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0 + "'", obj5.equals(0));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0 + "'", obj38.equals(0));
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0 + "'", obj49.equals(0));
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 0 + "'", obj62.equals(0));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 0 + "'", obj67.equals(0));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
    }
}

