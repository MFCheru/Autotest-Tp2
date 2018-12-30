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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) str7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        filterIterator3.setIterator((java.util.Iterator) filterIterator4);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap7.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.keySet();
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "{}");
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map4);
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
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate(map9, predicate10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate10);
        try {
            filterIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap12.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map10, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1L);
        java.util.Set set21 = defaultedMap18.keySet();
        boolean b22 = defaultedMap12.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.Factory factory24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#' + "'", obj23.equals('#'));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
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
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate(map9, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap10.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        filterIterator11.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate21);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate28 = null;
        collections.Predicate predicate29 = null;
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate28, predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate(map30, predicate31, predicate32);
        filterIterator25.setPredicate(predicate31);
        filterIterator4.setPredicate(predicate31);
        try {
            filterIterator4.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = null;
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate(map11, predicate12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate12);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1L);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i20 = defaultedMap14.size();
        java.util.Set set21 = defaultedMap14.entrySet();
        java.lang.Object obj22 = defaultedMap5.get((java.lang.Object) set21);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 'a' + "'", obj22.equals('a'));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str7 = defaultedMap6.toString();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) str7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set13 = defaultedMap12.keySet();
        boolean b14 = defaultedMap10.containsKey((java.lang.Object) set13);
        boolean b15 = defaultedMap1.containsKey((java.lang.Object) b14);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 0.0d);
        boolean b10 = defaultedMap1.isEmpty();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '#' + "'", obj12.equals('#'));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap11.keySet();
        boolean b15 = defaultedMap5.equals((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 1L);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        boolean b30 = defaultedMap5.equals((java.lang.Object) filterIterator29);
        java.lang.Object obj32 = defaultedMap5.get((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + '#' + "'", obj32.equals('#'));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        collections.Factory factory66 = null;
        try {
            java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        try {
            java.lang.Object obj30 = filterIterator15.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate(map12, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate(map23, predicate24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map26, (java.lang.Object) filterIterator30);
        filterIterator17.setIterator((java.util.Iterator) filterIterator30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map37, predicate38, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate38);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(iterator42);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = null;
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate(map11, predicate12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1L);
        java.lang.Object obj23 = defaultedMap18.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i24 = defaultedMap18.size();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) 1L);
        java.lang.Object obj31 = defaultedMap26.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        filterIterator32.setIterator((java.util.Iterator) filterIterator34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate39 = null;
        collections.Predicate predicate40 = null;
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map41, predicate42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate42);
        java.lang.Object obj46 = defaultedMap18.put((java.lang.Object) defaultedMap26, (java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = filterIterator47.getPredicate();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        filterIterator49.setIterator((java.util.Iterator) filterIterator51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate56 = null;
        collections.Predicate predicate57 = null;
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate56, predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate(map58, predicate59, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate59);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate59);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate66 = null;
        collections.Predicate predicate67 = null;
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate66, predicate67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map68, predicate69, predicate70);
        filterIterator63.setPredicate(predicate69);
        filterIterator32.setPredicate(predicate69);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate69);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(predicate48);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        boolean b30 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = null;
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set38 = defaultedMap37.keySet();
        java.lang.Object obj39 = defaultedMap9.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap37);
        java.util.Collection collection40 = defaultedMap9.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(collection40);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate(map6, predicate7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map9, (java.lang.Object) filterIterator13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) map9, obj15);
        boolean b17 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate(map12, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 1L);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap20.entrySet();
        java.lang.Object obj27 = defaultedMap20.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str30 = defaultedMap29.toString();
        int i31 = defaultedMap29.size();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = null;
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map36, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) 1L);
        java.lang.Object obj46 = defaultedMap41.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate50 = null;
        collections.Predicate predicate51 = null;
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate50, predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map52, predicate53, predicate54);
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate47, predicate54);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate54);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = filterIterator58.getPredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = filterIterator62.getPredicate();
        filterIterator60.setIterator((java.util.Iterator) filterIterator62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate67 = null;
        collections.Predicate predicate68 = null;
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate67, predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map69, predicate70, predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate70);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate70);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate77 = null;
        collections.Predicate predicate78 = null;
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate77, predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate81 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate(map79, predicate80, predicate81);
        filterIterator74.setPredicate(predicate80);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate54, predicate80);
        filterIterator17.setPredicate(predicate54);
        try {
            boolean b86 = filterIterator17.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '#' + "'", obj22.equals('#'));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + '#' + "'", obj27.equals('#'));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(predicate59);
        org.junit.Assert.assertNull(predicate63);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map84);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) 1L);
        boolean b13 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 'a' + "'", obj12.equals('a'));
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Set set9 = defaultedMap1.keySet();
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate(map12, predicate13, predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate13, predicate16);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate(map17, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap11.keySet();
        boolean b15 = defaultedMap5.equals((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 1L);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate29 = null;
        collections.Predicate predicate30 = null;
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate29, predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate(map31, predicate32, predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        java.util.Map map39 = collections.map.DefaultedMap.decorate(map34, (java.lang.Object) filterIterator38);
        boolean b40 = defaultedMap17.containsKey((java.lang.Object) filterIterator38);
        java.util.Collection collection41 = defaultedMap17.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        java.lang.String str8 = defaultedMap5.toString();
        boolean b9 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set2 = defaultedMap1.keySet();
        boolean b4 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate(map9, predicate10, predicate11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) map9);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate(map12, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) filterIterator17);
        try {
            boolean b19 = filterIterator17.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        filterIterator32.setIterator((java.util.Iterator) filterIterator34);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate39 = null;
        collections.Predicate predicate40 = null;
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate(map41, predicate42, predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate42);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate49 = null;
        collections.Predicate predicate50 = null;
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate49, predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate(map51, predicate52, predicate53);
        filterIterator46.setPredicate(predicate52);
        filterIterator15.setPredicate(predicate52);
        try {
            boolean b57 = filterIterator15.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 1L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set12 = defaultedMap11.keySet();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + '#' + "'", obj7.equals('#'));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 0.0d);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1L);
        java.lang.Object obj13 = defaultedMap8.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate17 = null;
        collections.Predicate predicate18 = null;
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate17, predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate(map19, predicate20, predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate14, predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str28 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str32 = defaultedMap31.toString();
        java.lang.Object obj33 = defaultedMap27.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate39, predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate39);
        java.lang.Object obj45 = defaultedMap1.put((java.lang.Object) predicate14, (java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 1L);
        java.lang.Object obj52 = defaultedMap47.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i53 = defaultedMap47.size();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 1L);
        java.lang.Object obj60 = defaultedMap55.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        filterIterator61.setIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate68 = null;
        collections.Predicate predicate69 = null;
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate(map70, predicate71, predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate71);
        java.lang.Object obj75 = defaultedMap47.put((java.lang.Object) defaultedMap55, (java.lang.Object) filterIterator61);
        java.lang.String str76 = defaultedMap47.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap47);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        java.util.Set set67 = defaultedMap66.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str70 = defaultedMap69.toString();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str74 = defaultedMap73.toString();
        java.lang.Object obj75 = defaultedMap69.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap73);
        java.lang.String str76 = defaultedMap73.toString();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap78, (java.lang.Object) 1L);
        java.lang.Object obj82 = defaultedMap78.get((java.lang.Object) ' ');
        defaultedMap73.putAll((java.util.Map) defaultedMap78);
        java.util.Set set84 = defaultedMap73.entrySet();
        java.lang.Object obj85 = defaultedMap66.get((java.lang.Object) set84);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + '#' + "'", obj82.equals('#'));
        org.junit.Assert.assertNotNull(set84);
        org.junit.Assert.assertNotNull(obj85);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = filterIterator67.getPredicate();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        boolean b70 = defaultedMap66.containsKey((java.lang.Object) filterIterator69);
        collections.Predicate predicate71 = filterIterator69.getPredicate();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(predicate68);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(predicate71);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) 1L);
        java.lang.Object obj8 = defaultedMap4.remove((java.lang.Object) "{}");
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) "{}");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + '#' + "'", obj6.equals('#'));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 'a' + "'", obj9.equals('a'));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set7 = defaultedMap6.keySet();
        boolean b9 = defaultedMap6.containsValue((java.lang.Object) (byte) 1);
        defaultedMap4.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj11 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap11.keySet();
        boolean b15 = defaultedMap5.equals((java.lang.Object) defaultedMap11);
        boolean b16 = defaultedMap11.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        java.lang.String str8 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i18 = defaultedMap17.size();
        java.util.Set set19 = defaultedMap17.entrySet();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) filterIterator20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate27 = null;
        collections.Predicate predicate28 = null;
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate27, predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate(map29, predicate30, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.util.Map map37 = collections.map.DefaultedMap.decorate(map32, (java.lang.Object) filterIterator36);
        java.lang.Object obj38 = defaultedMap10.put((java.lang.Object) defaultedMap17, (java.lang.Object) filterIterator36);
        boolean b40 = defaultedMap10.containsValue((java.lang.Object) "");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + '#' + "'", obj14.equals('#'));
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        int i3 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate6 = null;
        collections.Predicate predicate7 = null;
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate6, predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate(map8, predicate9, predicate10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 1L);
        java.lang.Object obj18 = defaultedMap13.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate19, predicate26);
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate26);
        java.lang.Object obj30 = null;
        boolean b31 = defaultedMap1.containsKey(obj30);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 'a');
        defaultedMap1.clear();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap7.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.String str10 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1L);
        java.util.Set set19 = defaultedMap16.keySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate(map14, (java.lang.Object) defaultedMap16);
        boolean b21 = defaultedMap16.isEmpty();
        java.lang.Object obj23 = defaultedMap16.get((java.lang.Object) 0.0f);
        java.lang.Object obj24 = defaultedMap7.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#' + "'", obj23.equals('#'));
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '#' + "'", obj24.equals('#'));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        java.util.Set set67 = defaultedMap66.keySet();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate71 = null;
        collections.Predicate predicate72 = null;
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate71, predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate75 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate(map73, predicate74, predicate75);
        java.lang.Object obj77 = defaultedMap66.put((java.lang.Object) 100.0d, (java.lang.Object) predicate74);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        filterIterator2.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate9 = null;
        collections.Predicate predicate10 = null;
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate9, predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate(map11, predicate12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate12);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate12);
        try {
            filterIterator16.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        int i9 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.Predicate predicate5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate5);
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate18 = null;
        collections.Predicate predicate19 = null;
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate18, predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate22 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map23 = collections.map.PredicatedMap.decorate(map20, predicate21, predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate15, predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        boolean b26 = defaultedMap9.containsKey((java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 1L);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 100.0f);
        java.util.Set set33 = defaultedMap28.entrySet();
        java.lang.Object obj35 = defaultedMap28.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str38 = defaultedMap37.toString();
        int i39 = defaultedMap37.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate42 = null;
        collections.Predicate predicate43 = null;
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate42, predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate(map44, predicate45, predicate46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 1L);
        java.lang.Object obj54 = defaultedMap49.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate55, predicate62);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate45, predicate62);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.Predicate predicate67 = filterIterator66.getPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = filterIterator70.getPredicate();
        filterIterator68.setIterator((java.util.Iterator) filterIterator70);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate75 = null;
        collections.Predicate predicate76 = null;
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate75, predicate76);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate79 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map80 = collections.map.PredicatedMap.decorate(map77, predicate78, predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate78);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate78);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate85 = null;
        collections.Predicate predicate86 = null;
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map87, predicate88, predicate89);
        filterIterator82.setPredicate(predicate88);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate62, predicate88);
        filterIterator25.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate62);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate62);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + '#' + "'", obj35.equals('#'));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(predicate67);
        org.junit.Assert.assertNull(predicate71);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map92);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate(map9, predicate10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate10);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        boolean b30 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate33 = null;
        collections.Predicate predicate34 = null;
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate33, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set38 = defaultedMap37.keySet();
        java.lang.Object obj39 = defaultedMap9.put((java.lang.Object) defaultedMap32, (java.lang.Object) defaultedMap37);
        boolean b40 = defaultedMap9.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 1L);
        java.util.Set set36 = defaultedMap33.keySet();
        java.lang.Object obj38 = defaultedMap33.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 1L);
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) "{}");
        defaultedMap33.putAll((java.util.Map) defaultedMap40);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = filterIterator46.getPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        java.lang.Object obj49 = defaultedMap40.get((java.lang.Object) filterIterator46);
        filterIterator15.setIterator((java.util.Iterator) filterIterator46);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + '#' + "'", obj42.equals('#'));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + '#' + "'", obj49.equals('#'));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.Predicate predicate11 = filterIterator9.getPredicate();
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) filterIterator9);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap7.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Factory factory10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        defaultedMap1.clear();
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        java.util.Set set67 = defaultedMap66.keySet();
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set72 = defaultedMap71.keySet();
        boolean b73 = defaultedMap69.containsKey((java.lang.Object) set72);
        java.lang.Object obj74 = defaultedMap66.get((java.lang.Object) defaultedMap69);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(obj74);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) "{}");
        defaultedMap6.putAll((java.util.Map) defaultedMap13);
        boolean b19 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        boolean b20 = defaultedMap6.isEmpty();
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '#' + "'", obj15.equals('#'));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate(map6, predicate7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Map map14 = collections.map.DefaultedMap.decorate(map9, (java.lang.Object) filterIterator13);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) map9, obj15);
        java.util.Collection collection17 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(collection17);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        defaultedMap1.clear();
        java.util.Collection collection3 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection3);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap3.toString();
        int i5 = defaultedMap3.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate8 = null;
        collections.Predicate predicate9 = null;
        java.util.Map map10 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate8, predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate12 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate(map10, predicate11, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1L);
        java.lang.Object obj20 = defaultedMap15.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate24 = null;
        collections.Predicate predicate25 = null;
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map26, predicate27, predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate21, predicate28);
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate28);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            java.lang.Object obj34 = filterIterator33.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str32 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj37 = defaultedMap31.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate40 = null;
        collections.Predicate predicate41 = null;
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate40, predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate(map42, predicate43, predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate46);
        filterIterator15.setPredicate(predicate43);
        java.util.Iterator iterator49 = filterIterator15.getIterator();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(iterator49);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        java.lang.String str8 = defaultedMap5.toString();
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set14 = defaultedMap13.keySet();
        boolean b15 = defaultedMap11.containsKey((java.lang.Object) set14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 1L);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 100.0f);
        java.util.Set set22 = defaultedMap17.entrySet();
        java.lang.Object obj24 = defaultedMap17.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str27 = defaultedMap26.toString();
        int i28 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) 1L);
        java.lang.Object obj43 = defaultedMap38.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate47 = null;
        collections.Predicate predicate48 = null;
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate47, predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate(map49, predicate50, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate44, predicate51);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = filterIterator55.getPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = filterIterator59.getPredicate();
        filterIterator57.setIterator((java.util.Iterator) filterIterator59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate64 = null;
        collections.Predicate predicate65 = null;
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate(map66, predicate67, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57, predicate67);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate67);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate74 = null;
        collections.Predicate predicate75 = null;
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate74, predicate75);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map79 = collections.map.PredicatedMap.decorate(map76, predicate77, predicate78);
        filterIterator71.setPredicate(predicate77);
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate51, predicate77);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) predicate77);
        collections.Predicate predicate83 = null;
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate77, predicate83);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap5, predicate9, predicate77);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '#' + "'", obj24.equals('#'));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.Predicate predicate2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate2);
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        try {
            java.lang.Object obj6 = filterIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        boolean b5 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) b5);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set8 = defaultedMap7.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b10 = defaultedMap7.isEmpty();
        java.lang.Object obj12 = defaultedMap7.get((java.lang.Object) (byte) -1);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '#' + "'", obj12.equals('#'));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate4 = null;
        collections.Predicate predicate5 = null;
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate4, predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map9 = collections.map.PredicatedMap.decorate(map6, predicate7, predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate8);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        boolean b9 = defaultedMap5.equals((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1L);
        java.lang.Object obj16 = defaultedMap11.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate20 = null;
        collections.Predicate predicate21 = null;
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate20, predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate(map22, predicate23, predicate24);
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate17, predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        boolean b28 = defaultedMap11.containsKey((java.lang.Object) filterIterator27);
        java.lang.Object obj29 = defaultedMap5.get((java.lang.Object) b28);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 'a' + "'", obj29.equals('a'));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) "{}");
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) 1L);
        java.util.Set set22 = defaultedMap19.keySet();
        java.util.Map map23 = collections.map.DefaultedMap.decorate(map17, (java.lang.Object) defaultedMap19);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap25.keySet();
        boolean b29 = defaultedMap19.equals((java.lang.Object) defaultedMap25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 1L);
        boolean b35 = defaultedMap31.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set38 = defaultedMap37.keySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        defaultedMap19.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 1L);
        boolean b46 = defaultedMap42.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set49 = defaultedMap48.keySet();
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        java.lang.String str51 = defaultedMap48.toString();
        boolean b52 = defaultedMap19.containsValue((java.lang.Object) str51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) str51);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + '#' + "'", obj10.equals('#'));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + '#' + "'", obj44.equals('#'));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate7 = null;
        collections.Predicate predicate8 = null;
        java.util.Map map9 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate7, predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate(map9, predicate10, predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate10);
        java.util.Iterator iterator14 = filterIterator0.getIterator();
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) "{}");
        defaultedMap6.putAll((java.util.Map) defaultedMap13);
        boolean b19 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 1L);
        boolean b25 = defaultedMap21.equals((java.lang.Object) 100.0f);
        java.util.Set set26 = defaultedMap21.entrySet();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str31 = defaultedMap30.toString();
        int i32 = defaultedMap30.size();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map37, predicate38, predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1L);
        java.lang.Object obj47 = defaultedMap42.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate51 = null;
        collections.Predicate predicate52 = null;
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate51, predicate52);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate(map53, predicate54, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate48, predicate55);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate38, predicate55);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = filterIterator59.getPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        filterIterator61.setIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate68 = null;
        collections.Predicate predicate69 = null;
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate68, predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map73 = collections.map.PredicatedMap.decorate(map70, predicate71, predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate71);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate71);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate78 = null;
        collections.Predicate predicate79 = null;
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap77, predicate78, predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate82 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map83 = collections.map.PredicatedMap.decorate(map80, predicate81, predicate82);
        filterIterator75.setPredicate(predicate81);
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate55, predicate81);
        collections.Predicate predicate86 = null;
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate55, predicate86);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '#' + "'", obj15.equals('#'));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#' + "'", obj23.equals('#'));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + '#' + "'", obj28.equals('#'));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map87);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str2 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str6 = defaultedMap5.toString();
        java.lang.Object obj7 = defaultedMap1.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap5);
        java.lang.String str8 = defaultedMap5.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap10.get((java.lang.Object) ' ');
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        java.util.Set set16 = defaultedMap5.entrySet();
        java.util.Set set17 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + '#' + "'", obj14.equals('#'));
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) (byte) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str12 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str16 = defaultedMap15.toString();
        java.lang.Object obj17 = defaultedMap11.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap15);
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 1L);
        java.lang.Object obj24 = defaultedMap20.get((java.lang.Object) ' ');
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i28 = defaultedMap27.size();
        java.util.Set set29 = defaultedMap27.entrySet();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        collections.Predicate predicate32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate32);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) filterIterator30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate37 = null;
        collections.Predicate predicate38 = null;
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate(map39, predicate40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        java.util.Map map47 = collections.map.DefaultedMap.decorate(map42, (java.lang.Object) filterIterator46);
        java.lang.Object obj48 = defaultedMap20.put((java.lang.Object) defaultedMap27, (java.lang.Object) filterIterator46);
        java.lang.Object obj49 = defaultedMap1.get((java.lang.Object) defaultedMap27);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + '#' + "'", obj24.equals('#'));
        org.junit.Assert.assertTrue(i28 == 0);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + '#' + "'", obj49.equals('#'));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str4 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str8 = defaultedMap7.toString();
        java.lang.Object obj9 = defaultedMap3.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate(map14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate15, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate15);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str26 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj31 = defaultedMap25.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = null;
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map36, predicate37, predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate37);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        filterIterator21.setIterator((java.util.Iterator) filterIterator42);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate4);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1L);
        java.util.Set set21 = defaultedMap18.keySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map16, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 1L);
        java.util.Set set27 = defaultedMap24.keySet();
        boolean b28 = defaultedMap18.equals((java.lang.Object) defaultedMap24);
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) defaultedMap18);
        java.util.Collection collection30 = defaultedMap7.values();
        java.lang.Object obj31 = defaultedMap1.get((java.lang.Object) collection30);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '#' + "'", obj29.equals('#'));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + '#' + "'", obj31.equals('#'));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj10 = defaultedMap8.get((java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) "{}");
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) 1L);
        boolean b18 = defaultedMap8.equals((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 1L);
        boolean b24 = defaultedMap20.equals((java.lang.Object) 100.0f);
        java.util.Set set25 = defaultedMap20.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 1L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate36 = null;
        collections.Predicate predicate37 = null;
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate36, predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate(map38, predicate39, predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate33, predicate40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str47 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str51 = defaultedMap50.toString();
        java.lang.Object obj52 = defaultedMap46.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate55 = null;
        collections.Predicate predicate56 = null;
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate55, predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate58);
        java.lang.Object obj64 = defaultedMap20.put((java.lang.Object) predicate33, (java.lang.Object) predicate58);
        java.util.Set set65 = defaultedMap20.keySet();
        boolean b66 = defaultedMap8.equals((java.lang.Object) set65);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + '#' + "'", obj10.equals('#'));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '#' + "'", obj17.equals('#'));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + '#' + "'", obj22.equals('#'));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(set65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 'a');
        defaultedMap5.clear();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap5);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(map9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        collections.Predicate predicate6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate6);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str13 = defaultedMap12.toString();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj18 = defaultedMap12.put((java.lang.Object) (byte) -1, (java.lang.Object) defaultedMap16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate(map23, predicate24, predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate24);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        filterIterator4.setIterator((java.util.Iterator) filterIterator29);
        try {
            java.lang.Object obj32 = filterIterator29.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i13 = defaultedMap7.size();
        boolean b15 = defaultedMap7.equals((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1L);
        java.util.Set set24 = defaultedMap21.keySet();
        java.util.Map map25 = collections.map.DefaultedMap.decorate(map19, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 1L);
        java.lang.Object obj32 = defaultedMap27.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        boolean b33 = defaultedMap27.isEmpty();
        java.lang.Object obj34 = defaultedMap7.put((java.lang.Object) map19, (java.lang.Object) defaultedMap27);
        java.lang.Object obj35 = defaultedMap1.remove(obj34);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + '#' + "'", obj5.equals('#'));
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap11.keySet();
        boolean b15 = defaultedMap5.equals((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 1L);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        boolean b30 = defaultedMap5.equals((java.lang.Object) filterIterator29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set35 = defaultedMap34.keySet();
        boolean b36 = defaultedMap32.containsKey((java.lang.Object) set35);
        boolean b37 = defaultedMap5.containsValue((java.lang.Object) b36);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate10 = null;
        collections.Predicate predicate11 = null;
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate10, predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate(map12, predicate13, predicate14);
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate7, predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) filterIterator17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate21 = null;
        collections.Predicate predicate22 = null;
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate21, predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate(map23, predicate24, predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map26, (java.lang.Object) filterIterator30);
        filterIterator17.setIterator((java.util.Iterator) filterIterator30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map37, predicate38, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate38);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str44 = defaultedMap43.toString();
        int i45 = defaultedMap43.size();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 1L);
        java.lang.Object obj60 = defaultedMap55.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate64 = null;
        collections.Predicate predicate65 = null;
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate64, predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate(map66, predicate67, predicate68);
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate61, predicate68);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate51, predicate68);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73);
        java.util.Iterator iterator75 = filterIterator74.getIterator();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.Predicate predicate77 = filterIterator76.getPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.Predicate predicate81 = filterIterator80.getPredicate();
        filterIterator78.setIterator((java.util.Iterator) filterIterator80);
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate85 = null;
        collections.Predicate predicate86 = null;
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap84, predicate85, predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate89 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate(map87, predicate88, predicate89);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78, predicate88);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator76, predicate88);
        filterIterator74.setPredicate(predicate88);
        filterIterator41.setPredicate(predicate88);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(iterator75);
        org.junit.Assert.assertNull(predicate77);
        org.junit.Assert.assertNull(predicate81);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        int i15 = defaultedMap11.size();
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + '#' + "'", obj17.equals('#'));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap12.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map10, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1L);
        java.util.Set set21 = defaultedMap18.keySet();
        boolean b22 = defaultedMap12.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 1L);
        java.lang.Object obj30 = defaultedMap25.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate34 = null;
        collections.Predicate predicate35 = null;
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate34, predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate(map36, predicate37, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate31, predicate38);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        boolean b42 = defaultedMap25.containsKey((java.lang.Object) filterIterator41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate45 = null;
        collections.Predicate predicate46 = null;
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate45, predicate46);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map47, predicate48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        java.util.Map map55 = collections.map.DefaultedMap.decorate(map50, (java.lang.Object) filterIterator54);
        filterIterator41.setIterator((java.util.Iterator) filterIterator54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate59 = null;
        collections.Predicate predicate60 = null;
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap58, predicate59, predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate(map61, predicate62, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate62);
        java.lang.Object obj66 = defaultedMap1.get((java.lang.Object) filterIterator65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = filterIterator69.getPredicate();
        filterIterator67.setIterator((java.util.Iterator) filterIterator69);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap73, (java.lang.Object) 1L);
        java.util.Set set76 = defaultedMap73.keySet();
        java.lang.Object obj78 = defaultedMap73.remove((java.lang.Object) 'a');
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.Predicate predicate80 = filterIterator79.getPredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = filterIterator83.getPredicate();
        filterIterator81.setIterator((java.util.Iterator) filterIterator83);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate88 = null;
        collections.Predicate predicate89 = null;
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap87, predicate88, predicate89);
        collections.Predicate predicate91 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate92 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate(map90, predicate91, predicate92);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81, predicate91);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79, predicate91);
        boolean b96 = defaultedMap73.containsKey((java.lang.Object) filterIterator95);
        filterIterator67.setIterator((java.util.Iterator) filterIterator95);
        java.lang.Object obj98 = defaultedMap1.get((java.lang.Object) filterIterator67);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#' + "'", obj23.equals('#'));
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + '#' + "'", obj66.equals('#'));
        org.junit.Assert.assertNull(predicate70);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(predicate80);
        org.junit.Assert.assertNull(predicate84);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertTrue(b96 == false);
        org.junit.Assert.assertTrue("'" + obj98 + "' != '" + '#' + "'", obj98.equals('#'));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i2 = defaultedMap1.size();
        int i3 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 1L);
        java.util.Set set15 = defaultedMap12.keySet();
        java.util.Map map16 = collections.map.DefaultedMap.decorate(map10, (java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1L);
        java.util.Set set21 = defaultedMap18.keySet();
        boolean b22 = defaultedMap12.equals((java.lang.Object) defaultedMap18);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) 1L);
        boolean b29 = defaultedMap25.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set32 = defaultedMap31.keySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set36 = defaultedMap35.keySet();
        boolean b37 = defaultedMap25.containsValue((java.lang.Object) set36);
        boolean b38 = defaultedMap12.containsKey((java.lang.Object) set36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) b38);
        java.util.Set set40 = defaultedMap39.entrySet();
        boolean b42 = defaultedMap39.containsValue((java.lang.Object) (-1));
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + '#' + "'", obj23.equals('#'));
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + '#' + "'", obj27.equals('#'));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) predicate61);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = filterIterator67.getPredicate();
        collections.Predicate predicate69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate69);
        java.util.Iterator iterator71 = filterIterator70.getIterator();
        boolean b72 = defaultedMap66.equals((java.lang.Object) filterIterator70);
        collections.Predicate predicate73 = filterIterator70.getPredicate();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNull(predicate68);
        org.junit.Assert.assertNotNull(iterator71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(predicate73);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate2 = null;
        collections.Predicate predicate3 = null;
        java.util.Map map4 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate2, predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 1L);
        java.util.Set set9 = defaultedMap6.keySet();
        java.lang.Object obj11 = defaultedMap6.remove((java.lang.Object) 'a');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) "{}");
        defaultedMap6.putAll((java.util.Map) defaultedMap13);
        boolean b19 = defaultedMap1.equals((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) 1L);
        java.util.Set set28 = defaultedMap25.keySet();
        java.util.Map map29 = collections.map.DefaultedMap.decorate(map23, (java.lang.Object) defaultedMap25);
        boolean b30 = defaultedMap25.isEmpty();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap25);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + '#' + "'", obj15.equals('#'));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate12 = null;
        collections.Predicate predicate13 = null;
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate12, predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate(map14, predicate15, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate15);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate15);
        filterIterator1.setPredicate(predicate15);
        java.util.Iterator iterator21 = filterIterator1.getIterator();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        boolean b9 = defaultedMap1.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = defaultedMap1.toString();
        java.util.Set set11 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{0=-1.0}" + "'", str10.equals("{0=-1.0}"));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        boolean b10 = defaultedMap5.isEmpty();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1L);
        java.lang.Object obj19 = defaultedMap14.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i20 = defaultedMap14.size();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        filterIterator28.setIterator((java.util.Iterator) filterIterator30);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate35 = null;
        collections.Predicate predicate36 = null;
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate35, predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate(map37, predicate38, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate38);
        java.lang.Object obj42 = defaultedMap14.put((java.lang.Object) defaultedMap22, (java.lang.Object) filterIterator28);
        defaultedMap5.putAll((java.util.Map) defaultedMap22);
        boolean b45 = defaultedMap22.containsValue((java.lang.Object) "");
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + '#' + "'", obj12.equals('#'));
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 1);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.Factory factory30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        java.lang.Object obj6 = defaultedMap1.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap9.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate22 = null;
        collections.Predicate predicate23 = null;
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate22, predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate(map24, predicate25, predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        java.lang.Object obj29 = defaultedMap1.put((java.lang.Object) defaultedMap9, (java.lang.Object) filterIterator15);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        int i32 = defaultedMap31.size();
        java.util.Set set33 = defaultedMap31.entrySet();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) filterIterator34);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        filterIterator34.setIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        filterIterator15.setIterator((java.util.Iterator) filterIterator34);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) 100.0f);
        java.util.Set set6 = defaultedMap1.entrySet();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.String str11 = defaultedMap10.toString();
        int i12 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate15 = null;
        collections.Predicate predicate16 = null;
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate15, predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate(map17, predicate18, predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 1L);
        java.lang.Object obj27 = defaultedMap22.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate31 = null;
        collections.Predicate predicate32 = null;
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate(map33, predicate34, predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate28, predicate35);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate18, predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        filterIterator41.setIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate48 = null;
        collections.Predicate predicate49 = null;
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate48, predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map50, predicate51, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate51);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate51);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.Predicate predicate58 = null;
        collections.Predicate predicate59 = null;
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate58, predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map60, predicate61, predicate62);
        filterIterator55.setPredicate(predicate61);
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate35, predicate61);
        java.util.Set set66 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + '#' + "'", obj3.equals('#'));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + '#' + "'", obj8.equals('#'));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set66);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) 1L);
        java.util.Set set8 = defaultedMap5.keySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate(map3, (java.lang.Object) defaultedMap5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1L);
        java.util.Set set14 = defaultedMap11.keySet();
        boolean b15 = defaultedMap5.equals((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 1L);
        boolean b21 = defaultedMap17.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set24 = defaultedMap23.keySet();
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        defaultedMap5.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) 1L);
        boolean b32 = defaultedMap28.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set35 = defaultedMap34.keySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        java.lang.String str37 = defaultedMap34.toString();
        boolean b38 = defaultedMap5.containsValue((java.lang.Object) str37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 1L);
        java.util.Set set43 = defaultedMap40.keySet();
        java.lang.Object obj45 = defaultedMap40.remove((java.lang.Object) 'a');
        java.util.Set set46 = defaultedMap40.keySet();
        boolean b47 = defaultedMap5.containsKey((java.lang.Object) set46);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + '#' + "'", obj19.equals('#'));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + '#' + "'", obj30.equals('#'));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set4 = defaultedMap3.keySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) set4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 1L);
        java.lang.Object obj12 = defaultedMap7.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1L);
        java.util.Set set21 = defaultedMap18.keySet();
        java.util.Map map22 = collections.map.DefaultedMap.decorate(map16, (java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) 1L);
        java.util.Set set27 = defaultedMap24.keySet();
        boolean b28 = defaultedMap18.equals((java.lang.Object) defaultedMap24);
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) 1L);
        boolean b35 = defaultedMap31.equals((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set38 = defaultedMap37.keySet();
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Set set42 = defaultedMap41.keySet();
        boolean b43 = defaultedMap31.containsValue((java.lang.Object) set42);
        boolean b44 = defaultedMap18.containsKey((java.lang.Object) set42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) 1L);
        java.lang.Object obj51 = defaultedMap46.put((java.lang.Object) (byte) 0, (java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) 1L);
        java.util.Set set60 = defaultedMap57.keySet();
        java.util.Map map61 = collections.map.DefaultedMap.decorate(map55, (java.lang.Object) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) '#');
        java.util.Map map65 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 1L);
        java.util.Set set66 = defaultedMap63.keySet();
        boolean b67 = defaultedMap57.equals((java.lang.Object) defaultedMap63);
        java.lang.Object obj68 = defaultedMap46.get((java.lang.Object) defaultedMap57);
        java.util.Collection collection69 = defaultedMap46.values();
        java.lang.Object obj70 = defaultedMap18.get((java.lang.Object) defaultedMap46);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + '#' + "'", obj29.equals('#'));
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + '#' + "'", obj33.equals('#'));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(set66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + '#' + "'", obj68.equals('#'));
        org.junit.Assert.assertNotNull(collection69);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + '#' + "'", obj70.equals('#'));
        org.junit.Assert.assertNotNull(map71);
    }
}

