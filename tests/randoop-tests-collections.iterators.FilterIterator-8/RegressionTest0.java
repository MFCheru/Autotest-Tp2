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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            boolean b2 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        try {
            filterIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.lang.Object obj4 = defaultedMap2.remove((java.lang.Object) 10L);
        boolean b6 = defaultedMap2.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator7, predicate11);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator14, predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate11, predicate16);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 10L);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator25, predicate29);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator32, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate29, predicate34);
        try {
            java.util.Map map37 = collections.map.PredicatedMap.decorate(map0, predicate11, predicate34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Factory factory17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map2 = null;
        try {
            defaultedMap1.putAll(map2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
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
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) filterIterator8);
        try {
            boolean b12 = filterIterator8.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Predicate predicate17 = null;
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 10L);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator32, predicate36);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate36, predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate41);
        defaultedMap1.clear();
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        boolean b22 = defaultedMap5.isEmpty();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) true);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        boolean b9 = defaultedMap1.isEmpty();
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        try {
            java.lang.Object obj8 = filterIterator7.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        collections.Predicate predicate16 = filterIterator12.getPredicate();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator17, predicate21);
        filterIterator12.setPredicate(predicate21);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 10L);
        boolean b29 = defaultedMap26.isEmpty();
        java.util.Set set30 = defaultedMap26.keySet();
        java.util.Set set31 = defaultedMap26.keySet();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 10L);
        boolean b36 = defaultedMap26.equals((java.lang.Object) 10L);
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) defaultedMap26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        try {
            boolean b7 = filterIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        boolean b22 = defaultedMap5.isEmpty();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap25.isEmpty();
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj31 = defaultedMap5.get(obj30);
        collections.Factory factory32 = null;
        try {
            java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, factory32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        boolean b22 = defaultedMap5.isEmpty();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap25.isEmpty();
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) (byte) 100);
        java.lang.Object obj31 = defaultedMap5.get(obj30);
        java.util.Set set32 = defaultedMap5.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(set32);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        boolean b17 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator9, predicate13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate13);
        try {
            boolean b22 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator13, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate15);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) 1L);
        int i20 = defaultedMap1.size();
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator7, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate11);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate(map14, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        try {
            java.lang.Object obj5 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator10);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 10L);
        boolean b17 = defaultedMap14.isEmpty();
        java.util.Set set18 = defaultedMap14.keySet();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 10L);
        boolean b24 = defaultedMap20.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator25, predicate29);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator32, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate29, predicate34);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 10L);
        boolean b42 = defaultedMap38.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator45, predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator43, predicate47);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator50, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate47, predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate52);
        boolean b56 = defaultedMap1.equals((java.lang.Object) predicate52);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator4, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator3.setIterator((java.util.Iterator) filterIterator10);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator10);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        try {
            filterIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator8);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator10);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 1L);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 10L);
        boolean b20 = defaultedMap16.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 10L);
        boolean b25 = defaultedMap16.equals((java.lang.Object) defaultedMap22);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        try {
            java.lang.Object obj6 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Predicate predicate17 = null;
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate22);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        collections.Predicate predicate31 = filterIterator27.getPredicate();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator32, predicate36);
        filterIterator27.setPredicate(predicate36);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) filterIterator27);
        java.util.Iterator iterator41 = filterIterator27.getIterator();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator41);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        filterIterator1.setPredicate(predicate10);
        java.util.Iterator iterator14 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        try {
            boolean b16 = filterIterator15.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator14);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        boolean b11 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b11 = defaultedMap7.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator14, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator12, predicate16);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate16, predicate21);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b29 = defaultedMap25.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator32, predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator30, predicate34);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator37, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate34, predicate39);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate16, predicate39);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 10L);
        boolean b47 = defaultedMap44.isEmpty();
        java.util.Set set48 = defaultedMap44.keySet();
        java.util.Set set49 = defaultedMap44.keySet();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 10L);
        boolean b54 = defaultedMap44.equals((java.lang.Object) 10L);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 10L);
        boolean b59 = defaultedMap56.isEmpty();
        boolean b61 = defaultedMap56.equals((java.lang.Object) true);
        java.lang.Object obj62 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) true);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator9, predicate13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate13);
        try {
            java.lang.Object obj22 = filterIterator21.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        filterIterator3.setPredicate(predicate19);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        filterIterator3.setIterator(iterator23);
        try {
            boolean b26 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator9, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator7, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate11);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator17, predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator24, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate26);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) (short) 0);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Set set36 = defaultedMap32.keySet();
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) iterator37);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator42, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate44);
        boolean b47 = defaultedMap32.isEmpty();
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        collections.Predicate predicate53 = filterIterator49.getPredicate();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator56, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator54, predicate58);
        filterIterator49.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        java.lang.Object obj63 = defaultedMap32.get((java.lang.Object) filterIterator49);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 10L);
        boolean b68 = defaultedMap65.isEmpty();
        java.util.Set set69 = defaultedMap65.keySet();
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator70, predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) iterator70);
        boolean b75 = defaultedMap32.equals((java.lang.Object) map74);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) map74);
        boolean b77 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator13, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate15);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Predicate predicate17 = null;
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate22);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        collections.Predicate predicate29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate29);
        collections.Predicate predicate31 = filterIterator27.getPredicate();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator32, predicate36);
        filterIterator27.setPredicate(predicate36);
        java.lang.Object obj40 = defaultedMap1.get((java.lang.Object) filterIterator27);
        try {
            java.lang.Object obj41 = filterIterator27.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator18.getPredicate();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        filterIterator18.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) filterIterator18);
        try {
            java.lang.Object obj33 = filterIterator18.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
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
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 10.0f);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap7.isEmpty();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b15 = defaultedMap12.isEmpty();
        java.util.Set set16 = defaultedMap12.keySet();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) iterator17);
        java.lang.Object obj22 = defaultedMap7.remove((java.lang.Object) iterator17);
        collections.Predicate predicate23 = null;
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator24, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate23, predicate28);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 10L);
        boolean b40 = defaultedMap36.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator43, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator41, predicate45);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate45, predicate50);
        filterIterator33.setPredicate(predicate50);
        java.lang.Object obj54 = defaultedMap7.get((java.lang.Object) predicate50);
        filterIterator3.setPredicate(predicate50);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) true);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        boolean b9 = defaultedMap1.isEmpty();
        java.util.Collection collection10 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(collection10);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Predicate predicate17 = null;
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 10L);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator32, predicate36);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate36, predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate41);
        defaultedMap1.clear();
        int i46 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        try {
            boolean b4 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
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
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        filterIterator1.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator18.getPredicate();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        filterIterator18.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) filterIterator18);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 10L);
        boolean b37 = defaultedMap34.isEmpty();
        java.lang.Object obj39 = defaultedMap34.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap34.put((java.lang.Object) "", (java.lang.Object) predicate41);
        boolean b44 = defaultedMap34.containsValue((java.lang.Object) (byte) 10);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 10L);
        boolean b50 = defaultedMap46.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator53, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator51, predicate55);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator58, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate55, predicate60);
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator63, predicate65);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) 10L);
        boolean b72 = defaultedMap68.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        java.util.Iterator iterator75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator73, predicate77);
        java.util.Iterator iterator80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator80, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate77, predicate82);
        filterIterator66.setPredicate(predicate82);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate55, predicate86);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate55);
        collections.Predicate predicate90 = filterIterator89.getPredicate();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate90);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator10);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) 0);
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator17, predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator24, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate26);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) (short) 0);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Set set36 = defaultedMap32.keySet();
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) iterator37);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator42, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate44);
        boolean b47 = defaultedMap32.isEmpty();
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        collections.Predicate predicate53 = filterIterator49.getPredicate();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator56, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator54, predicate58);
        filterIterator49.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        java.lang.Object obj63 = defaultedMap32.get((java.lang.Object) filterIterator49);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 10L);
        boolean b68 = defaultedMap65.isEmpty();
        java.util.Set set69 = defaultedMap65.keySet();
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator70, predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) iterator70);
        boolean b75 = defaultedMap32.equals((java.lang.Object) map74);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) map74);
        collections.Factory factory77 = null;
        try {
            java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory77);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) predicate8);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b7 = defaultedMap4.isEmpty();
        boolean b9 = defaultedMap4.equals((java.lang.Object) true);
        boolean b11 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 10L);
        boolean b18 = defaultedMap15.isEmpty();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) (byte) 100);
        int i21 = defaultedMap15.size();
        java.util.Set set22 = defaultedMap15.entrySet();
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator18.getPredicate();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        filterIterator18.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) filterIterator18);
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Predicate predicate17 = null;
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 10L);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator32, predicate36);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate36, predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate41);
        defaultedMap1.clear();
        java.lang.String str46 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) predicate8);
        boolean b11 = defaultedMap1.containsValue((java.lang.Object) (byte) 10);
        int i12 = defaultedMap1.size();
        java.util.Set set13 = defaultedMap1.keySet();
        defaultedMap1.clear();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        collections.Predicate predicate18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        filterIterator3.setPredicate(predicate19);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate23);
        java.util.Iterator iterator25 = filterIterator3.getIterator();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 10L);
        boolean b30 = defaultedMap27.isEmpty();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj35 = defaultedMap27.put((java.lang.Object) "", (java.lang.Object) predicate34);
        boolean b37 = defaultedMap27.containsValue((java.lang.Object) (byte) 10);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 10L);
        boolean b43 = defaultedMap39.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator46, predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator44, predicate48);
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator51, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate48, predicate53);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator56, predicate58);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.Object obj63 = defaultedMap61.remove((java.lang.Object) 10L);
        boolean b65 = defaultedMap61.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator68, predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator66, predicate70);
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator73, predicate75);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap61, predicate70, predicate75);
        filterIterator59.setPredicate(predicate75);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate48, predicate79);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator25, predicate79);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map81);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator18.getPredicate();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        filterIterator18.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) filterIterator18);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 10L);
        boolean b37 = defaultedMap34.isEmpty();
        java.util.Set set38 = defaultedMap34.keySet();
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator39, predicate41);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) iterator39);
        boolean b44 = defaultedMap1.equals((java.lang.Object) map43);
        java.lang.String str45 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b7 = defaultedMap4.isEmpty();
        boolean b9 = defaultedMap4.equals((java.lang.Object) true);
        boolean b11 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 10L);
        boolean b18 = defaultedMap15.isEmpty();
        java.lang.Object obj20 = defaultedMap15.remove((java.lang.Object) (byte) 100);
        int i21 = defaultedMap15.size();
        java.util.Set set22 = defaultedMap15.entrySet();
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        java.util.Set set24 = defaultedMap15.keySet();
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        try {
            java.lang.Object obj7 = filterIterator6.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator9, predicate13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate13);
        try {
            filterIterator21.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj6);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map7);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b7 = defaultedMap4.isEmpty();
        boolean b9 = defaultedMap4.equals((java.lang.Object) true);
        boolean b11 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 10L);
        boolean b22 = defaultedMap18.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator30, predicate32);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate27, predicate32);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate27);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator36, predicate38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 10L);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator48, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator46, predicate50);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator53, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate50, predicate55);
        filterIterator39.setPredicate(predicate55);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        filterIterator39.setIterator(iterator59);
        java.lang.Object obj62 = defaultedMap4.put((java.lang.Object) filterIterator15, (java.lang.Object) filterIterator39);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) 10L);
        boolean b67 = defaultedMap64.isEmpty();
        java.lang.Object obj69 = defaultedMap64.get((java.lang.Object) 'a');
        java.util.Collection collection70 = defaultedMap64.values();
        java.lang.Object obj71 = defaultedMap4.get((java.lang.Object) collection70);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
        org.junit.Assert.assertNull(obj71);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator8 = filterIterator5.getIterator();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator8);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator10);
        java.util.Collection collection12 = defaultedMap1.values();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b16 = defaultedMap1.containsKey((java.lang.Object) 0);
        java.lang.String str17 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) true);
        boolean b8 = defaultedMap1.equals((java.lang.Object) (byte) 100);
        boolean b9 = defaultedMap1.isEmpty();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 10L);
        boolean b14 = defaultedMap11.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 10L);
        boolean b19 = defaultedMap16.isEmpty();
        java.util.Set set20 = defaultedMap16.keySet();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator21, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) iterator21);
        java.lang.Object obj26 = defaultedMap11.remove((java.lang.Object) iterator21);
        collections.Predicate predicate27 = null;
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator28, predicate32);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate27, predicate32);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 10L);
        boolean b41 = defaultedMap37.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator44, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator42, predicate46);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate46, predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) predicate51);
        defaultedMap11.clear();
        java.lang.Object obj56 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Collection collection60 = defaultedMap59.values();
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 10L);
        boolean b65 = defaultedMap62.isEmpty();
        boolean b67 = defaultedMap62.equals((java.lang.Object) true);
        boolean b69 = defaultedMap62.equals((java.lang.Object) (byte) 100);
        defaultedMap62.clear();
        defaultedMap59.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj72 = defaultedMap11.put((java.lang.Object) (byte) 0, (java.lang.Object) defaultedMap62);
        java.util.Set set73 = defaultedMap62.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(collection60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNotNull(set73);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate13);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.Predicate predicate20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator18.getPredicate();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        filterIterator18.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) filterIterator18);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 10L);
        boolean b37 = defaultedMap34.isEmpty();
        java.lang.Object obj39 = defaultedMap34.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap34.put((java.lang.Object) "", (java.lang.Object) predicate41);
        boolean b44 = defaultedMap34.containsValue((java.lang.Object) (byte) 10);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 10L);
        boolean b50 = defaultedMap46.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator53, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator51, predicate55);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator58, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate55, predicate60);
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator63, predicate65);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) 10L);
        boolean b72 = defaultedMap68.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        java.util.Iterator iterator75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator73, predicate77);
        java.util.Iterator iterator80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator80);
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator80, predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap68, predicate77, predicate82);
        filterIterator66.setPredicate(predicate82);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        filterIterator66.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate55, predicate86);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate55);
        java.util.Iterator iterator90 = filterIterator18.getIterator();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(iterator90);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        boolean b22 = defaultedMap5.isEmpty();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        int i24 = defaultedMap1.size();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) filterIterator26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 10L);
        boolean b12 = defaultedMap9.isEmpty();
        java.util.Set set13 = defaultedMap9.keySet();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator14, predicate16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) iterator14);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) predicate21);
        boolean b24 = defaultedMap9.isEmpty();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        collections.Predicate predicate30 = filterIterator26.getPredicate();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator31, predicate35);
        filterIterator26.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj40 = defaultedMap9.get((java.lang.Object) filterIterator26);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 10L);
        boolean b45 = defaultedMap42.isEmpty();
        java.lang.Object obj47 = defaultedMap42.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj50 = defaultedMap42.put((java.lang.Object) "", (java.lang.Object) predicate49);
        boolean b52 = defaultedMap42.containsValue((java.lang.Object) (byte) 10);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 10L);
        boolean b58 = defaultedMap54.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator59, predicate63);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator66, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate63, predicate68);
        java.util.Iterator iterator71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator71, predicate73);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) 10L);
        boolean b80 = defaultedMap76.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        java.util.Iterator iterator83 = null;
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator83, predicate85);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator81, predicate85);
        java.util.Iterator iterator88 = null;
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator(iterator88, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate85, predicate90);
        filterIterator74.setPredicate(predicate90);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        filterIterator74.setPredicate(predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate63, predicate94);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate63);
        java.lang.Object obj98 = defaultedMap1.get((java.lang.Object) filterIterator26);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNull(obj98);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5, predicate7);
        filterIterator1.setPredicate(predicate7);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator9, predicate13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate13);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        filterIterator26.setIterator((java.util.Iterator) filterIterator27);
        filterIterator1.setIterator((java.util.Iterator) filterIterator27);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(predicate24);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator17, predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator24, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate26);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) (short) 0);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Set set36 = defaultedMap32.keySet();
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) iterator37);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator42, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate44);
        boolean b47 = defaultedMap32.isEmpty();
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        collections.Predicate predicate53 = filterIterator49.getPredicate();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator56, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator54, predicate58);
        filterIterator49.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        java.lang.Object obj63 = defaultedMap32.get((java.lang.Object) filterIterator49);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 10L);
        boolean b68 = defaultedMap65.isEmpty();
        java.util.Set set69 = defaultedMap65.keySet();
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator70, predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) iterator70);
        boolean b75 = defaultedMap32.equals((java.lang.Object) map74);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) map74);
        java.lang.String str77 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator15, predicate19);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map10, predicate13, predicate22);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.util.Collection collection11 = defaultedMap7.values();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 10L);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate27);
        java.lang.Object obj30 = defaultedMap7.get((java.lang.Object) predicate27);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 10L);
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 'a');
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = defaultedMap9.get((java.lang.Object) filterIterator16);
        filterIterator6.setIterator((java.util.Iterator) filterIterator16);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        filterIterator1.setPredicate(predicate10);
        java.util.Iterator iterator14 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator16 = filterIterator1.getIterator();
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 10L);
        boolean b21 = defaultedMap18.isEmpty();
        java.util.Set set22 = defaultedMap18.keySet();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap24.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator31, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator29, predicate33);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator36, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate33, predicate38);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 10L);
        boolean b46 = defaultedMap42.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator49, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator47, predicate51);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator54, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate51, predicate56);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate33, predicate56);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate56);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) true);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 10L);
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) 'a');
        java.util.Collection collection15 = defaultedMap9.values();
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) collection15);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b15 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap12.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) "", (java.lang.Object) predicate19);
        boolean b22 = defaultedMap12.containsValue((java.lang.Object) (byte) 10);
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) b22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap25.isEmpty();
        java.util.Set set29 = defaultedMap25.keySet();
        java.util.Set set30 = defaultedMap25.keySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap25.equals((java.lang.Object) 10L);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 10L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) 10L);
        boolean b12 = defaultedMap1.isEmpty();
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator13, predicate15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        boolean b18 = defaultedMap1.equals((java.lang.Object) iterator17);
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str2 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 10L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) 10L);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 10L);
        boolean b16 = defaultedMap13.isEmpty();
        java.lang.Object obj18 = defaultedMap13.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        boolean b23 = defaultedMap13.equals((java.lang.Object) filterIterator22);
        java.util.Collection collection24 = defaultedMap13.values();
        java.lang.Object obj26 = defaultedMap13.get((java.lang.Object) 1L);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 10L);
        boolean b31 = defaultedMap28.isEmpty();
        java.util.Set set32 = defaultedMap28.keySet();
        java.util.Set set33 = defaultedMap28.keySet();
        boolean b34 = defaultedMap13.containsKey((java.lang.Object) defaultedMap28);
        java.util.Collection collection35 = defaultedMap13.values();
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(collection35);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        try {
            java.lang.Object obj13 = filterIterator8.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) "", (java.lang.Object) predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) predicate10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.String str13 = defaultedMap12.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
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
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        filterIterator4.setIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate13 = filterIterator9.getPredicate();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator14, predicate18);
        filterIterator9.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate27);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate27);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 10L);
        boolean b11 = defaultedMap1.equals((java.lang.Object) 10L);
        boolean b12 = defaultedMap1.isEmpty();
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 10L);
        boolean b18 = defaultedMap14.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator21, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator19, predicate23);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator26, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate23, predicate28);
        boolean b32 = defaultedMap14.containsValue((java.lang.Object) 1L);
        int i33 = defaultedMap14.size();
        java.lang.Object obj34 = defaultedMap1.remove((java.lang.Object) defaultedMap14);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(obj34);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) filterIterator8);
        java.util.Iterator iterator12 = filterIterator8.getIterator();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(iterator12);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b15 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap12.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) "", (java.lang.Object) predicate19);
        boolean b22 = defaultedMap12.containsValue((java.lang.Object) (byte) 10);
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) b22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap25.isEmpty();
        java.util.Set set29 = defaultedMap25.keySet();
        java.util.Set set30 = defaultedMap25.keySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap25.equals((java.lang.Object) 10L);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap25);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator37, predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 10L);
        boolean b46 = defaultedMap42.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator49, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator47, predicate51);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator54, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate51, predicate56);
        filterIterator40.setPredicate(predicate56);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate60);
        java.util.Iterator iterator62 = filterIterator40.getIterator();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        collections.Predicate predicate65 = filterIterator64.getPredicate();
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) 10L);
        boolean b71 = defaultedMap67.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator72 = null;
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator72);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator74, predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator72, predicate76);
        java.util.Iterator iterator79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator79);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator79, predicate81);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate76, predicate81);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate76);
        filterIterator40.setPredicate(predicate76);
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) predicate76);
        boolean b87 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b87 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) true);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 10L);
        boolean b13 = defaultedMap9.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 10L);
        boolean b18 = defaultedMap9.equals((java.lang.Object) defaultedMap15);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 10L);
        boolean b23 = defaultedMap20.isEmpty();
        java.lang.Object obj25 = defaultedMap20.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap20.put((java.lang.Object) "", (java.lang.Object) predicate27);
        boolean b30 = defaultedMap20.containsValue((java.lang.Object) (byte) 10);
        boolean b31 = defaultedMap15.containsValue((java.lang.Object) b30);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 10L);
        boolean b36 = defaultedMap33.isEmpty();
        java.util.Set set37 = defaultedMap33.keySet();
        java.util.Set set38 = defaultedMap33.keySet();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.Object obj42 = defaultedMap40.remove((java.lang.Object) 10L);
        boolean b43 = defaultedMap33.equals((java.lang.Object) 10L);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) defaultedMap33);
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 10L);
        boolean b50 = defaultedMap46.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 10L);
        boolean b55 = defaultedMap46.equals((java.lang.Object) defaultedMap52);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap15, (java.lang.Object) b55);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.String str11 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) filterIterator8);
        java.util.Set set12 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) filterIterator8);
        int i12 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator(iterator0);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 10L);
        boolean b14 = defaultedMap11.isEmpty();
        java.util.Set set15 = defaultedMap11.keySet();
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) iterator16);
        java.lang.Object obj21 = defaultedMap6.remove((java.lang.Object) iterator16);
        collections.Predicate predicate22 = null;
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator23, predicate27);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate22, predicate27);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator0, predicate27);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        boolean b6 = defaultedMap1.equals((java.lang.Object) true);
        java.util.Set set7 = defaultedMap1.entrySet();
        java.util.Set set8 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator13, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate15);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) 1L);
        int i20 = defaultedMap1.size();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate24);
        collections.Predicate predicate26 = filterIterator22.getPredicate();
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator29, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator27, predicate31);
        filterIterator22.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 10L);
        boolean b40 = defaultedMap37.isEmpty();
        java.util.Set set41 = defaultedMap37.keySet();
        java.util.Set set42 = defaultedMap37.keySet();
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 10L);
        boolean b47 = defaultedMap37.equals((java.lang.Object) 10L);
        boolean b48 = defaultedMap37.isEmpty();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 10L);
        boolean b54 = defaultedMap50.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator57, predicate59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator55, predicate59);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator62, predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate59, predicate64);
        boolean b68 = defaultedMap50.containsValue((java.lang.Object) 1L);
        int i69 = defaultedMap50.size();
        java.lang.Object obj70 = defaultedMap37.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj71 = defaultedMap1.put((java.lang.Object) filterIterator35, obj70);
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        java.lang.Object obj75 = defaultedMap73.remove((java.lang.Object) 10L);
        boolean b76 = defaultedMap73.isEmpty();
        boolean b78 = defaultedMap73.equals((java.lang.Object) true);
        boolean b80 = defaultedMap73.equals((java.lang.Object) (byte) 100);
        java.lang.Object obj81 = null;
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap(obj81);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) 10L);
        boolean b85 = defaultedMap82.isEmpty();
        java.lang.Object obj87 = defaultedMap82.remove((java.lang.Object) (byte) 100);
        int i88 = defaultedMap82.size();
        java.util.Set set89 = defaultedMap82.entrySet();
        java.lang.Object obj90 = defaultedMap73.get((java.lang.Object) set89);
        defaultedMap73.clear();
        boolean b92 = defaultedMap1.equals((java.lang.Object) defaultedMap73);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue(i69 == 0);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(i88 == 0);
        org.junit.Assert.assertNotNull(set89);
        org.junit.Assert.assertNull(obj90);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator0, predicate2);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        boolean b11 = defaultedMap1.equals((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 10L);
        boolean b17 = defaultedMap13.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator25, predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate27);
        boolean b30 = defaultedMap13.isEmpty();
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = filterIterator32.getPredicate();
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator36, predicate38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 10L);
        boolean b45 = defaultedMap41.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator48, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator46, predicate50);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator53, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate50, predicate55);
        filterIterator39.setPredicate(predicate55);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) predicate55);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate55);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator61, predicate63);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) 10L);
        boolean b70 = defaultedMap66.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator71);
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator73, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator71, predicate75);
        java.util.Iterator iterator78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator78, predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate75, predicate80);
        filterIterator64.setPredicate(predicate80);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate55, predicate80);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate80);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.lang.Object obj16 = defaultedMap1.remove((java.lang.Object) iterator11);
        collections.Predicate predicate17 = null;
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator20, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator18, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate22);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 10L);
        boolean b31 = defaultedMap27.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator34, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator32, predicate36);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate36, predicate41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate41);
        java.util.Set set45 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(set45);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator7, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator5, predicate9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) filterIterator11);
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        try {
            boolean b6 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        boolean b22 = defaultedMap5.isEmpty();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 10L);
        boolean b33 = defaultedMap29.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator36, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator34, predicate38);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator41, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate38, predicate43);
        boolean b46 = defaultedMap29.isEmpty();
        boolean b47 = defaultedMap25.equals((java.lang.Object) defaultedMap29);
        java.util.Set set48 = defaultedMap25.entrySet();
        boolean b49 = defaultedMap5.containsKey((java.lang.Object) set48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 10L);
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 10L);
        boolean b59 = defaultedMap55.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator62, predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator60, predicate64);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator67, predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate64, predicate69);
        boolean b72 = defaultedMap55.isEmpty();
        boolean b73 = defaultedMap51.equals((java.lang.Object) defaultedMap55);
        defaultedMap5.putAll((java.util.Map) defaultedMap51);
        java.lang.Object obj75 = null;
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap(obj75);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) 10L);
        boolean b80 = defaultedMap76.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        java.util.Iterator iterator83 = null;
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator83, predicate85);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator(iterator81, predicate85);
        java.util.Iterator iterator88 = null;
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator(iterator88, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate85, predicate90);
        java.util.Map map93 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) predicate85);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue(b72 == true);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.Predicate predicate12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate12);
        collections.Predicate predicate14 = filterIterator10.getPredicate();
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator15, predicate19);
        filterIterator10.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 10L);
        boolean b32 = defaultedMap28.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator35, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator33, predicate37);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator40, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate37, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate37);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate37);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate37);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator12, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator10, predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate14, predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        java.lang.Object obj25 = defaultedMap23.get((java.lang.Object) (byte) 1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) (byte) 100);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 10L);
        boolean b12 = defaultedMap9.isEmpty();
        java.lang.Object obj14 = defaultedMap9.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator15, predicate17);
        boolean b19 = defaultedMap9.equals((java.lang.Object) filterIterator18);
        java.util.Collection collection20 = defaultedMap9.values();
        java.lang.Object obj22 = defaultedMap9.get((java.lang.Object) 1L);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 10L);
        boolean b27 = defaultedMap24.isEmpty();
        java.util.Set set28 = defaultedMap24.keySet();
        java.util.Set set29 = defaultedMap24.keySet();
        boolean b30 = defaultedMap9.containsKey((java.lang.Object) defaultedMap24);
        int i31 = defaultedMap24.size();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        java.lang.Object obj35 = defaultedMap24.put((java.lang.Object) predicate32, (java.lang.Object) (byte) 0);
        java.lang.Object obj36 = defaultedMap1.remove(obj35);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator2, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator0, predicate4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.Predicate predicate11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate13 = filterIterator9.getPredicate();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator14, predicate18);
        filterIterator9.setPredicate(predicate18);
        java.util.Iterator iterator22 = filterIterator9.getIterator();
        collections.Predicate predicate23 = filterIterator9.getPredicate();
        filterIterator6.setIterator((java.util.Iterator) filterIterator9);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate23);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5, predicate7);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 10L);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator15, predicate19);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator22, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate24);
        filterIterator8.setPredicate(predicate24);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate24);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.util.Set set5 = defaultedMap1.keySet();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator6, predicate8);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) iterator6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (byte) 100);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator15, predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator13, predicate17);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 10L);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator28, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator26, predicate30);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator33, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate30, predicate35);
        java.lang.Object obj38 = defaultedMap1.put((java.lang.Object) iterator13, (java.lang.Object) predicate35);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b16 = defaultedMap12.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator17, predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator24, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate21, predicate26);
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) predicate21, (java.lang.Object) (short) 0);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap32.isEmpty();
        java.util.Set set36 = defaultedMap32.keySet();
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator37, predicate39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) iterator37);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator42, predicate44);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) predicate44);
        boolean b47 = defaultedMap32.isEmpty();
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        collections.Predicate predicate51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate51);
        collections.Predicate predicate53 = filterIterator49.getPredicate();
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator56, predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator54, predicate58);
        filterIterator49.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        java.lang.Object obj63 = defaultedMap32.get((java.lang.Object) filterIterator49);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 10L);
        boolean b68 = defaultedMap65.isEmpty();
        java.util.Set set69 = defaultedMap65.keySet();
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator70, predicate72);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) iterator70);
        boolean b75 = defaultedMap32.equals((java.lang.Object) map74);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) map74);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        java.lang.Object obj80 = defaultedMap78.remove((java.lang.Object) 10L);
        boolean b81 = defaultedMap78.isEmpty();
        java.util.Set set82 = defaultedMap78.keySet();
        java.util.Set set83 = defaultedMap78.keySet();
        java.lang.Object obj84 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap(obj84);
        java.lang.Object obj87 = defaultedMap85.remove((java.lang.Object) 10L);
        boolean b88 = defaultedMap78.equals((java.lang.Object) 10L);
        java.lang.Object obj89 = null;
        boolean b90 = defaultedMap78.equals(obj89);
        defaultedMap1.putAll((java.util.Map) defaultedMap78);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertNotNull(set69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue(b75 == true);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertNotNull(set82);
        org.junit.Assert.assertNotNull(set83);
        org.junit.Assert.assertNull(obj87);
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertTrue(b90 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Collection collection2 = defaultedMap1.values();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b7 = defaultedMap4.isEmpty();
        boolean b9 = defaultedMap4.equals((java.lang.Object) true);
        boolean b11 = defaultedMap4.equals((java.lang.Object) (byte) 100);
        defaultedMap4.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 10L);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 10L);
        boolean b23 = defaultedMap19.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator26, predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator24, predicate28);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator31, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate28, predicate33);
        boolean b36 = defaultedMap19.isEmpty();
        boolean b37 = defaultedMap15.equals((java.lang.Object) defaultedMap19);
        java.util.Set set38 = defaultedMap15.entrySet();
        java.util.Set set39 = defaultedMap15.keySet();
        defaultedMap4.putAll((java.util.Map) defaultedMap15);
        org.junit.Assert.assertNotNull(collection2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set39);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b4 = defaultedMap1.isEmpty();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 10L);
        boolean b9 = defaultedMap6.isEmpty();
        java.util.Set set10 = defaultedMap6.keySet();
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) iterator11);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) predicate18);
        boolean b21 = defaultedMap6.isEmpty();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 10L);
        boolean b27 = defaultedMap23.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator30, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator28, predicate32);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator35, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate32, predicate37);
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) b21, (java.lang.Object) predicate37);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        filterIterator1.setPredicate(predicate10);
        java.util.Iterator iterator14 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate16);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 10L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 10L);
        boolean b10 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 10L);
        boolean b15 = defaultedMap12.isEmpty();
        java.lang.Object obj17 = defaultedMap12.remove((java.lang.Object) (byte) 100);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap12.put((java.lang.Object) "", (java.lang.Object) predicate19);
        boolean b22 = defaultedMap12.containsValue((java.lang.Object) (byte) 10);
        boolean b23 = defaultedMap7.containsValue((java.lang.Object) b22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap25.isEmpty();
        java.util.Set set29 = defaultedMap25.keySet();
        java.util.Set set30 = defaultedMap25.keySet();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 10L);
        boolean b35 = defaultedMap25.equals((java.lang.Object) 10L);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) defaultedMap25);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 10L);
        boolean b41 = defaultedMap38.isEmpty();
        java.lang.Object obj43 = defaultedMap38.remove((java.lang.Object) (byte) 100);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator44, predicate46);
        boolean b48 = defaultedMap38.equals((java.lang.Object) filterIterator47);
        java.util.Collection collection49 = defaultedMap38.values();
        java.lang.Object obj51 = defaultedMap38.get((java.lang.Object) 1L);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 10L);
        boolean b56 = defaultedMap53.isEmpty();
        java.util.Set set57 = defaultedMap53.keySet();
        java.util.Set set58 = defaultedMap53.keySet();
        boolean b59 = defaultedMap38.containsKey((java.lang.Object) defaultedMap53);
        int i60 = defaultedMap53.size();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        java.lang.Object obj64 = defaultedMap53.put((java.lang.Object) predicate61, (java.lang.Object) (byte) 0);
        java.util.Iterator iterator65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator65);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator67, predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator65, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate61, predicate69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(set57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.Predicate predicate3 = null;
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator8, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator6, predicate10);
        filterIterator1.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator15, predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate19);
        try {
            boolean b23 = filterIterator22.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate19);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 10L);
        boolean b8 = defaultedMap4.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator11, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator9, predicate13);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator16, predicate18);
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate13, predicate18);
        filterIterator1.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate23 = filterIterator1.getPredicate();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 10L);
        boolean b28 = defaultedMap25.isEmpty();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 10L);
        boolean b33 = defaultedMap30.isEmpty();
        java.util.Set set34 = defaultedMap30.keySet();
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator35, predicate37);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) iterator35);
        java.lang.Object obj40 = defaultedMap25.remove((java.lang.Object) iterator35);
        collections.Predicate predicate41 = null;
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator44, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator42, predicate46);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate41, predicate46);
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 10L);
        boolean b58 = defaultedMap54.equals((java.lang.Object) (-1.0d));
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator59, predicate63);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator66, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate63, predicate68);
        filterIterator51.setPredicate(predicate68);
        java.lang.Object obj72 = defaultedMap25.get((java.lang.Object) predicate68);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate68);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj72);
    }
}

