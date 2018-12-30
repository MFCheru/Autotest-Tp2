import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Map map0 = null;
        java.lang.Object obj1 = new java.lang.Object();
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Map map0 = null;
        collections.Factory factory1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, factory1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) filterIterator7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(predicate1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = filterIterator0.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(predicate6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = filterIterator7.getIterator();
        org.junit.Assert.assertNull(iterator11);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        boolean b12 = defaultedMap6.containsValue((java.lang.Object) 0.0d);
        java.util.Collection collection13 = defaultedMap6.values();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(collection13);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate13);
        filterIterator6.setIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate16 = null;
        filterIterator14.setPredicate(predicate16);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) filterIterator4);
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(iterator9);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate7);
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        filterIterator3.setPredicate(predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate19);
        java.util.Map map21 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate16, predicate19);
        try {
            java.util.Map map22 = collections.map.PredicatedMap.decorate(map0, predicate9, predicate19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map21);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        filterIterator39.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator43);
        java.lang.Object obj45 = null;
        java.lang.Object obj46 = defaultedMap10.put((java.lang.Object) defaultedMap44, obj45);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate16 = filterIterator11.getPredicate();
        boolean b17 = defaultedMap3.containsKey((java.lang.Object) predicate16);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate4);
        try {
            java.util.Map map6 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b14 = defaultedMap1.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        defaultedMap1.clear();
        collections.Factory factory19 = null;
        try {
            java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        filterIterator6.setPredicate(predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator6);
        defaultedMap12.clear();
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        java.util.Set set11 = defaultedMap3.entrySet();
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) true);
        java.lang.Object obj17 = defaultedMap10.remove((java.lang.Object) (byte) -1);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        java.util.Set set20 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        boolean b38 = defaultedMap6.containsKey((java.lang.Object) 10);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate17);
        filterIterator14.setPredicate(predicate17);
        filterIterator7.setIterator((java.util.Iterator) filterIterator14);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(predicate17);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator3.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator14 = filterIterator9.getIterator();
        org.junit.Assert.assertNull(iterator14);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        int i20 = defaultedMap3.size();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate35);
        filterIterator32.setPredicate(predicate35);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) filterIterator43);
        java.util.Collection collection45 = defaultedMap1.values();
        int i46 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertTrue(i46 == 0);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        java.util.Set set11 = defaultedMap3.entrySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap13.toString();
        defaultedMap13.clear();
        java.lang.Object obj18 = defaultedMap3.remove((java.lang.Object) defaultedMap13);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Collection collection6 = defaultedMap3.values();
        java.util.Set set7 = defaultedMap3.keySet();
        java.util.Set set8 = defaultedMap3.entrySet();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator5);
        collections.Predicate predicate7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator5, predicate7);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator3.setIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator14 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.Predicate predicate20 = filterIterator18.getPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) filterIterator29);
        java.lang.Object obj34 = defaultedMap22.get((java.lang.Object) defaultedMap26);
        boolean b35 = defaultedMap22.isEmpty();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate36, predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate37);
        filterIterator3.setPredicate(predicate37);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        filterIterator12.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        filterIterator7.setIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate30);
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate41);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate32, predicate41);
        filterIterator7.setPredicate(predicate41);
        filterIterator3.setPredicate(predicate41);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0L + "'", obj22.equals(0L));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) filterIterator28);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Collection collection6 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate12, predicate15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Set set23 = defaultedMap21.entrySet();
        java.util.Collection collection24 = defaultedMap21.values();
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) collection24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        java.lang.Object obj27 = defaultedMap3.get((java.lang.Object) defaultedMap10);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        filterIterator21.setIterator((java.util.Iterator) filterIterator29);
        filterIterator12.setIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        boolean b45 = defaultedMap38.containsKey((java.lang.Object) filterIterator41);
        java.lang.Object obj46 = defaultedMap34.get((java.lang.Object) defaultedMap38);
        boolean b47 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        boolean b56 = defaultedMap49.containsKey((java.lang.Object) filterIterator52);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate59);
        collections.Predicate predicate61 = filterIterator60.getPredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap63.putAll((java.util.Map) defaultedMap65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate70);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate67, predicate70);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate61, predicate70);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) predicate61);
        filterIterator29.setPredicate(predicate61);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate7 = filterIterator4.getPredicate();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate22);
        java.lang.Object obj37 = defaultedMap1.put((java.lang.Object) filterIterator8, (java.lang.Object) (short) -1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.util.Set set20 = defaultedMap18.entrySet();
        java.lang.Object obj21 = defaultedMap14.get((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Set set22 = defaultedMap20.entrySet();
        java.util.Collection collection23 = defaultedMap20.values();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) collection23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        defaultedMap25.clear();
        java.lang.Object obj27 = defaultedMap1.remove((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b14 = defaultedMap1.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap1.equals(obj18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) true);
        java.lang.Object obj28 = defaultedMap21.remove((java.lang.Object) (byte) -1);
        int i29 = defaultedMap21.size();
        boolean b30 = defaultedMap21.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap21);
        boolean b32 = defaultedMap21.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(i29 == 0);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Collection collection6 = defaultedMap3.values();
        boolean b8 = defaultedMap3.containsValue((java.lang.Object) 1.0f);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        boolean b13 = defaultedMap3.equals((java.lang.Object) iterator12);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = filterIterator6.getPredicate();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate13 = filterIterator6.getPredicate();
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate13);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap1.toString();
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        boolean b37 = defaultedMap10.isEmpty();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == true);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        filterIterator3.setIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        filterIterator17.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.Predicate predicate23 = filterIterator21.getPredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate28);
        filterIterator21.setIterator((java.util.Iterator) filterIterator29);
        filterIterator12.setIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator32 = filterIterator12.getIterator();
        collections.Predicate predicate33 = filterIterator12.getPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        filterIterator12.setIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        filterIterator42.setIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        defaultedMap49.clear();
        defaultedMap49.clear();
        int i55 = defaultedMap49.size();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate58);
        collections.Predicate predicate60 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        filterIterator63.setIterator((java.util.Iterator) filterIterator64);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64);
        java.util.Iterator iterator68 = filterIterator67.getIterator();
        collections.Predicate predicate69 = filterIterator67.getPredicate();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj77 = defaultedMap75.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78);
        boolean b82 = defaultedMap75.containsKey((java.lang.Object) filterIterator78);
        java.lang.Object obj83 = defaultedMap71.get((java.lang.Object) defaultedMap75);
        boolean b84 = defaultedMap71.isEmpty();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate85, predicate86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate60, predicate86);
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate86);
        filterIterator34.setPredicate(predicate86);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNull(predicate69);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + 0L + "'", obj77.equals(0L));
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 0L + "'", obj83.equals(0L));
        org.junit.Assert.assertTrue(b84 == true);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap3.isEmpty();
        java.lang.Object obj16 = defaultedMap3.get((java.lang.Object) (short) 1);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator8.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) filterIterator9);
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) defaultedMap12);
        boolean b14 = defaultedMap12.isEmpty();
        java.util.Set set15 = defaultedMap12.entrySet();
        int i16 = defaultedMap12.size();
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap22.values();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 'a');
        java.lang.Object obj29 = defaultedMap22.get(obj28);
        java.util.Set set30 = defaultedMap22.entrySet();
        java.lang.Object obj31 = defaultedMap3.remove((java.lang.Object) set30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate37, predicate40);
        java.lang.Object obj43 = defaultedMap3.get((java.lang.Object) predicate40);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0L + "'", obj28.equals(0L));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 0L + "'", obj43.equals(0L));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        filterIterator39.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        filterIterator45.setIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        filterIterator40.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        filterIterator54.setIterator((java.util.Iterator) filterIterator55);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.Predicate predicate60 = filterIterator58.getPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate65);
        filterIterator58.setIterator((java.util.Iterator) filterIterator66);
        filterIterator49.setIterator((java.util.Iterator) filterIterator66);
        collections.Predicate predicate69 = filterIterator66.getPredicate();
        boolean b70 = defaultedMap10.containsValue((java.lang.Object) filterIterator66);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(iterator50);
        org.junit.Assert.assertNotNull(iterator59);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        java.util.Set set11 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        boolean b20 = defaultedMap18.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj21 = null;
        java.lang.Object obj22 = defaultedMap18.get(obj21);
        java.lang.Object obj24 = defaultedMap18.get((java.lang.Object) (-1));
        boolean b25 = defaultedMap3.containsValue(obj24);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        filterIterator2.setPredicate(predicate7);
        collections.Predicate predicate9 = filterIterator2.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate29);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) filterIterator24);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        java.lang.Object obj18 = defaultedMap6.get((java.lang.Object) defaultedMap10);
        boolean b19 = defaultedMap6.isEmpty();
        java.util.Set set20 = defaultedMap6.keySet();
        boolean b21 = defaultedMap1.containsValue((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap11.entrySet();
        java.util.Collection collection14 = defaultedMap11.values();
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) collection14);
        java.lang.String str16 = defaultedMap6.toString();
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        boolean b14 = defaultedMap7.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj15 = defaultedMap3.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = defaultedMap1.get(obj15);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        filterIterator20.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = filterIterator24.getPredicate();
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        filterIterator24.setIterator((java.util.Iterator) filterIterator32);
        boolean b34 = defaultedMap17.equals((java.lang.Object) filterIterator32);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0L + "'", obj15.equals(0L));
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 0L + "'", obj16.equals(0L));
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 'a');
        java.lang.Object obj10 = defaultedMap3.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        boolean b19 = defaultedMap12.containsKey((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate30, predicate33);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate24, predicate33);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        filterIterator39.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate46);
        filterIterator43.setPredicate(predicate46);
        java.lang.Object obj49 = defaultedMap12.get((java.lang.Object) filterIterator43);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.lang.Object obj55 = defaultedMap12.remove((java.lang.Object) filterIterator54);
        java.util.Collection collection56 = defaultedMap12.values();
        defaultedMap12.clear();
        boolean b58 = defaultedMap3.containsKey((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L + "'", obj9.equals(0L));
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0L + "'", obj10.equals(0L));
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(iterator44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 0L + "'", obj49.equals(0L));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        boolean b15 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b15 == true);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        defaultedMap1.clear();
        defaultedMap1.clear();
        int i7 = defaultedMap1.size();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate10);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.Predicate predicate21 = filterIterator19.getPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        boolean b34 = defaultedMap27.containsKey((java.lang.Object) filterIterator30);
        java.lang.Object obj35 = defaultedMap23.get((java.lang.Object) defaultedMap27);
        boolean b36 = defaultedMap23.isEmpty();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate37, predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate38);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate38);
        collections.Transformer transformer42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate(map41, transformer42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 0L + "'", obj35.equals(0L));
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = null;
        filterIterator3.setIterator(iterator5);
        collections.Predicate predicate7 = filterIterator3.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Set set25 = defaultedMap23.entrySet();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate27);
        java.lang.Object obj29 = defaultedMap23.get((java.lang.Object) filterIterator28);
        boolean b30 = defaultedMap23.isEmpty();
        defaultedMap23.clear();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap23);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate38, predicate41);
        java.lang.Object obj44 = defaultedMap23.get((java.lang.Object) predicate38);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0L + "'", obj44.equals(0L));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Collection collection17 = defaultedMap14.values();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) collection17);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        defaultedMap3.clear();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) predicate12);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b14 = defaultedMap1.isEmpty();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate15, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        filterIterator20.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) filterIterator24);
        java.util.Set set28 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(iterator25);
        org.junit.Assert.assertNotNull(iterator26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0L + "'", obj27.equals(0L));
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        boolean b17 = defaultedMap10.containsKey((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate20);
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate28, predicate31);
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate22, predicate31);
        java.lang.Object obj36 = defaultedMap6.put((java.lang.Object) defaultedMap10, (java.lang.Object) (byte) 100);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b42 = defaultedMap40.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        boolean b51 = defaultedMap44.containsKey((java.lang.Object) filterIterator47);
        java.lang.Object obj52 = defaultedMap40.get((java.lang.Object) defaultedMap44);
        java.lang.Object obj53 = defaultedMap38.get(obj52);
        boolean b54 = defaultedMap10.containsKey(obj53);
        int i55 = defaultedMap10.size();
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0L + "'", obj12.equals(0L));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 0L + "'", obj46.equals(0L));
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i55 == 0);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) iterator5);
        java.lang.String str7 = defaultedMap6.toString();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.lang.Object obj8 = defaultedMap1.remove((java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        boolean b23 = defaultedMap16.containsKey((java.lang.Object) filterIterator19);
        java.lang.Object obj24 = defaultedMap12.get((java.lang.Object) defaultedMap16);
        java.lang.Object obj25 = defaultedMap10.get(obj24);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj24);
        boolean b27 = defaultedMap1.containsKey(obj24);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator28);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0L + "'", obj18.equals(0L));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0L + "'", obj24.equals(0L));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0L + "'", obj25.equals(0L));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        boolean b14 = defaultedMap1.isEmpty();
        java.util.Set set15 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.Predicate predicate12 = filterIterator10.getPredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) filterIterator24);
        java.lang.Object obj29 = defaultedMap17.get((java.lang.Object) defaultedMap21);
        boolean b30 = defaultedMap17.isEmpty();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        collections.Predicate predicate37 = filterIterator34.getPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator39, predicate40);
        java.lang.Object obj42 = defaultedMap15.put((java.lang.Object) defaultedMap17, (java.lang.Object) iterator39);
        filterIterator0.setIterator(iterator39);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 0L + "'", obj29.equals(0L));
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(predicate37);
        org.junit.Assert.assertNotNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        java.lang.Object obj14 = defaultedMap3.put((java.lang.Object) iterator10, (java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate18 = filterIterator15.getPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate33);
        boolean b47 = defaultedMap3.containsValue((java.lang.Object) predicate33);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate11);
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate19, predicate22);
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        filterIterator28.setIterator((java.util.Iterator) filterIterator29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        boolean b34 = defaultedMap32.equals((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        boolean b43 = defaultedMap36.containsKey((java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate46);
        collections.Predicate predicate48 = filterIterator47.getPredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate54, predicate57);
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate48, predicate57);
        java.lang.Object obj62 = defaultedMap32.put((java.lang.Object) defaultedMap36, (java.lang.Object) (byte) 100);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        java.lang.Object obj68 = defaultedMap1.put(obj62, (java.lang.Object) filterIterator67);
        collections.Transformer transformer69 = null;
        try {
            java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 0L + "'", obj38.equals(0L));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 'a');
        java.util.Collection collection4 = defaultedMap1.values();
        int i5 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0L + "'", obj3.equals(0L));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        filterIterator7.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator8.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator22.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.Predicate predicate28 = filterIterator26.getPredicate();
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate33);
        filterIterator26.setIterator((java.util.Iterator) filterIterator34);
        filterIterator17.setIterator((java.util.Iterator) filterIterator34);
        java.util.Iterator iterator37 = filterIterator17.getIterator();
        filterIterator4.setIterator((java.util.Iterator) filterIterator17);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(iterator27);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(iterator37);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        filterIterator22.setPredicate(predicate25);
        filterIterator15.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator31.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        filterIterator37.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        filterIterator32.setIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        boolean b57 = defaultedMap50.containsKey((java.lang.Object) filterIterator53);
        java.lang.Object obj58 = defaultedMap46.get((java.lang.Object) defaultedMap50);
        boolean b59 = defaultedMap46.isEmpty();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate60, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate61);
        filterIterator15.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate67);
        filterIterator15.setIterator((java.util.Iterator) filterIterator65);
        boolean b70 = defaultedMap3.equals((java.lang.Object) filterIterator15);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 0L + "'", obj52.equals(0L));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b70 == false);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate3);
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate11, predicate14);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Set set22 = defaultedMap20.entrySet();
        java.util.Collection collection23 = defaultedMap20.values();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) collection23);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        filterIterator32.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        filterIterator38.setIterator((java.util.Iterator) filterIterator39);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        filterIterator33.setIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) filterIterator54);
        java.lang.Object obj59 = defaultedMap47.get((java.lang.Object) defaultedMap51);
        boolean b60 = defaultedMap47.isEmpty();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate61, predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate62);
        collections.Predicate predicate65 = null;
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate62, predicate65);
        boolean b67 = defaultedMap25.equals((java.lang.Object) predicate62);
        try {
            java.util.Map map68 = collections.map.PredicatedMap.decorate(map0, predicate5, predicate62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 0L + "'", obj53.equals(0L));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0L + "'", obj59.equals(0L));
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        boolean b12 = defaultedMap5.containsKey((java.lang.Object) filterIterator8);
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.util.Set set15 = defaultedMap5.entrySet();
        java.lang.Object obj16 = null;
        java.lang.Object obj17 = defaultedMap5.get(obj16);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0L + "'", obj7.equals(0L));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0L + "'", obj13.equals(0L));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0L + "'", obj17.equals(0L));
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate8);
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate5, predicate8);
        java.util.Collection collection11 = defaultedMap3.values();
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator2.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        boolean b8 = defaultedMap6.equals((java.lang.Object) (byte) 10);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap6.get(obj9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Collection collection17 = defaultedMap14.values();
        defaultedMap6.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) filterIterator24);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate31);
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate39, predicate42);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate33, predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        filterIterator48.setIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        filterIterator52.setPredicate(predicate55);
        java.lang.Object obj58 = defaultedMap21.get((java.lang.Object) filterIterator52);
        java.lang.Object obj59 = defaultedMap14.get(obj58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        filterIterator62.setIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        filterIterator66.setIterator((java.util.Iterator) filterIterator67);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        java.lang.Object obj72 = defaultedMap14.get((java.lang.Object) filterIterator71);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0L + "'", obj23.equals(0L));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 0L + "'", obj58.equals(0L));
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 0L + "'", obj59.equals(0L));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + 0L + "'", obj72.equals(0L));
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.util.Set set10 = defaultedMap8.entrySet();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate12);
        java.lang.Object obj14 = defaultedMap8.get((java.lang.Object) filterIterator13);
        boolean b15 = defaultedMap3.containsValue((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0L + "'", obj14.equals(0L));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = null;
        filterIterator3.setIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator3.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set5 = defaultedMap3.entrySet();
        java.util.Collection collection6 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        filterIterator13.setIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        filterIterator19.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        filterIterator14.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        boolean b39 = defaultedMap32.containsKey((java.lang.Object) filterIterator35);
        java.lang.Object obj40 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        boolean b41 = defaultedMap28.isEmpty();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate43);
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate43, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0L);
        java.lang.Object obj51 = defaultedMap49.get((java.lang.Object) 'a');
        java.lang.String str52 = defaultedMap49.toString();
        defaultedMap49.clear();
        defaultedMap8.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj55 = defaultedMap3.remove((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(iterator24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0L + "'", obj34.equals(0L));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 0L + "'", obj40.equals(0L));
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0L + "'", obj51.equals(0L));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj55);
    }
}

