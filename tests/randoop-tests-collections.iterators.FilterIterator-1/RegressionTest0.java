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
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) false);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            java.lang.Object obj2 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
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
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        try {
            java.lang.Object obj5 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate4);
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
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        int i9 = defaultedMap5.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) predicate8);
        filterIterator1.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            java.lang.Object obj12 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) predicate8);
        filterIterator1.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator12 = filterIterator1.getIterator();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(iterator12);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        try {
            java.lang.Object obj19 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            boolean b20 = filterIterator19.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) b8);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = null;
        boolean b10 = defaultedMap5.equals(obj9);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        collections.Factory factory12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, factory12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            java.lang.Object obj5 = filterIterator4.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.Factory factory3 = null;
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) 100);
        boolean b26 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) true);
        int i22 = defaultedMap16.size();
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) i22);
        boolean b24 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b24 == true);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = null;
        filterIterator5.setIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate20);
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        java.util.Iterator iterator27 = filterIterator23.getIterator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.util.Map map0 = null;
        java.util.Iterator iterator1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.lang.String str7 = defaultedMap6.toString();
        defaultedMap6.clear();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) predicate9);
        filterIterator2.setPredicate(predicate9);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        try {
            java.util.Map map13 = collections.map.PredicatedMap.decorate(map0, predicate9, predicate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate12);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "hi!");
        java.lang.String str14 = defaultedMap11.toString();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        java.lang.Object obj20 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap11.remove((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        defaultedMap26.clear();
        java.lang.Object obj31 = defaultedMap26.remove((java.lang.Object) true);
        int i32 = defaultedMap26.size();
        boolean b33 = defaultedMap11.containsKey((java.lang.Object) i32);
        boolean b34 = defaultedMap5.equals((java.lang.Object) i32);
        collections.Transformer transformer35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) predicate4);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.lang.String str38 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        boolean b40 = defaultedMap1.containsValue((java.lang.Object) filterIterator39);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b20 = defaultedMap11.equals((java.lang.Object) str19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        java.lang.String str25 = defaultedMap22.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj31 = defaultedMap22.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj34 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = defaultedMap22.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap22.get(obj45);
        boolean b47 = defaultedMap11.equals((java.lang.Object) defaultedMap22);
        java.util.Set set48 = defaultedMap22.entrySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        java.lang.String str51 = defaultedMap9.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{-1.0=100}" + "'", str51.equals("{-1.0=100}"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.get((java.lang.Object) 1.0d);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate22);
        try {
            boolean b24 = filterIterator7.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        java.lang.String str11 = defaultedMap8.toString();
        boolean b12 = defaultedMap3.equals((java.lang.Object) str11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) "hi!");
        java.lang.String str17 = defaultedMap14.toString();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap14.remove((java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = defaultedMap14.get(obj37);
        boolean b39 = defaultedMap3.equals((java.lang.Object) defaultedMap14);
        java.util.Set set40 = defaultedMap14.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.util.Collection collection42 = defaultedMap14.values();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(collection42);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        java.lang.String str22 = defaultedMap19.toString();
        boolean b23 = defaultedMap14.equals((java.lang.Object) str22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        java.lang.String str28 = defaultedMap25.toString();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) "hi!");
        defaultedMap30.clear();
        java.lang.Object obj34 = defaultedMap25.remove((java.lang.Object) defaultedMap30);
        java.lang.Object obj37 = defaultedMap25.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.String str44 = defaultedMap43.toString();
        defaultedMap43.clear();
        java.lang.Object obj46 = defaultedMap39.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj47 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Object obj49 = defaultedMap25.get(obj48);
        boolean b50 = defaultedMap14.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj51 = defaultedMap9.get((java.lang.Object) defaultedMap25);
        collections.Factory factory52 = null;
        try {
            java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        try {
            filterIterator5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        defaultedMap16.clear();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = null;
        filterIterator20.setIterator(iterator21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) predicate31);
        filterIterator24.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate35);
        filterIterator20.setIterator((java.util.Iterator) filterIterator24);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        boolean b39 = defaultedMap16.containsValue((java.lang.Object) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        filterIterator3.setPredicate(predicate40);
        collections.Predicate predicate43 = filterIterator3.getPredicate();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate43);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) predicateUtils9);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) b10);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator6);
        try {
            java.lang.Object obj8 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) true);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        try {
            java.lang.Object obj21 = filterIterator5.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) true);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        boolean b36 = defaultedMap35.isEmpty();
        boolean b38 = defaultedMap35.containsKey((java.lang.Object) 10);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) filterIterator39);
        defaultedMap1.putAll(map41);
        collections.Transformer transformer43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(map41);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) "hi!");
        defaultedMap7.clear();
        defaultedMap7.clear();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.util.Set set24 = defaultedMap15.keySet();
        collections.Transformer transformer25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.lang.String str32 = defaultedMap23.toString();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        int i14 = defaultedMap1.size();
        collections.Factory factory15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "hi!");
        java.lang.String str14 = defaultedMap11.toString();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        java.lang.Object obj20 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        java.lang.Object obj22 = defaultedMap11.get((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap11.remove((java.lang.Object) 'a');
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        defaultedMap26.clear();
        java.lang.Object obj31 = defaultedMap26.remove((java.lang.Object) true);
        int i32 = defaultedMap26.size();
        boolean b33 = defaultedMap11.containsKey((java.lang.Object) i32);
        boolean b34 = defaultedMap5.equals((java.lang.Object) i32);
        boolean b35 = defaultedMap5.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.util.Set set38 = defaultedMap12.entrySet();
        collections.Factory factory39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, factory39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.util.Set set38 = defaultedMap12.entrySet();
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = null;
        filterIterator40.setIterator(iterator41);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.Predicate predicate45 = null;
        filterIterator44.setPredicate(predicate45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) predicate51);
        filterIterator44.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate55);
        filterIterator40.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.String str66 = defaultedMap65.toString();
        defaultedMap65.clear();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) predicate68);
        filterIterator61.setPredicate(predicate68);
        filterIterator59.setIterator((java.util.Iterator) filterIterator61);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        collections.Predicate predicate76 = null;
        filterIterator75.setPredicate(predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75);
        java.lang.Object obj79 = defaultedMap73.get((java.lang.Object) filterIterator75);
        java.lang.Object obj80 = defaultedMap12.put((java.lang.Object) filterIterator59, obj79);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + obj79 + "' != '" + ' ' + "'", obj79.equals(' '));
        org.junit.Assert.assertNull(obj80);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator1.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate18 = filterIterator15.getPredicate();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(predicate18);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = null;
        filterIterator6.setIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) predicate17);
        filterIterator10.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate21);
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        java.lang.Object obj24 = defaultedMap4.remove((java.lang.Object) filterIterator10);
        boolean b25 = defaultedMap1.containsKey(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) "hi!");
        defaultedMap36.clear();
        java.lang.Object obj40 = defaultedMap31.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj43 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) predicate44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "hi!");
        java.lang.String str50 = defaultedMap47.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) "hi!");
        defaultedMap52.clear();
        java.lang.Object obj56 = defaultedMap47.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj59 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj61 = defaultedMap47.get((java.lang.Object) predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map29, predicate44, predicate60);
        boolean b63 = defaultedMap1.equals((java.lang.Object) predicate44);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) 1);
        java.lang.Object obj68 = defaultedMap1.get((java.lang.Object) defaultedMap65);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = null;
        filterIterator18.setIterator(iterator19);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) predicate29);
        filterIterator22.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator22.setPredicate(predicate33);
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj36 = defaultedMap16.remove((java.lang.Object) filterIterator22);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) (byte) 0);
        boolean b45 = defaultedMap38.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap38);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.util.Iterator iterator53 = null;
        filterIterator52.setIterator(iterator53);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) predicate63);
        filterIterator56.setPredicate(predicate63);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate67);
        filterIterator52.setIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        boolean b71 = defaultedMap48.containsValue((java.lang.Object) filterIterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70, predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator76 = null;
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator76);
        java.util.Iterator iterator78 = null;
        filterIterator77.setIterator(iterator78);
        java.util.Iterator iterator80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator80);
        collections.Predicate predicate82 = null;
        filterIterator81.setPredicate(predicate82);
        java.lang.Object obj84 = null;
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap(obj84);
        java.lang.String str86 = defaultedMap85.toString();
        defaultedMap85.clear();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj89 = defaultedMap85.remove((java.lang.Object) predicate88);
        filterIterator81.setPredicate(predicate88);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate92);
        filterIterator77.setIterator((java.util.Iterator) filterIterator81);
        java.lang.Object obj95 = defaultedMap75.remove((java.lang.Object) filterIterator81);
        collections.Predicate predicate96 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate96);
        java.util.Map map98 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate72, predicate96);
        filterIterator1.setPredicate(predicate72);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue("'" + str86 + "' != '" + "{}" + "'", str86.equals("{}"));
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNull(obj95);
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertNotNull(map98);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap20.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) predicate23);
        filterIterator16.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap29.clear();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        filterIterator33.setIterator(iterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.String str42 = defaultedMap41.toString();
        defaultedMap41.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) predicate44);
        filterIterator37.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate48);
        filterIterator33.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        boolean b52 = defaultedMap29.containsValue((java.lang.Object) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        filterIterator16.setPredicate(predicate53);
        java.lang.Object obj56 = defaultedMap6.get((java.lang.Object) predicate53);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator1.setIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        filterIterator19.setIterator(iterator20);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        defaultedMap27.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) predicate30);
        filterIterator23.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate34);
        filterIterator19.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.Predicate predicate40 = null;
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.String str44 = defaultedMap43.toString();
        defaultedMap43.clear();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap43.remove((java.lang.Object) predicate46);
        filterIterator39.setPredicate(predicate46);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.String str55 = defaultedMap54.toString();
        defaultedMap54.clear();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap54.remove((java.lang.Object) predicate57);
        filterIterator50.setPredicate(predicate57);
        filterIterator39.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate57);
        filterIterator15.setIterator((java.util.Iterator) filterIterator37);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(obj58);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b20 = defaultedMap11.equals((java.lang.Object) str19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        java.lang.String str25 = defaultedMap22.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj31 = defaultedMap22.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj34 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = defaultedMap22.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap22.get(obj45);
        boolean b47 = defaultedMap11.equals((java.lang.Object) defaultedMap22);
        java.util.Set set48 = defaultedMap22.entrySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.lang.String str55 = defaultedMap54.toString();
        defaultedMap54.clear();
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        java.util.Iterator iterator59 = null;
        filterIterator58.setIterator(iterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        collections.Predicate predicate63 = null;
        filterIterator62.setPredicate(predicate63);
        java.lang.Object obj65 = null;
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap(obj65);
        java.lang.String str67 = defaultedMap66.toString();
        defaultedMap66.clear();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj70 = defaultedMap66.remove((java.lang.Object) predicate69);
        filterIterator62.setPredicate(predicate69);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate73);
        filterIterator58.setIterator((java.util.Iterator) filterIterator62);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58);
        boolean b77 = defaultedMap54.containsValue((java.lang.Object) filterIterator76);
        boolean b78 = defaultedMap1.containsValue((java.lang.Object) filterIterator76);
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        boolean b81 = defaultedMap80.isEmpty();
        boolean b83 = defaultedMap80.containsKey((java.lang.Object) 10);
        defaultedMap1.putAll((java.util.Map) defaultedMap80);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + str55 + "' != '" + "{}" + "'", str55.equals("{}"));
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap6);
        java.util.Collection collection12 = defaultedMap6.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection12);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) predicate30);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        java.util.Collection collection33 = defaultedMap27.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(collection33);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = defaultedMap1.get((java.lang.Object) (-1L));
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        defaultedMap16.clear();
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = null;
        filterIterator20.setIterator(iterator21);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        collections.Predicate predicate25 = null;
        filterIterator24.setPredicate(predicate25);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap28.remove((java.lang.Object) predicate31);
        filterIterator24.setPredicate(predicate31);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        filterIterator24.setPredicate(predicate35);
        filterIterator20.setIterator((java.util.Iterator) filterIterator24);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        boolean b39 = defaultedMap16.containsValue((java.lang.Object) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate40);
        filterIterator3.setPredicate(predicate40);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.Predicate predicate45 = null;
        filterIterator44.setPredicate(predicate45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) predicate51);
        filterIterator44.setPredicate(predicate51);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = null;
        filterIterator55.setPredicate(predicate56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.lang.String str60 = defaultedMap59.toString();
        defaultedMap59.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) predicate62);
        filterIterator55.setPredicate(predicate62);
        filterIterator44.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate62);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) predicate8);
        filterIterator1.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator1.setPredicate(predicate12);
        java.util.Iterator iterator14 = filterIterator1.getIterator();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator14);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        filterIterator32.setIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) predicate43);
        filterIterator36.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate47);
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator26.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) filterIterator22, (java.lang.Object) filterIterator32);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        java.util.Iterator iterator55 = null;
        filterIterator54.setIterator(iterator55);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        collections.Predicate predicate59 = null;
        filterIterator58.setPredicate(predicate59);
        java.lang.Object obj61 = null;
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap(obj61);
        java.lang.String str63 = defaultedMap62.toString();
        defaultedMap62.clear();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj66 = defaultedMap62.remove((java.lang.Object) predicate65);
        filterIterator58.setPredicate(predicate65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate69);
        filterIterator54.setIterator((java.util.Iterator) filterIterator58);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        collections.Predicate predicate75 = null;
        filterIterator74.setPredicate(predicate75);
        java.lang.Object obj77 = null;
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap(obj77);
        java.lang.String str79 = defaultedMap78.toString();
        defaultedMap78.clear();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj82 = defaultedMap78.remove((java.lang.Object) predicate81);
        filterIterator74.setPredicate(predicate81);
        java.util.Iterator iterator84 = null;
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator(iterator84);
        collections.Predicate predicate86 = null;
        filterIterator85.setPredicate(predicate86);
        java.lang.Object obj88 = null;
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap(obj88);
        java.lang.String str90 = defaultedMap89.toString();
        defaultedMap89.clear();
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj93 = defaultedMap89.remove((java.lang.Object) predicate92);
        filterIterator85.setPredicate(predicate92);
        filterIterator74.setPredicate(predicate92);
        collections.iterators.FilterIterator filterIterator96 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate92);
        filterIterator22.setIterator((java.util.Iterator) filterIterator96);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertTrue("'" + str90 + "' != '" + "{}" + "'", str90.equals("{}"));
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNull(obj93);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        filterIterator16.setIterator((java.util.Iterator) filterIterator21);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) filterIterator21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.util.Set set24 = defaultedMap15.keySet();
        java.util.Set set25 = defaultedMap15.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertNotNull(set25);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) predicate14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        defaultedMap22.clear();
        java.lang.Object obj26 = defaultedMap17.remove((java.lang.Object) defaultedMap22);
        java.lang.Object obj29 = defaultedMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.String str32 = defaultedMap31.toString();
        defaultedMap31.clear();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.String str36 = defaultedMap35.toString();
        defaultedMap35.clear();
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap17.get((java.lang.Object) defaultedMap31);
        java.lang.Object obj40 = new java.lang.Object();
        java.lang.Object obj41 = defaultedMap17.get(obj40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) "hi!");
        defaultedMap43.clear();
        java.lang.Object obj48 = defaultedMap43.remove((java.lang.Object) true);
        boolean b49 = defaultedMap17.containsKey((java.lang.Object) defaultedMap43);
        java.util.Set set50 = defaultedMap43.entrySet();
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) set50);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = null;
        filterIterator25.setIterator(iterator26);
        filterIterator22.setIterator(iterator26);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) filterIterator22);
        collections.Predicate predicate30 = filterIterator22.getPredicate();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(predicate30);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Set set15 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) filterIterator22);
        filterIterator1.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate29 = filterIterator22.getPredicate();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
        org.junit.Assert.assertNull(predicate29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set13 = defaultedMap1.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        defaultedMap21.clear();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj25 = defaultedMap21.remove((java.lang.Object) predicate24);
        filterIterator17.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        filterIterator15.setIterator((java.util.Iterator) filterIterator17);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.util.Iterator iterator35 = null;
        filterIterator34.setIterator(iterator35);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.String str43 = defaultedMap42.toString();
        defaultedMap42.clear();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) predicate45);
        filterIterator38.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate49);
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        boolean b53 = defaultedMap30.containsValue((java.lang.Object) filterIterator52);
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate54);
        filterIterator17.setPredicate(predicate54);
        java.lang.Object obj57 = null;
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap(obj57);
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) "hi!");
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj62 = defaultedMap58.remove((java.lang.Object) predicate61);
        java.lang.Object obj63 = defaultedMap1.put((java.lang.Object) predicate54, (java.lang.Object) predicate61);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(obj63);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) "hi!");
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        java.lang.String str22 = defaultedMap19.toString();
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) "hi!");
        defaultedMap24.clear();
        java.lang.Object obj28 = defaultedMap19.remove((java.lang.Object) defaultedMap24);
        java.lang.Object obj31 = defaultedMap19.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj33 = defaultedMap19.get((java.lang.Object) predicate32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "hi!");
        java.lang.String str38 = defaultedMap35.toString();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) "hi!");
        defaultedMap40.clear();
        java.lang.Object obj44 = defaultedMap35.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj47 = defaultedMap35.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj49 = defaultedMap35.get((java.lang.Object) predicate48);
        java.util.Map map50 = collections.map.PredicatedMap.decorate(map17, predicate32, predicate48);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) map17);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) b8);
        boolean b10 = defaultedMap1.isEmpty();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        boolean b13 = defaultedMap12.isEmpty();
        boolean b15 = defaultedMap12.containsKey((java.lang.Object) 10);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) filterIterator16);
        defaultedMap1.putAll(map18);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map18);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) predicate4);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b20 = defaultedMap11.equals((java.lang.Object) str19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        java.lang.String str25 = defaultedMap22.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj31 = defaultedMap22.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj34 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = defaultedMap22.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap22.get(obj45);
        boolean b47 = defaultedMap11.equals((java.lang.Object) defaultedMap22);
        java.util.Set set48 = defaultedMap22.entrySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        int i53 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 1);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Iterator iterator0 = null;
        java.util.Iterator iterator1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator1);
        java.util.Iterator iterator3 = null;
        filterIterator2.setIterator(iterator3);
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.lang.String str11 = defaultedMap10.toString();
        defaultedMap10.clear();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) predicate13);
        filterIterator6.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        filterIterator6.setPredicate(predicate17);
        filterIterator2.setIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = null;
        filterIterator26.setIterator(iterator27);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.Predicate predicate31 = null;
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.String str35 = defaultedMap34.toString();
        defaultedMap34.clear();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) predicate37);
        filterIterator30.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate41);
        filterIterator26.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        boolean b45 = defaultedMap22.containsValue((java.lang.Object) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator0, predicate46);
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        try {
            java.lang.Object obj51 = filterIterator49.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate50);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Collection collection6 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        filterIterator32.setIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) predicate43);
        filterIterator36.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate47);
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator26.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) filterIterator22, (java.lang.Object) filterIterator32);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = null;
        filterIterator55.setIterator(iterator56);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        collections.Predicate predicate60 = null;
        filterIterator59.setPredicate(predicate60);
        java.lang.Object obj62 = null;
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap(obj62);
        java.lang.String str64 = defaultedMap63.toString();
        defaultedMap63.clear();
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj67 = defaultedMap63.remove((java.lang.Object) predicate66);
        filterIterator59.setPredicate(predicate66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        filterIterator59.setPredicate(predicate70);
        filterIterator55.setIterator((java.util.Iterator) filterIterator59);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        collections.Predicate predicate76 = null;
        filterIterator75.setPredicate(predicate76);
        java.lang.Object obj78 = null;
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap(obj78);
        java.lang.String str80 = defaultedMap79.toString();
        defaultedMap79.clear();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj83 = defaultedMap79.remove((java.lang.Object) predicate82);
        filterIterator75.setPredicate(predicate82);
        java.util.Iterator iterator85 = null;
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator85);
        collections.Predicate predicate87 = null;
        filterIterator86.setPredicate(predicate87);
        java.lang.Object obj89 = null;
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap(obj89);
        java.lang.String str91 = defaultedMap90.toString();
        defaultedMap90.clear();
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj94 = defaultedMap90.remove((java.lang.Object) predicate93);
        filterIterator86.setPredicate(predicate93);
        filterIterator75.setPredicate(predicate93);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate93);
        collections.iterators.FilterIterator filterIterator98 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate93);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "{}" + "'", str91.equals("{}"));
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        collections.PredicateUtils predicateUtils9 = new collections.PredicateUtils();
        boolean b10 = defaultedMap5.containsKey((java.lang.Object) predicateUtils9);
        java.lang.Object obj12 = defaultedMap5.remove((java.lang.Object) (short) -1);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) "hi!");
        defaultedMap14.clear();
        java.lang.Object obj19 = defaultedMap14.remove((java.lang.Object) true);
        int i20 = defaultedMap14.size();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Set set23 = defaultedMap22.entrySet();
        java.util.Set set24 = defaultedMap22.keySet();
        boolean b25 = defaultedMap14.equals((java.lang.Object) defaultedMap22);
        defaultedMap5.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap28, (java.lang.Object) "hi!");
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) predicate39);
        filterIterator32.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        collections.Predicate predicate44 = null;
        filterIterator43.setPredicate(predicate44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.lang.String str48 = defaultedMap47.toString();
        defaultedMap47.clear();
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj51 = defaultedMap47.remove((java.lang.Object) predicate50);
        filterIterator43.setPredicate(predicate50);
        filterIterator32.setPredicate(predicate50);
        collections.Predicate predicate54 = null;
        java.util.Map map55 = collections.map.PredicatedMap.decorate(map30, predicate50, predicate54);
        java.lang.Object obj56 = defaultedMap14.remove((java.lang.Object) predicate50);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = null;
        filterIterator6.setIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) predicate17);
        filterIterator10.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate21);
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        java.lang.Object obj24 = defaultedMap4.remove((java.lang.Object) filterIterator10);
        boolean b25 = defaultedMap1.containsKey(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) "hi!");
        defaultedMap36.clear();
        java.lang.Object obj40 = defaultedMap31.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj43 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) predicate44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "hi!");
        java.lang.String str50 = defaultedMap47.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) "hi!");
        defaultedMap52.clear();
        java.lang.Object obj56 = defaultedMap47.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj59 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj61 = defaultedMap47.get((java.lang.Object) predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map29, predicate44, predicate60);
        boolean b63 = defaultedMap1.equals((java.lang.Object) predicate44);
        int i64 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue(i64 == 0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) predicate30);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        int i33 = defaultedMap1.size();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj43 = defaultedMap39.remove((java.lang.Object) predicate42);
        filterIterator35.setPredicate(predicate42);
        java.lang.Object obj45 = defaultedMap1.remove((java.lang.Object) predicate42);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 1);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj45);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.lang.String str38 = defaultedMap1.toString();
        java.util.Collection collection39 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(collection39);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate15);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Collection collection13 = defaultedMap6.values();
        int i14 = defaultedMap6.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(i14 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) predicate18);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = null;
        filterIterator22.setIterator(iterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap30.remove((java.lang.Object) predicate33);
        filterIterator26.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate37);
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator22);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) "hi!");
        java.lang.String str45 = defaultedMap42.toString();
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "hi!");
        defaultedMap47.clear();
        java.lang.Object obj51 = defaultedMap42.remove((java.lang.Object) defaultedMap47);
        java.lang.Object obj54 = defaultedMap42.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.String str57 = defaultedMap56.toString();
        defaultedMap56.clear();
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        java.lang.Object obj63 = defaultedMap56.get((java.lang.Object) defaultedMap60);
        java.lang.Object obj64 = defaultedMap42.get((java.lang.Object) defaultedMap56);
        boolean b66 = defaultedMap42.containsKey((java.lang.Object) 100);
        java.lang.Object obj67 = null;
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap(obj67);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap68, (java.lang.Object) "hi!");
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj72 = defaultedMap68.remove((java.lang.Object) predicate71);
        boolean b73 = defaultedMap42.equals((java.lang.Object) defaultedMap68);
        int i74 = defaultedMap42.size();
        java.util.Iterator iterator75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator75);
        collections.Predicate predicate77 = null;
        filterIterator76.setPredicate(predicate77);
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        java.lang.String str81 = defaultedMap80.toString();
        defaultedMap80.clear();
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj84 = defaultedMap80.remove((java.lang.Object) predicate83);
        filterIterator76.setPredicate(predicate83);
        java.lang.Object obj86 = defaultedMap42.remove((java.lang.Object) predicate83);
        filterIterator22.setPredicate(predicate83);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(i74 == 1);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj9 = defaultedMap5.remove((java.lang.Object) predicate8);
        filterIterator1.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) defaultedMap9);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) predicateUtils13);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        java.util.Collection collection18 = defaultedMap9.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) filterIterator22);
        filterIterator1.setIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        boolean b34 = defaultedMap29.containsKey((java.lang.Object) filterIterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = null;
        filterIterator36.setIterator(iterator37);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.String str45 = defaultedMap44.toString();
        defaultedMap44.clear();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) predicate47);
        filterIterator40.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate51);
        filterIterator36.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.lang.String str61 = defaultedMap60.toString();
        defaultedMap60.clear();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap60.remove((java.lang.Object) predicate63);
        filterIterator56.setPredicate(predicate63);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        java.lang.Object obj70 = null;
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap(obj70);
        java.lang.String str72 = defaultedMap71.toString();
        defaultedMap71.clear();
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj75 = defaultedMap71.remove((java.lang.Object) predicate74);
        filterIterator67.setPredicate(predicate74);
        filterIterator56.setPredicate(predicate74);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate74);
        filterIterator33.setPredicate(predicate74);
        filterIterator22.setIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNull(obj75);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) true);
        int i23 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) "hi!");
        java.lang.String str35 = defaultedMap32.toString();
        boolean b36 = defaultedMap27.equals((java.lang.Object) str35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        java.lang.String str41 = defaultedMap38.toString();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) "hi!");
        defaultedMap43.clear();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.String str53 = defaultedMap52.toString();
        defaultedMap52.clear();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.String str57 = defaultedMap56.toString();
        defaultedMap56.clear();
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) defaultedMap56);
        java.lang.Object obj60 = defaultedMap38.get((java.lang.Object) defaultedMap52);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Object obj62 = defaultedMap38.get(obj61);
        boolean b63 = defaultedMap27.equals((java.lang.Object) defaultedMap38);
        java.util.Set set64 = defaultedMap38.entrySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap38);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj67 = defaultedMap7.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) "hi!");
        java.lang.String str72 = defaultedMap69.toString();
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) "hi!");
        defaultedMap74.clear();
        java.lang.Object obj78 = defaultedMap69.remove((java.lang.Object) defaultedMap74);
        java.lang.Object obj80 = defaultedMap69.get((java.lang.Object) (short) -1);
        java.lang.Object obj82 = defaultedMap69.remove((java.lang.Object) 'a');
        java.util.Iterator iterator83 = null;
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator83);
        collections.Predicate predicate85 = null;
        filterIterator84.setPredicate(predicate85);
        collections.Predicate predicate87 = filterIterator84.getPredicate();
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator88);
        filterIterator84.setIterator((java.util.Iterator) filterIterator89);
        boolean b91 = defaultedMap69.containsValue((java.lang.Object) filterIterator89);
        java.lang.Object obj92 = defaultedMap7.get((java.lang.Object) defaultedMap69);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0d + "'", obj67.equals(100.0d));
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNull(predicate87);
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 100.0d + "'", obj92.equals(100.0d));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator1.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(predicate19);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        int i16 = defaultedMap7.size();
        collections.Transformer transformer17 = null;
        try {
            java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(i16 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        boolean b10 = defaultedMap7.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        boolean b16 = defaultedMap7.equals((java.lang.Object) str15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) "hi!");
        java.lang.String str21 = defaultedMap18.toString();
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) "hi!");
        defaultedMap23.clear();
        java.lang.Object obj27 = defaultedMap18.remove((java.lang.Object) defaultedMap23);
        java.lang.Object obj30 = defaultedMap18.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        java.lang.Object obj39 = defaultedMap32.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj40 = defaultedMap18.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Object obj42 = defaultedMap18.get(obj41);
        boolean b43 = defaultedMap7.equals((java.lang.Object) defaultedMap18);
        java.lang.String str44 = defaultedMap18.toString();
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = null;
        filterIterator46.setIterator(iterator47);
        java.lang.Object obj49 = defaultedMap18.get((java.lang.Object) filterIterator46);
        java.lang.Object obj50 = defaultedMap1.remove((java.lang.Object) defaultedMap18);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{-1.0=100}" + "'", str44.equals("{-1.0=100}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) predicate18);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) predicate25);
        boolean b27 = defaultedMap5.containsKey((java.lang.Object) defaultedMap22);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap29.clear();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        filterIterator33.setIterator(iterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.String str42 = defaultedMap41.toString();
        defaultedMap41.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) predicate44);
        filterIterator37.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate48);
        filterIterator33.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        boolean b52 = defaultedMap29.containsValue((java.lang.Object) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        collections.Predicate predicate55 = filterIterator51.getPredicate();
        java.lang.Object obj56 = defaultedMap22.get((java.lang.Object) filterIterator51);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) predicate18);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        java.lang.String str21 = defaultedMap5.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{-1.0=100}" + "'", str21.equals("{-1.0=100}"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        java.lang.String str22 = defaultedMap19.toString();
        boolean b23 = defaultedMap14.equals((java.lang.Object) str22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        java.lang.String str28 = defaultedMap25.toString();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) "hi!");
        defaultedMap30.clear();
        java.lang.Object obj34 = defaultedMap25.remove((java.lang.Object) defaultedMap30);
        java.lang.Object obj37 = defaultedMap25.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.String str44 = defaultedMap43.toString();
        defaultedMap43.clear();
        java.lang.Object obj46 = defaultedMap39.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj47 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Object obj49 = defaultedMap25.get(obj48);
        boolean b50 = defaultedMap14.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj51 = defaultedMap9.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.String str54 = defaultedMap53.toString();
        defaultedMap53.clear();
        java.lang.Object obj56 = null;
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap(obj56);
        java.lang.String str58 = defaultedMap57.toString();
        defaultedMap57.clear();
        java.lang.Object obj60 = defaultedMap53.get((java.lang.Object) defaultedMap57);
        java.util.Collection collection61 = defaultedMap57.values();
        defaultedMap25.putAll((java.util.Map) defaultedMap57);
        java.lang.String str63 = defaultedMap57.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate32);
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator38);
        filterIterator17.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator44);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + ' ' + "'", obj42.equals(' '));
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        defaultedMap23.clear();
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        boolean b34 = defaultedMap23.containsKey((java.lang.Object) predicate33);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        defaultedMap12.clear();
        java.lang.Object obj17 = defaultedMap12.remove((java.lang.Object) true);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) "hi!");
        java.lang.String str36 = defaultedMap33.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        defaultedMap38.clear();
        java.lang.Object obj42 = defaultedMap33.remove((java.lang.Object) defaultedMap38);
        defaultedMap1.putAll((java.util.Map) defaultedMap38);
        java.util.Set set44 = defaultedMap1.entrySet();
        java.lang.Object obj45 = null;
        boolean b46 = defaultedMap1.containsValue(obj45);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Set set2 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = null;
        filterIterator5.setIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate20);
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        collections.Predicate predicate29 = null;
        filterIterator28.setPredicate(predicate29);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap32.remove((java.lang.Object) predicate35);
        filterIterator28.setPredicate(predicate35);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        collections.Predicate predicate40 = null;
        filterIterator39.setPredicate(predicate40);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.String str44 = defaultedMap43.toString();
        defaultedMap43.clear();
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap43.remove((java.lang.Object) predicate46);
        filterIterator39.setPredicate(predicate46);
        filterIterator28.setPredicate(predicate46);
        collections.Predicate predicate50 = filterIterator28.getPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate50);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate50);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Set set6 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = null;
        filterIterator10.setIterator(iterator11);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.String str19 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) predicate21);
        filterIterator14.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate25);
        filterIterator10.setIterator((java.util.Iterator) filterIterator14);
        java.lang.Object obj28 = defaultedMap8.remove((java.lang.Object) filterIterator14);
        boolean b29 = defaultedMap5.containsKey(obj28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "hi!");
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) "hi!");
        java.lang.String str38 = defaultedMap35.toString();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) "hi!");
        defaultedMap40.clear();
        java.lang.Object obj44 = defaultedMap35.remove((java.lang.Object) defaultedMap40);
        java.lang.Object obj47 = defaultedMap35.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj49 = defaultedMap35.get((java.lang.Object) predicate48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) "hi!");
        java.lang.String str54 = defaultedMap51.toString();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) "hi!");
        defaultedMap56.clear();
        java.lang.Object obj60 = defaultedMap51.remove((java.lang.Object) defaultedMap56);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj65 = defaultedMap51.get((java.lang.Object) predicate64);
        java.util.Map map66 = collections.map.PredicatedMap.decorate(map33, predicate48, predicate64);
        boolean b67 = defaultedMap5.equals((java.lang.Object) predicate48);
        java.lang.Object obj68 = null;
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap(obj68);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap69, (java.lang.Object) "hi!");
        java.lang.String str72 = defaultedMap69.toString();
        java.lang.Object obj73 = null;
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap(obj73);
        java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap74, (java.lang.Object) "hi!");
        defaultedMap74.clear();
        java.lang.Object obj78 = defaultedMap69.remove((java.lang.Object) defaultedMap74);
        java.lang.Object obj80 = defaultedMap69.get((java.lang.Object) (short) -1);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Iterator iterator82 = null;
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator(iterator82);
        collections.Predicate predicate84 = null;
        filterIterator83.setPredicate(predicate84);
        java.lang.Object obj86 = null;
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap(obj86);
        java.lang.String str88 = defaultedMap87.toString();
        defaultedMap87.clear();
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj91 = defaultedMap87.remove((java.lang.Object) predicate90);
        filterIterator83.setPredicate(predicate90);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        filterIterator83.setPredicate(predicate94);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate81, predicate94);
        java.util.Map map97 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate48, predicate94);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(obj80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertTrue("'" + str88 + "' != '" + "{}" + "'", str88.equals("{}"));
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNull(obj91);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map97);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        boolean b8 = defaultedMap7.isEmpty();
        java.util.Collection collection9 = defaultedMap7.values();
        boolean b10 = defaultedMap1.equals((java.lang.Object) collection9);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) predicate18);
        filterIterator11.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate22);
        java.util.Collection collection25 = defaultedMap1.values();
        java.lang.String str26 = defaultedMap1.toString();
        java.lang.String str27 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) filterIterator5);
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) "hi!");
        java.lang.String str36 = defaultedMap33.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        defaultedMap38.clear();
        java.lang.Object obj42 = defaultedMap33.remove((java.lang.Object) defaultedMap38);
        defaultedMap1.putAll((java.util.Map) defaultedMap38);
        java.util.Set set44 = defaultedMap1.entrySet();
        java.lang.Object obj45 = null;
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap(obj45);
        java.util.Map map48 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) "hi!");
        java.lang.String str49 = defaultedMap46.toString();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) "hi!");
        defaultedMap51.clear();
        java.lang.Object obj55 = defaultedMap46.remove((java.lang.Object) defaultedMap51);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap51);
        java.lang.Object obj57 = defaultedMap1.get((java.lang.Object) defaultedMap51);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 'a' + "'", obj57.equals('a'));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) "hi!");
        java.lang.String str18 = defaultedMap15.toString();
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) "hi!");
        defaultedMap20.clear();
        java.lang.Object obj24 = defaultedMap15.remove((java.lang.Object) defaultedMap20);
        java.lang.Object obj27 = defaultedMap15.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap29.clear();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.lang.String str34 = defaultedMap33.toString();
        defaultedMap33.clear();
        java.lang.Object obj36 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        java.lang.Object obj37 = defaultedMap15.get((java.lang.Object) defaultedMap29);
        java.util.Set set38 = defaultedMap29.keySet();
        boolean b39 = defaultedMap1.containsKey((java.lang.Object) set38);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set13 = defaultedMap1.entrySet();
        boolean b14 = defaultedMap1.isEmpty();
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) (short) 0);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        defaultedMap8.clear();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        boolean b18 = defaultedMap13.containsKey((java.lang.Object) filterIterator17);
        java.lang.Object obj19 = defaultedMap8.get((java.lang.Object) defaultedMap13);
        int i20 = defaultedMap8.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        java.util.Set set22 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.lang.String str38 = defaultedMap12.toString();
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = null;
        filterIterator40.setIterator(iterator41);
        java.lang.Object obj43 = defaultedMap12.get((java.lang.Object) filterIterator40);
        try {
            filterIterator40.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{-1.0=100}" + "'", str38.equals("{-1.0=100}"));
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) predicate30);
        boolean b32 = defaultedMap1.equals((java.lang.Object) defaultedMap27);
        int i33 = defaultedMap1.size();
        collections.Transformer transformer34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) predicate39);
        filterIterator32.setPredicate(predicate39);
        filterIterator21.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate39);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) "hi!");
        java.lang.String str48 = defaultedMap45.toString();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        defaultedMap50.clear();
        java.lang.Object obj54 = defaultedMap45.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj57 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj59 = defaultedMap45.get((java.lang.Object) predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate58);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(obj59);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        defaultedMap25.clear();
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) true);
        int i31 = defaultedMap25.size();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.util.Set set35 = defaultedMap33.keySet();
        boolean b36 = defaultedMap25.equals((java.lang.Object) defaultedMap33);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        java.lang.Object obj41 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap(obj41);
        java.lang.String str43 = defaultedMap42.toString();
        defaultedMap42.clear();
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap42.remove((java.lang.Object) predicate45);
        filterIterator38.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        filterIterator38.setPredicate(predicate49);
        java.lang.Object obj51 = defaultedMap25.get((java.lang.Object) filterIterator38);
        filterIterator7.setIterator((java.util.Iterator) filterIterator38);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj51);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        filterIterator33.setIterator(iterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.String str42 = defaultedMap41.toString();
        defaultedMap41.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) predicate44);
        filterIterator37.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate48);
        filterIterator33.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.String str54 = defaultedMap53.toString();
        defaultedMap53.clear();
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        java.util.Iterator iterator58 = null;
        filterIterator57.setIterator(iterator58);
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.lang.String str66 = defaultedMap65.toString();
        defaultedMap65.clear();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap65.remove((java.lang.Object) predicate68);
        filterIterator61.setPredicate(predicate68);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        filterIterator61.setPredicate(predicate72);
        filterIterator57.setIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        boolean b76 = defaultedMap53.containsValue((java.lang.Object) filterIterator75);
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate77);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate77);
        boolean b80 = defaultedMap1.equals((java.lang.Object) filterIterator51);
        java.util.Set set81 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNotNull(set81);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        filterIterator17.setIterator((java.util.Iterator) filterIterator22);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = null;
        filterIterator25.setIterator(iterator26);
        filterIterator22.setIterator(iterator26);
        boolean b29 = defaultedMap1.containsKey((java.lang.Object) filterIterator22);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap7.toString();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        defaultedMap12.clear();
        java.lang.Object obj16 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        defaultedMap21.clear();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        boolean b30 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        boolean b31 = defaultedMap7.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        int i13 = defaultedMap1.size();
        boolean b14 = defaultedMap1.isEmpty();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        defaultedMap21.clear();
        java.lang.Object obj25 = defaultedMap16.remove((java.lang.Object) defaultedMap21);
        java.lang.Object obj27 = defaultedMap16.get((java.lang.Object) (short) -1);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        collections.Predicate predicate31 = null;
        filterIterator30.setPredicate(predicate31);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.lang.String str35 = defaultedMap34.toString();
        defaultedMap34.clear();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap34.remove((java.lang.Object) predicate37);
        filterIterator30.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator30.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate28, predicate41);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) "hi!");
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.lang.String str54 = defaultedMap53.toString();
        defaultedMap53.clear();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap53.remove((java.lang.Object) predicate56);
        filterIterator49.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        java.lang.Object obj63 = null;
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap(obj63);
        java.lang.String str65 = defaultedMap64.toString();
        defaultedMap64.clear();
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj68 = defaultedMap64.remove((java.lang.Object) predicate67);
        filterIterator60.setPredicate(predicate67);
        filterIterator49.setPredicate(predicate67);
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate(map47, predicate67, predicate71);
        boolean b73 = defaultedMap16.containsValue((java.lang.Object) map72);
        boolean b74 = defaultedMap1.equals((java.lang.Object) b73);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) filterIterator22);
        filterIterator1.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        try {
            java.lang.Object obj29 = filterIterator28.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        java.lang.String str9 = defaultedMap6.toString();
        boolean b10 = defaultedMap1.equals((java.lang.Object) str9);
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap12.toString();
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) defaultedMap17);
        java.lang.Object obj24 = defaultedMap12.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.lang.String str27 = defaultedMap26.toString();
        defaultedMap26.clear();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.lang.String str31 = defaultedMap30.toString();
        defaultedMap30.clear();
        java.lang.Object obj33 = defaultedMap26.get((java.lang.Object) defaultedMap30);
        java.lang.Object obj34 = defaultedMap12.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Object obj36 = defaultedMap12.get(obj35);
        boolean b37 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.lang.String str38 = defaultedMap12.toString();
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = null;
        filterIterator40.setIterator(iterator41);
        java.lang.Object obj43 = defaultedMap12.get((java.lang.Object) filterIterator40);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{-1.0=100}" + "'", str38.equals("{-1.0=100}"));
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) true);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        int i34 = defaultedMap27.size();
        java.util.Set set35 = defaultedMap27.keySet();
        java.lang.Object obj37 = defaultedMap27.get((java.lang.Object) '4');
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.lang.Object obj12 = defaultedMap5.get((java.lang.Object) defaultedMap9);
        collections.PredicateUtils predicateUtils13 = new collections.PredicateUtils();
        boolean b14 = defaultedMap9.containsKey((java.lang.Object) predicateUtils13);
        java.lang.Object obj16 = defaultedMap9.remove((java.lang.Object) (short) -1);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap9);
        java.util.Set set18 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.String str4 = defaultedMap3.toString();
        defaultedMap3.clear();
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (byte) 0);
        boolean b8 = defaultedMap1.containsValue((java.lang.Object) (byte) 0);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (short) -1);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate16);
        try {
            java.lang.Object obj20 = filterIterator19.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        defaultedMap22.clear();
        java.lang.Object obj26 = defaultedMap17.remove((java.lang.Object) defaultedMap22);
        java.lang.Object obj28 = defaultedMap17.get((java.lang.Object) (short) -1);
        java.lang.Object obj29 = null;
        java.lang.Object obj30 = defaultedMap1.put((java.lang.Object) defaultedMap17, obj29);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Collection collection3 = defaultedMap1.values();
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(collection3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        java.lang.String str11 = defaultedMap8.toString();
        boolean b12 = defaultedMap3.equals((java.lang.Object) str11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) "hi!");
        java.lang.String str17 = defaultedMap14.toString();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap14.remove((java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = defaultedMap14.get(obj37);
        boolean b39 = defaultedMap3.equals((java.lang.Object) defaultedMap14);
        java.util.Set set40 = defaultedMap14.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) "hi!");
        java.lang.String str46 = defaultedMap43.toString();
        java.lang.Object obj47 = defaultedMap1.remove((java.lang.Object) defaultedMap43);
        int i48 = defaultedMap43.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate32);
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        boolean b37 = defaultedMap7.equals((java.lang.Object) filterIterator36);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj8);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        collections.Predicate predicate12 = null;
        filterIterator11.setPredicate(predicate12);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap15.remove((java.lang.Object) predicate18);
        filterIterator11.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator11.setPredicate(predicate22);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate22);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        defaultedMap27.clear();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.String str32 = defaultedMap31.toString();
        defaultedMap31.clear();
        java.lang.Object obj34 = defaultedMap27.get((java.lang.Object) defaultedMap31);
        collections.PredicateUtils predicateUtils35 = new collections.PredicateUtils();
        boolean b36 = defaultedMap31.containsKey((java.lang.Object) predicateUtils35);
        java.lang.Object obj38 = defaultedMap31.remove((java.lang.Object) (short) -1);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) "hi!");
        defaultedMap40.clear();
        java.lang.Object obj45 = defaultedMap40.remove((java.lang.Object) true);
        int i46 = defaultedMap40.size();
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.util.Set set49 = defaultedMap48.entrySet();
        java.util.Set set50 = defaultedMap48.keySet();
        boolean b51 = defaultedMap40.equals((java.lang.Object) defaultedMap48);
        defaultedMap31.putAll((java.util.Map) defaultedMap40);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        boolean b55 = defaultedMap31.containsValue((java.lang.Object) filterIterator53);
        java.lang.Object obj56 = defaultedMap1.put(obj25, (java.lang.Object) b55);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertTrue(i46 == 0);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertTrue(b51 == true);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj56);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) ' ');
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        filterIterator7.setIterator((java.util.Iterator) filterIterator12);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = null;
        filterIterator15.setIterator(iterator16);
        filterIterator12.setIterator(iterator16);
        boolean b19 = defaultedMap1.equals((java.lang.Object) filterIterator12);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        try {
            filterIterator19.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        java.lang.Object obj4 = defaultedMap1.get(obj3);
        java.util.Collection collection5 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) predicate39);
        filterIterator32.setPredicate(predicate39);
        filterIterator21.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate39);
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(iterator46);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        filterIterator32.setIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) predicate43);
        filterIterator36.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate47);
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator26.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) filterIterator22, (java.lang.Object) filterIterator32);
        java.util.Set set53 = defaultedMap1.keySet();
        java.lang.Object obj54 = null;
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap(obj54);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) "hi!");
        defaultedMap55.clear();
        defaultedMap55.clear();
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        collections.Predicate predicate64 = filterIterator61.getPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        filterIterator61.setIterator((java.util.Iterator) filterIterator66);
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        java.util.Iterator iterator70 = null;
        filterIterator69.setIterator(iterator70);
        filterIterator66.setIterator(iterator70);
        boolean b73 = defaultedMap55.equals((java.lang.Object) filterIterator66);
        defaultedMap1.putAll((java.util.Map) defaultedMap55);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertTrue(b73 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        filterIterator32.setIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) predicate43);
        filterIterator36.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate47);
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator26.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) filterIterator22, (java.lang.Object) filterIterator32);
        java.util.Iterator iterator53 = filterIterator22.getIterator();
        java.util.Iterator iterator54 = filterIterator22.getIterator();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
        org.junit.Assert.assertNotNull(iterator54);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        int i11 = defaultedMap1.size();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.String str14 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.lang.String str23 = defaultedMap22.toString();
        defaultedMap22.clear();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) predicate25);
        filterIterator18.setPredicate(predicate25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        filterIterator16.setIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30);
        filterIterator16.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        boolean b34 = defaultedMap1.equals((java.lang.Object) filterIterator33);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator3);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ' ' + "'", obj7.equals(' '));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) predicate14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        java.lang.String str20 = defaultedMap17.toString();
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        defaultedMap22.clear();
        java.lang.Object obj26 = defaultedMap17.remove((java.lang.Object) defaultedMap22);
        java.lang.Object obj29 = defaultedMap17.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.String str32 = defaultedMap31.toString();
        defaultedMap31.clear();
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.String str36 = defaultedMap35.toString();
        defaultedMap35.clear();
        java.lang.Object obj38 = defaultedMap31.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj39 = defaultedMap17.get((java.lang.Object) defaultedMap31);
        boolean b41 = defaultedMap17.containsKey((java.lang.Object) 100);
        java.util.Set set42 = defaultedMap17.entrySet();
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap1.put((java.lang.Object) set42, obj43);
        int i45 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(i45 == 2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.util.Set set3 = defaultedMap1.keySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj17 = defaultedMap5.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj19 = defaultedMap5.get((java.lang.Object) predicate18);
        java.lang.Object obj20 = defaultedMap1.remove((java.lang.Object) defaultedMap5);
        int i21 = defaultedMap1.size();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator5 = null;
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator(iterator5);
        java.util.Iterator iterator7 = null;
        filterIterator6.setIterator(iterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        defaultedMap14.clear();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap14.remove((java.lang.Object) predicate17);
        filterIterator10.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        filterIterator10.setPredicate(predicate21);
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        java.lang.Object obj24 = defaultedMap4.remove((java.lang.Object) filterIterator10);
        boolean b25 = defaultedMap1.containsKey(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "hi!");
        java.lang.String str34 = defaultedMap31.toString();
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) "hi!");
        defaultedMap36.clear();
        java.lang.Object obj40 = defaultedMap31.remove((java.lang.Object) defaultedMap36);
        java.lang.Object obj43 = defaultedMap31.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj45 = defaultedMap31.get((java.lang.Object) predicate44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) "hi!");
        java.lang.String str50 = defaultedMap47.toString();
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) "hi!");
        defaultedMap52.clear();
        java.lang.Object obj56 = defaultedMap47.remove((java.lang.Object) defaultedMap52);
        java.lang.Object obj59 = defaultedMap47.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj61 = defaultedMap47.get((java.lang.Object) predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate(map29, predicate44, predicate60);
        boolean b63 = defaultedMap1.equals((java.lang.Object) predicate44);
        java.lang.String str64 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate32);
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator38);
        filterIterator17.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        java.util.Set set48 = defaultedMap47.entrySet();
        java.util.Set set49 = defaultedMap47.keySet();
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) "hi!");
        java.lang.String str54 = defaultedMap51.toString();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) "hi!");
        defaultedMap56.clear();
        java.lang.Object obj60 = defaultedMap51.remove((java.lang.Object) defaultedMap56);
        java.lang.Object obj63 = defaultedMap51.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj65 = defaultedMap51.get((java.lang.Object) predicate64);
        java.lang.Object obj66 = defaultedMap47.remove((java.lang.Object) defaultedMap51);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 'a');
        boolean b69 = defaultedMap1.containsValue((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + ' ' + "'", obj42.equals(' '));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        collections.Predicate predicate18 = null;
        filterIterator17.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) filterIterator17);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = null;
        filterIterator23.setIterator(iterator24);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.lang.String str32 = defaultedMap31.toString();
        defaultedMap31.clear();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj35 = defaultedMap31.remove((java.lang.Object) predicate34);
        filterIterator27.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        filterIterator27.setPredicate(predicate38);
        filterIterator23.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator17.setIterator((java.util.Iterator) filterIterator23);
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.Predicate predicate45 = null;
        filterIterator44.setPredicate(predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44);
        filterIterator23.setIterator((java.util.Iterator) filterIterator44);
        boolean b49 = defaultedMap1.equals((java.lang.Object) filterIterator23);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + ' ' + "'", obj21.equals(' '));
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.String str4 = defaultedMap1.toString();
        boolean b5 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        try {
            filterIterator5.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b7 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        filterIterator32.setIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) predicate43);
        filterIterator36.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate47);
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator26.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) filterIterator22, (java.lang.Object) filterIterator32);
        java.util.Iterator iterator53 = filterIterator22.getIterator();
        try {
            java.lang.Object obj54 = filterIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(iterator53);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        boolean b4 = defaultedMap1.containsKey((java.lang.Object) 10);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator5);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate16);
        java.util.Iterator iterator20 = filterIterator5.getIterator();
        collections.Predicate predicate21 = null;
        filterIterator5.setPredicate(predicate21);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(iterator20);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        collections.Predicate predicate15 = null;
        filterIterator14.setPredicate(predicate15);
        java.lang.Object obj17 = null;
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap(obj17);
        java.lang.String str19 = defaultedMap18.toString();
        defaultedMap18.clear();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) predicate21);
        filterIterator14.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        filterIterator14.setPredicate(predicate25);
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) filterIterator14);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = null;
        filterIterator29.setIterator(iterator30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.lang.String str38 = defaultedMap37.toString();
        defaultedMap37.clear();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) predicate40);
        filterIterator33.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        filterIterator33.setPredicate(predicate44);
        filterIterator29.setIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        java.lang.Object obj48 = null;
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap(obj48);
        java.lang.String str50 = defaultedMap49.toString();
        defaultedMap49.clear();
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = null;
        filterIterator53.setIterator(iterator54);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.String str62 = defaultedMap61.toString();
        defaultedMap61.clear();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) predicate64);
        filterIterator57.setPredicate(predicate64);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate68);
        filterIterator53.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        boolean b72 = defaultedMap49.containsValue((java.lang.Object) filterIterator71);
        collections.Predicate predicate73 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71, predicate73);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47, predicate73);
        filterIterator14.setPredicate(predicate73);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = null;
        filterIterator5.setIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate20);
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        defaultedMap26.clear();
        java.lang.Object obj30 = null;
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap(obj30);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        boolean b36 = defaultedMap31.containsKey((java.lang.Object) filterIterator35);
        java.lang.Object obj37 = defaultedMap26.get((java.lang.Object) defaultedMap31);
        int i38 = defaultedMap26.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap26);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue(i38 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        java.lang.String str13 = defaultedMap10.toString();
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) "hi!");
        defaultedMap15.clear();
        java.lang.Object obj19 = defaultedMap10.remove((java.lang.Object) defaultedMap15);
        java.lang.Object obj22 = defaultedMap10.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj23 = null;
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        java.lang.String str25 = defaultedMap24.toString();
        defaultedMap24.clear();
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.Object obj31 = defaultedMap24.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj32 = defaultedMap10.get((java.lang.Object) defaultedMap24);
        boolean b34 = defaultedMap10.containsKey((java.lang.Object) 100);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj40 = defaultedMap36.remove((java.lang.Object) predicate39);
        boolean b41 = defaultedMap10.equals((java.lang.Object) defaultedMap36);
        int i42 = defaultedMap10.size();
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        collections.Predicate predicate45 = null;
        filterIterator44.setPredicate(predicate45);
        java.lang.Object obj47 = null;
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap(obj47);
        java.lang.String str49 = defaultedMap48.toString();
        defaultedMap48.clear();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap48.remove((java.lang.Object) predicate51);
        filterIterator44.setPredicate(predicate51);
        java.lang.Object obj54 = defaultedMap10.remove((java.lang.Object) predicate51);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) predicate51);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue(i42 == 1);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (short) -1);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj23 = defaultedMap19.remove((java.lang.Object) predicate22);
        filterIterator15.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate26 = collections.PredicateUtils.truePredicate();
        filterIterator15.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate13, predicate26);
        collections.Factory factory29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        filterIterator1.setIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = null;
        filterIterator9.setIterator(iterator10);
        filterIterator6.setIterator(iterator10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        collections.Predicate predicate17 = null;
        filterIterator16.setPredicate(predicate17);
        java.lang.Object obj19 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap(obj19);
        java.lang.String str21 = defaultedMap20.toString();
        defaultedMap20.clear();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) predicate23);
        filterIterator16.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator14.setIterator((java.util.Iterator) filterIterator16);
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap29.clear();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = null;
        filterIterator33.setIterator(iterator34);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        java.lang.Object obj40 = null;
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap(obj40);
        java.lang.String str42 = defaultedMap41.toString();
        defaultedMap41.clear();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap41.remove((java.lang.Object) predicate44);
        filterIterator37.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        filterIterator37.setPredicate(predicate48);
        filterIterator33.setIterator((java.util.Iterator) filterIterator37);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        boolean b52 = defaultedMap29.containsValue((java.lang.Object) filterIterator51);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate53);
        filterIterator16.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate53);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(predicate53);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) "hi!");
        defaultedMap17.clear();
        java.lang.Object obj22 = defaultedMap17.remove((java.lang.Object) true);
        int i23 = defaultedMap17.size();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        boolean b30 = defaultedMap27.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) "hi!");
        java.lang.String str35 = defaultedMap32.toString();
        boolean b36 = defaultedMap27.equals((java.lang.Object) str35);
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        java.lang.String str41 = defaultedMap38.toString();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) "hi!");
        defaultedMap43.clear();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj51 = null;
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap(obj51);
        java.lang.String str53 = defaultedMap52.toString();
        defaultedMap52.clear();
        java.lang.Object obj55 = null;
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap(obj55);
        java.lang.String str57 = defaultedMap56.toString();
        defaultedMap56.clear();
        java.lang.Object obj59 = defaultedMap52.get((java.lang.Object) defaultedMap56);
        java.lang.Object obj60 = defaultedMap38.get((java.lang.Object) defaultedMap52);
        java.lang.Object obj61 = new java.lang.Object();
        java.lang.Object obj62 = defaultedMap38.get(obj61);
        boolean b63 = defaultedMap27.equals((java.lang.Object) defaultedMap38);
        java.util.Set set64 = defaultedMap38.entrySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap38);
        defaultedMap17.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj67 = defaultedMap7.get((java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0d + "'", obj67.equals(100.0d));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) 0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator7.setIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        collections.Predicate predicate27 = null;
        filterIterator26.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        java.lang.Object obj30 = defaultedMap24.get((java.lang.Object) filterIterator26);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = null;
        filterIterator32.setIterator(iterator33);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap40.remove((java.lang.Object) predicate43);
        filterIterator36.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate47);
        filterIterator32.setIterator((java.util.Iterator) filterIterator36);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator26.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj52 = defaultedMap1.put((java.lang.Object) filterIterator22, (java.lang.Object) filterIterator32);
        java.lang.Object obj53 = null;
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap(obj53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap54, (java.lang.Object) "hi!");
        java.lang.String str57 = defaultedMap54.toString();
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) "hi!");
        defaultedMap59.clear();
        java.lang.Object obj63 = defaultedMap54.remove((java.lang.Object) defaultedMap59);
        java.lang.Object obj66 = defaultedMap54.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        java.util.Iterator iterator68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator68);
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        java.lang.Object obj72 = null;
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap(obj72);
        java.lang.String str74 = defaultedMap73.toString();
        defaultedMap73.clear();
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj77 = defaultedMap73.remove((java.lang.Object) predicate76);
        filterIterator69.setPredicate(predicate76);
        java.util.Map map79 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap54, predicate67, predicate76);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate67);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' ' + "'", obj30.equals(' '));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(map79);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        boolean b25 = defaultedMap1.containsKey((java.lang.Object) 100);
        java.util.Set set26 = defaultedMap1.entrySet();
        java.util.Set set27 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator28 = null;
        filterIterator27.setIterator(iterator28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = null;
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.String str36 = defaultedMap35.toString();
        defaultedMap35.clear();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) predicate38);
        filterIterator31.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate42);
        filterIterator27.setIterator((java.util.Iterator) filterIterator31);
        java.lang.Object obj45 = defaultedMap25.remove((java.lang.Object) filterIterator31);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator31);
        java.util.Collection collection47 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(collection47);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) filterIterator5);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = defaultedMap8.remove((java.lang.Object) predicate11);
        filterIterator5.setPredicate(predicate11);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator5.setIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate19);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        int i22 = defaultedMap1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        try {
            java.lang.Object obj20 = filterIterator5.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.util.Set set10 = defaultedMap9.entrySet();
        java.util.Set set11 = defaultedMap9.keySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.lang.String str15 = defaultedMap14.toString();
        boolean b17 = defaultedMap14.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        java.lang.String str22 = defaultedMap19.toString();
        boolean b23 = defaultedMap14.equals((java.lang.Object) str22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        java.lang.String str28 = defaultedMap25.toString();
        java.lang.Object obj29 = null;
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap(obj29);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) "hi!");
        defaultedMap30.clear();
        java.lang.Object obj34 = defaultedMap25.remove((java.lang.Object) defaultedMap30);
        java.lang.Object obj37 = defaultedMap25.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.lang.String str44 = defaultedMap43.toString();
        defaultedMap43.clear();
        java.lang.Object obj46 = defaultedMap39.get((java.lang.Object) defaultedMap43);
        java.lang.Object obj47 = defaultedMap25.get((java.lang.Object) defaultedMap39);
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Object obj49 = defaultedMap25.get(obj48);
        boolean b50 = defaultedMap14.equals((java.lang.Object) defaultedMap25);
        java.lang.Object obj51 = defaultedMap9.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj52 = null;
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap(obj52);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) "hi!");
        defaultedMap53.clear();
        boolean b58 = defaultedMap53.containsValue((java.lang.Object) (short) 0);
        java.lang.Object obj59 = null;
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap(obj59);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) "hi!");
        defaultedMap60.clear();
        java.lang.Object obj64 = null;
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap(obj64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap65, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68);
        boolean b70 = defaultedMap65.containsKey((java.lang.Object) filterIterator69);
        java.lang.Object obj71 = defaultedMap60.get((java.lang.Object) defaultedMap65);
        int i72 = defaultedMap60.size();
        defaultedMap53.putAll((java.util.Map) defaultedMap60);
        defaultedMap9.putAll((java.util.Map) defaultedMap60);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(i72 == 0);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        java.lang.String str11 = defaultedMap8.toString();
        boolean b12 = defaultedMap3.equals((java.lang.Object) str11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) "hi!");
        java.lang.String str17 = defaultedMap14.toString();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap14.remove((java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = defaultedMap14.get(obj37);
        boolean b39 = defaultedMap3.equals((java.lang.Object) defaultedMap14);
        java.util.Set set40 = defaultedMap14.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) "hi!");
        java.lang.String str46 = defaultedMap43.toString();
        java.lang.Object obj47 = defaultedMap1.remove((java.lang.Object) defaultedMap43);
        boolean b48 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue(b48 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator5.setIterator((java.util.Iterator) filterIterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = null;
        filterIterator13.setIterator(iterator14);
        filterIterator10.setIterator(iterator14);
        java.lang.Object obj17 = defaultedMap1.remove((java.lang.Object) iterator14);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0d);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        filterIterator1.setIterator(iterator2);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap9.remove((java.lang.Object) predicate12);
        filterIterator5.setPredicate(predicate12);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        filterIterator5.setPredicate(predicate16);
        filterIterator1.setIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        collections.Predicate predicate23 = null;
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj26 = defaultedMap20.get((java.lang.Object) filterIterator22);
        filterIterator1.setIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        try {
            java.lang.Object obj29 = filterIterator22.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + ' ' + "'", obj26.equals(' '));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) predicate4);
        java.lang.Object obj6 = null;
        boolean b7 = defaultedMap1.equals(obj6);
        java.lang.String str8 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) 'a');
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        java.lang.Object obj21 = defaultedMap16.remove((java.lang.Object) true);
        int i22 = defaultedMap16.size();
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) i22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) "hi!");
        defaultedMap25.clear();
        java.lang.Object obj30 = defaultedMap25.remove((java.lang.Object) true);
        int i31 = defaultedMap25.size();
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Set set34 = defaultedMap33.entrySet();
        java.util.Set set35 = defaultedMap33.keySet();
        boolean b36 = defaultedMap25.equals((java.lang.Object) defaultedMap33);
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = null;
        filterIterator43.setIterator(iterator44);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.String str52 = defaultedMap51.toString();
        defaultedMap51.clear();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) predicate54);
        filterIterator47.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate58);
        filterIterator43.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        boolean b62 = defaultedMap39.containsValue((java.lang.Object) filterIterator61);
        java.lang.Object obj63 = defaultedMap33.remove((java.lang.Object) b62);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap33);
        boolean b65 = defaultedMap33.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertTrue(b65 == true);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = null;
        filterIterator5.setIterator(iterator6);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        collections.Predicate predicate10 = null;
        filterIterator9.setPredicate(predicate10);
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) predicate16);
        filterIterator9.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate20);
        filterIterator5.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        boolean b24 = defaultedMap1.containsValue((java.lang.Object) filterIterator23);
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate25);
        try {
            java.lang.Object obj27 = filterIterator23.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(predicate25);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        boolean b11 = defaultedMap6.containsKey((java.lang.Object) filterIterator10);
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Set set13 = defaultedMap1.entrySet();
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        boolean b14 = defaultedMap11.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        java.lang.String str19 = defaultedMap16.toString();
        boolean b20 = defaultedMap11.equals((java.lang.Object) str19);
        java.lang.Object obj21 = null;
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap(obj21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) "hi!");
        java.lang.String str25 = defaultedMap22.toString();
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj31 = defaultedMap22.remove((java.lang.Object) defaultedMap27);
        java.lang.Object obj34 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj35 = null;
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap(obj35);
        java.lang.String str37 = defaultedMap36.toString();
        defaultedMap36.clear();
        java.lang.Object obj39 = null;
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap(obj39);
        java.lang.String str41 = defaultedMap40.toString();
        defaultedMap40.clear();
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) defaultedMap40);
        java.lang.Object obj44 = defaultedMap22.get((java.lang.Object) defaultedMap36);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap22.get(obj45);
        boolean b47 = defaultedMap11.equals((java.lang.Object) defaultedMap22);
        java.util.Set set48 = defaultedMap22.entrySet();
        defaultedMap9.putAll((java.util.Map) defaultedMap22);
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        boolean b52 = defaultedMap1.containsValue((java.lang.Object) 100.0d);
        int i53 = defaultedMap1.size();
        int i54 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(i53 == 1);
        org.junit.Assert.assertTrue(i54 == 1);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator28 = null;
        filterIterator27.setIterator(iterator28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        collections.Predicate predicate32 = null;
        filterIterator31.setPredicate(predicate32);
        java.lang.Object obj34 = null;
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap(obj34);
        java.lang.String str36 = defaultedMap35.toString();
        defaultedMap35.clear();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap35.remove((java.lang.Object) predicate38);
        filterIterator31.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        filterIterator31.setPredicate(predicate42);
        filterIterator27.setIterator((java.util.Iterator) filterIterator31);
        java.lang.Object obj45 = defaultedMap25.remove((java.lang.Object) filterIterator31);
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator31);
        try {
            java.lang.Object obj47 = filterIterator31.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(map46);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        java.lang.Object obj6 = defaultedMap1.remove((java.lang.Object) true);
        int i7 = defaultedMap1.size();
        java.lang.Object obj8 = null;
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "hi!");
        java.lang.String str14 = defaultedMap11.toString();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        java.lang.Object obj20 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        defaultedMap1.putAll((java.util.Map) defaultedMap11);
        java.util.Set set22 = defaultedMap11.entrySet();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.lang.String str8 = defaultedMap7.toString();
        defaultedMap7.clear();
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj11 = defaultedMap7.remove((java.lang.Object) predicate10);
        filterIterator3.setPredicate(predicate10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        filterIterator1.setIterator((java.util.Iterator) filterIterator3);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator1.setIterator((java.util.Iterator) filterIterator15);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = null;
        filterIterator19.setIterator(iterator20);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.lang.String str28 = defaultedMap27.toString();
        defaultedMap27.clear();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap27.remove((java.lang.Object) predicate30);
        filterIterator23.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        filterIterator23.setPredicate(predicate34);
        filterIterator19.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.lang.Object obj38 = null;
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap(obj38);
        java.lang.String str40 = defaultedMap39.toString();
        defaultedMap39.clear();
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = null;
        filterIterator43.setIterator(iterator44);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        java.lang.Object obj50 = null;
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap(obj50);
        java.lang.String str52 = defaultedMap51.toString();
        defaultedMap51.clear();
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj55 = defaultedMap51.remove((java.lang.Object) predicate54);
        filterIterator47.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator47.setPredicate(predicate58);
        filterIterator43.setIterator((java.util.Iterator) filterIterator47);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        boolean b62 = defaultedMap39.containsValue((java.lang.Object) filterIterator61);
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37, predicate63);
        filterIterator15.setPredicate(predicate63);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.lang.Object obj2 = null;
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap(obj2);
        java.lang.String str4 = defaultedMap3.toString();
        boolean b6 = defaultedMap3.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj7 = null;
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap(obj7);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) "hi!");
        java.lang.String str11 = defaultedMap8.toString();
        boolean b12 = defaultedMap3.equals((java.lang.Object) str11);
        java.lang.Object obj13 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap(obj13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) "hi!");
        java.lang.String str17 = defaultedMap14.toString();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) "hi!");
        defaultedMap19.clear();
        java.lang.Object obj23 = defaultedMap14.remove((java.lang.Object) defaultedMap19);
        java.lang.Object obj26 = defaultedMap14.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj27 = null;
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap(obj27);
        java.lang.String str29 = defaultedMap28.toString();
        defaultedMap28.clear();
        java.lang.Object obj31 = null;
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap(obj31);
        java.lang.String str33 = defaultedMap32.toString();
        defaultedMap32.clear();
        java.lang.Object obj35 = defaultedMap28.get((java.lang.Object) defaultedMap32);
        java.lang.Object obj36 = defaultedMap14.get((java.lang.Object) defaultedMap28);
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Object obj38 = defaultedMap14.get(obj37);
        boolean b39 = defaultedMap3.equals((java.lang.Object) defaultedMap14);
        java.util.Set set40 = defaultedMap14.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        java.lang.String str42 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{-1.0=100}" + "'", str42.equals("{-1.0=100}"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Set set2 = defaultedMap1.entrySet();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) "hi!");
        java.lang.String str8 = defaultedMap5.toString();
        java.lang.Object obj9 = null;
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) "hi!");
        defaultedMap10.clear();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj16 = defaultedMap5.get((java.lang.Object) (short) -1);
        java.lang.Object obj18 = defaultedMap5.remove((java.lang.Object) 'a');
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) 'a');
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) "hi!");
        java.lang.String str24 = defaultedMap21.toString();
        java.lang.Object obj25 = null;
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) "hi!");
        defaultedMap26.clear();
        java.lang.Object obj30 = defaultedMap21.remove((java.lang.Object) defaultedMap26);
        java.lang.Object obj32 = defaultedMap21.get((java.lang.Object) (short) -1);
        java.lang.Object obj33 = null;
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap(obj33);
        java.util.Set set35 = defaultedMap34.entrySet();
        java.util.Set set36 = defaultedMap34.keySet();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        java.lang.String str41 = defaultedMap38.toString();
        java.lang.Object obj42 = null;
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap(obj42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) "hi!");
        defaultedMap43.clear();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) defaultedMap43);
        java.lang.Object obj50 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj52 = defaultedMap38.get((java.lang.Object) predicate51);
        java.lang.Object obj53 = defaultedMap34.remove((java.lang.Object) defaultedMap38);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap38);
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNotNull(map7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "{}" + "'", str8.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj55);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.util.Iterator iterator0 = null;
        java.lang.Object obj1 = null;
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap(obj1);
        java.util.Map map4 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) "hi!");
        defaultedMap2.clear();
        java.lang.Object obj7 = defaultedMap2.remove((java.lang.Object) true);
        int i8 = defaultedMap2.size();
        java.lang.Object obj9 = null;
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, obj9);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        collections.Predicate predicate13 = null;
        filterIterator12.setPredicate(predicate13);
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.lang.String str17 = defaultedMap16.toString();
        defaultedMap16.clear();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) predicate19);
        filterIterator12.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12);
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        filterIterator12.setPredicate(predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap2, (java.lang.Object) predicate23);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator0, predicate23);
        org.junit.Assert.assertNotNull(map4);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) true);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        boolean b34 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj6 = null;
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap(obj6);
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) "hi!");
        java.lang.String str10 = defaultedMap7.toString();
        java.lang.Object obj11 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap(obj11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) "hi!");
        defaultedMap12.clear();
        java.lang.Object obj16 = defaultedMap7.remove((java.lang.Object) defaultedMap12);
        java.lang.Object obj19 = defaultedMap7.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj20 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap(obj20);
        java.lang.String str22 = defaultedMap21.toString();
        defaultedMap21.clear();
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.lang.Object obj28 = defaultedMap21.get((java.lang.Object) defaultedMap25);
        java.lang.Object obj29 = defaultedMap7.get((java.lang.Object) defaultedMap21);
        boolean b30 = defaultedMap1.equals((java.lang.Object) defaultedMap7);
        collections.Factory factory31 = null;
        try {
            java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) (byte) 0);
        boolean b30 = defaultedMap23.containsValue((java.lang.Object) (byte) 0);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap23);
        java.lang.Object obj32 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap(obj32);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) "hi!");
        java.lang.String str36 = defaultedMap33.toString();
        java.lang.Object obj37 = null;
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap(obj37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) "hi!");
        defaultedMap38.clear();
        java.lang.Object obj42 = defaultedMap33.remove((java.lang.Object) defaultedMap38);
        defaultedMap1.putAll((java.util.Map) defaultedMap38);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        java.lang.Object obj51 = defaultedMap45.get((java.lang.Object) filterIterator47);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = null;
        filterIterator53.setIterator(iterator54);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.String str62 = defaultedMap61.toString();
        defaultedMap61.clear();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) predicate64);
        filterIterator57.setPredicate(predicate64);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate68);
        filterIterator53.setIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        filterIterator47.setIterator((java.util.Iterator) filterIterator53);
        java.util.Iterator iterator73 = null;
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator(iterator73);
        collections.Predicate predicate75 = null;
        filterIterator74.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        filterIterator53.setIterator((java.util.Iterator) filterIterator74);
        boolean b79 = defaultedMap38.equals((java.lang.Object) filterIterator53);
        java.lang.Object obj80 = null;
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap(obj80);
        java.util.Map map83 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap81, (java.lang.Object) "hi!");
        java.lang.Object obj84 = defaultedMap38.get((java.lang.Object) defaultedMap81);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + ' ' + "'", obj51.equals(' '));
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(map83);
        org.junit.Assert.assertNull(obj84);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0d);
        java.lang.Object obj8 = null;
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap(obj8);
        java.lang.String str10 = defaultedMap9.toString();
        defaultedMap9.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) (byte) 0);
        boolean b14 = defaultedMap7.containsValue((java.lang.Object) (byte) 0);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) defaultedMap7);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate32);
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.lang.Object obj42 = defaultedMap36.get((java.lang.Object) filterIterator38);
        filterIterator17.setIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator44);
        java.lang.Object obj46 = null;
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap(obj46);
        boolean b48 = defaultedMap47.isEmpty();
        boolean b50 = defaultedMap47.containsKey((java.lang.Object) 10);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) filterIterator51);
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        collections.Predicate predicate56 = null;
        filterIterator55.setPredicate(predicate56);
        java.lang.Object obj58 = null;
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap(obj58);
        java.lang.String str60 = defaultedMap59.toString();
        defaultedMap59.clear();
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj63 = defaultedMap59.remove((java.lang.Object) predicate62);
        filterIterator55.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate62);
        java.util.Iterator iterator66 = filterIterator51.getIterator();
        boolean b67 = defaultedMap1.containsValue((java.lang.Object) filterIterator51);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + ' ' + "'", obj42.equals(' '));
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertTrue(b67 == false);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 'a');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = null;
        filterIterator3.setIterator(iterator4);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.lang.String str12 = defaultedMap11.toString();
        defaultedMap11.clear();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) predicate14);
        filterIterator7.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        filterIterator7.setPredicate(predicate18);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator7);
        java.lang.Object obj22 = null;
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap(obj22);
        java.lang.String str24 = defaultedMap23.toString();
        defaultedMap23.clear();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap23.remove((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate26);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Collection collection9 = defaultedMap5.values();
        java.lang.Object obj10 = null;
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap(obj10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) "hi!");
        java.lang.String str14 = defaultedMap11.toString();
        java.lang.Object obj15 = null;
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap(obj15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) "hi!");
        defaultedMap16.clear();
        java.lang.Object obj20 = defaultedMap11.remove((java.lang.Object) defaultedMap16);
        java.lang.Object obj23 = defaultedMap11.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        java.lang.Object obj28 = null;
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap(obj28);
        java.lang.String str30 = defaultedMap29.toString();
        defaultedMap29.clear();
        java.lang.Object obj32 = defaultedMap25.get((java.lang.Object) defaultedMap29);
        java.lang.Object obj33 = defaultedMap11.get((java.lang.Object) defaultedMap25);
        boolean b35 = defaultedMap11.containsKey((java.lang.Object) 100);
        java.lang.Object obj36 = null;
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap(obj36);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj41 = defaultedMap37.remove((java.lang.Object) predicate40);
        boolean b42 = defaultedMap11.equals((java.lang.Object) defaultedMap37);
        boolean b43 = defaultedMap5.containsKey((java.lang.Object) b42);
        java.lang.Object obj44 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap(obj44);
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) "hi!");
        java.lang.String str48 = defaultedMap45.toString();
        java.lang.Object obj49 = null;
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap(obj49);
        java.util.Map map52 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) "hi!");
        defaultedMap50.clear();
        java.lang.Object obj54 = defaultedMap45.remove((java.lang.Object) defaultedMap50);
        java.lang.Object obj57 = defaultedMap45.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        int i58 = defaultedMap45.size();
        boolean b59 = defaultedMap45.isEmpty();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        collections.Predicate predicate64 = null;
        filterIterator63.setPredicate(predicate64);
        java.lang.Object obj66 = null;
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap(obj66);
        java.lang.String str68 = defaultedMap67.toString();
        defaultedMap67.clear();
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj71 = defaultedMap67.remove((java.lang.Object) predicate70);
        filterIterator63.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        filterIterator61.setIterator((java.util.Iterator) filterIterator63);
        java.lang.Object obj75 = defaultedMap45.get((java.lang.Object) filterIterator61);
        collections.Predicate predicate76 = filterIterator61.getPredicate();
        java.lang.Object obj77 = defaultedMap5.get((java.lang.Object) filterIterator61);
        defaultedMap5.clear();
        java.lang.Object obj79 = null;
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap(obj79);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap80, (java.lang.Object) "hi!");
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83);
        boolean b85 = defaultedMap80.containsKey((java.lang.Object) filterIterator84);
        boolean b86 = defaultedMap5.equals((java.lang.Object) b85);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue(i58 == 1);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertTrue("'" + str68 + "' != '" + "{}" + "'", str68.equals("{}"));
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(predicate76);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue(b86 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        defaultedMap1.clear();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        defaultedMap5.clear();
        java.lang.Object obj8 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        java.util.Set set9 = defaultedMap5.entrySet();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.lang.String str2 = defaultedMap1.toString();
        java.lang.Object obj4 = null;
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap(obj4);
        java.lang.String str6 = defaultedMap5.toString();
        boolean b8 = defaultedMap5.containsKey((java.lang.Object) (short) -1);
        java.lang.Object obj9 = defaultedMap1.put((java.lang.Object) true, (java.lang.Object) b8);
        boolean b10 = defaultedMap1.isEmpty();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.lang.Object obj12 = null;
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap(obj12);
        java.lang.String str14 = defaultedMap13.toString();
        defaultedMap13.clear();
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = null;
        filterIterator17.setIterator(iterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        collections.Predicate predicate22 = null;
        filterIterator21.setPredicate(predicate22);
        java.lang.Object obj24 = null;
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap(obj24);
        java.lang.String str26 = defaultedMap25.toString();
        defaultedMap25.clear();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap25.remove((java.lang.Object) predicate28);
        filterIterator21.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate32);
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        boolean b36 = defaultedMap13.containsValue((java.lang.Object) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate11, predicate37);
        int i40 = defaultedMap1.size();
        collections.Factory factory41 = null;
        try {
            java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{}" + "'", str2.equals("{}"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(i40 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.lang.String str6 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        collections.Predicate predicate4 = null;
        filterIterator3.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3);
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator3);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = null;
        filterIterator9.setIterator(iterator10);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        java.lang.Object obj16 = null;
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap(obj16);
        java.lang.String str18 = defaultedMap17.toString();
        defaultedMap17.clear();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj21 = defaultedMap17.remove((java.lang.Object) predicate20);
        filterIterator13.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        filterIterator13.setPredicate(predicate24);
        filterIterator9.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        filterIterator3.setIterator((java.util.Iterator) filterIterator9);
        try {
            java.lang.Object obj29 = filterIterator9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + ' ' + "'", obj7.equals(' '));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate24);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) "hi!");
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.Object obj5 = null;
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap(obj5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) "hi!");
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) defaultedMap6);
        java.lang.Object obj13 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) 100L);
        java.lang.Object obj14 = null;
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap(obj14);
        java.lang.String str16 = defaultedMap15.toString();
        defaultedMap15.clear();
        java.lang.Object obj18 = null;
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap(obj18);
        java.lang.String str20 = defaultedMap19.toString();
        defaultedMap19.clear();
        java.lang.Object obj22 = defaultedMap15.get((java.lang.Object) defaultedMap19);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) defaultedMap15);
        java.lang.Object obj24 = new java.lang.Object();
        java.lang.Object obj25 = defaultedMap1.get(obj24);
        java.lang.Object obj26 = null;
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap(obj26);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) "hi!");
        defaultedMap27.clear();
        java.lang.Object obj32 = defaultedMap27.remove((java.lang.Object) true);
        boolean b33 = defaultedMap1.containsKey((java.lang.Object) defaultedMap27);
        int i34 = defaultedMap27.size();
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = null;
        filterIterator36.setIterator(iterator37);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        collections.Predicate predicate41 = null;
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap(obj43);
        java.lang.String str45 = defaultedMap44.toString();
        defaultedMap44.clear();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap44.remove((java.lang.Object) predicate47);
        filterIterator40.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate51);
        filterIterator36.setIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Iterator iterator56 = null;
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator(iterator56);
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        java.lang.Object obj60 = null;
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap(obj60);
        java.lang.String str62 = defaultedMap61.toString();
        defaultedMap61.clear();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap61.remove((java.lang.Object) predicate64);
        filterIterator57.setPredicate(predicate64);
        filterIterator55.setIterator((java.util.Iterator) filterIterator57);
        boolean b68 = defaultedMap27.containsKey((java.lang.Object) filterIterator55);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(b68 == false);
    }
}

