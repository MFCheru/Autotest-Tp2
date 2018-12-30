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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        try {
            boolean b4 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.Predicate predicate0 = collections.PredicateUtils.notNullPredicate();
        org.junit.Assert.assertNotNull(predicate0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            java.lang.Object obj2 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.util.Map map0 = null;
        java.lang.Object obj1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, obj1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        try {
            java.lang.Object obj4 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
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
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        java.util.Iterator iterator5 = null;
        filterIterator1.setIterator(iterator5);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Set set10 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap1.toString();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        int i4 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        java.lang.String str3 = defaultedMap1.toString();
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "{}" + "'", str3.equals("{}"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        try {
            filterIterator18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.util.Map map0 = null;
        java.util.Iterator iterator1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator1);
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        java.util.Iterator iterator4 = filterIterator2.getIterator();
        java.util.Iterator iterator5 = filterIterator2.getIterator();
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) filterIterator2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.lang.Object obj12 = defaultedMap5.put((java.lang.Object) predicate10, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.lang.Object obj23 = defaultedMap16.put((java.lang.Object) predicate21, (java.lang.Object) '4');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) predicate33, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap28);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        java.util.Iterator iterator42 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) predicate45);
        filterIterator39.setPredicate(predicate45);
        boolean b48 = defaultedMap28.containsKey((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 1L);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) filterIterator56);
        filterIterator39.setIterator((java.util.Iterator) filterIterator56);
        boolean b59 = defaultedMap5.containsKey((java.lang.Object) filterIterator56);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate60);
        boolean b62 = defaultedMap1.containsValue((java.lang.Object) filterIterator56);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "hi!" + "'", obj46.equals("hi!"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b62 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1L);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) filterIterator20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.Transformer transformer23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        java.util.Iterator iterator29 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        filterIterator26.setPredicate(predicate32);
        boolean b35 = defaultedMap15.containsKey((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1L);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) filterIterator43);
        filterIterator26.setIterator((java.util.Iterator) filterIterator43);
        try {
            filterIterator26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) ' ');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Set set12 = defaultedMap3.keySet();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b44 = defaultedMap24.containsKey((java.lang.Object) filterIterator35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1L);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) filterIterator52);
        filterIterator35.setIterator((java.util.Iterator) filterIterator52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) filterIterator52);
        try {
            boolean b56 = filterIterator52.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        java.util.Collection collection7 = defaultedMap1.values();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        try {
            java.lang.Object obj5 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.String str7 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        java.lang.Object obj14 = defaultedMap9.get((java.lang.Object) "{}");
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + (short) -1 + "'", obj14.equals((short) -1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1L);
        boolean b14 = defaultedMap10.equals((java.lang.Object) (-1.0d));
        int i15 = defaultedMap10.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        boolean b21 = defaultedMap1.equals((java.lang.Object) filterIterator20);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) predicate27);
        filterIterator23.setPredicate(predicate27);
        collections.Predicate predicate30 = filterIterator23.getPredicate();
        filterIterator20.setPredicate(predicate30);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + "hi!" + "'", obj28.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        java.lang.Object obj17 = defaultedMap10.put((java.lang.Object) predicate15, (java.lang.Object) '4');
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate19 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate19, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1L);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) filterIterator40);
        boolean b42 = defaultedMap29.equals((java.lang.Object) map41);
        boolean b43 = defaultedMap26.containsValue((java.lang.Object) b42);
        defaultedMap8.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 1L);
        java.lang.Object obj51 = defaultedMap47.remove((java.lang.Object) (-1.0f));
        java.lang.Object obj52 = defaultedMap1.get(obj51);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!" + "'", obj23.equals("hi!"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + (short) -1 + "'", obj52.equals((short) -1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.clear();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1L);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) filterIterator17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        java.lang.Object obj20 = defaultedMap11.remove((java.lang.Object) filterIterator19);
        java.lang.Object obj21 = null;
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, obj21);
        java.util.Map map23 = collections.map.DefaultedMap.decorate(map9, obj21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) map23);
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap24.get(obj25);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) predicate5);
        filterIterator1.setPredicate(predicate5);
        try {
            boolean b8 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!" + "'", obj6.equals("hi!"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        try {
            boolean b30 = filterIterator18.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set6 = defaultedMap1.keySet();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.clear();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1L);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.lang.Object obj28 = defaultedMap19.remove((java.lang.Object) filterIterator27);
        java.lang.Object obj29 = null;
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map17, obj29);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1L);
        java.lang.String str36 = defaultedMap33.toString();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator44);
        boolean b46 = defaultedMap33.equals((java.lang.Object) map45);
        java.lang.Object obj47 = defaultedMap1.put(obj29, (java.lang.Object) defaultedMap33);
        java.lang.String str48 = defaultedMap33.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap1.equals(obj13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        java.lang.Object obj25 = null;
        java.util.Map map26 = collections.map.DefaultedMap.decorate(map24, obj25);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        collections.Transformer transformer24 = null;
        try {
            java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set6 = defaultedMap1.keySet();
        java.lang.String str7 = defaultedMap1.toString();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) '4');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short) -1 + "'", obj10.equals((short) -1));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        boolean b26 = defaultedMap1.equals((java.lang.Object) 'a');
        collections.Factory factory27 = null;
        try {
            java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        defaultedMap1.clear();
        int i12 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.lang.Object obj34 = defaultedMap27.put((java.lang.Object) predicate32, (java.lang.Object) '4');
        java.util.Collection collection35 = defaultedMap27.values();
        java.util.Collection collection36 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) filterIterator46);
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        java.util.Iterator iterator52 = filterIterator50.getIterator();
        java.util.Iterator iterator53 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) predicate56);
        filterIterator50.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) predicate68);
        filterIterator64.setPredicate(predicate68);
        collections.Predicate predicate71 = filterIterator64.getPredicate();
        filterIterator60.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate56, predicate71);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap27);
        java.lang.Object obj76 = defaultedMap1.remove((java.lang.Object) 0);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(obj76);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b44 = defaultedMap24.containsKey((java.lang.Object) filterIterator35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1L);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) filterIterator52);
        filterIterator35.setIterator((java.util.Iterator) filterIterator52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) filterIterator52);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        collections.Predicate predicate63 = filterIterator60.getPredicate();
        java.lang.Object obj65 = defaultedMap58.put((java.lang.Object) predicate63, (java.lang.Object) '4');
        java.util.Collection collection66 = defaultedMap58.values();
        java.util.Collection collection67 = defaultedMap58.values();
        java.lang.Object obj68 = defaultedMap1.put((java.lang.Object) 'a', (java.lang.Object) defaultedMap58);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(predicate63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNotNull(collection67);
        org.junit.Assert.assertNull(obj68);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) predicate12);
        filterIterator8.setPredicate(predicate12);
        collections.Predicate predicate15 = filterIterator8.getPredicate();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) predicate23, (java.lang.Object) '4');
        java.util.Collection collection26 = defaultedMap18.values();
        java.util.Collection collection27 = defaultedMap18.values();
        java.util.Collection collection28 = defaultedMap18.values();
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) predicate12);
        filterIterator8.setPredicate(predicate12);
        collections.Predicate predicate15 = filterIterator8.getPredicate();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) predicate23, (java.lang.Object) '4');
        java.util.Collection collection26 = defaultedMap18.values();
        java.util.Collection collection27 = defaultedMap18.values();
        java.util.Collection collection28 = defaultedMap18.values();
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        collections.Transformer transformer30 = null;
        try {
            java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer12 = null;
        try {
            java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b44 = defaultedMap24.containsKey((java.lang.Object) filterIterator35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1L);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) filterIterator52);
        filterIterator35.setIterator((java.util.Iterator) filterIterator52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) filterIterator52);
        try {
            java.lang.Object obj56 = filterIterator52.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        int i13 = defaultedMap1.size();
        java.lang.String str14 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.Object obj13 = defaultedMap1.remove((java.lang.Object) ' ');
        defaultedMap1.clear();
        java.util.Collection collection15 = defaultedMap1.values();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(collection15);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        java.util.Iterator iterator5 = null;
        filterIterator1.setIterator(iterator5);
        java.util.Iterator iterator7 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.lang.String str25 = defaultedMap1.toString();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{null=4}" + "'", str25.equals("{null=4}"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap9.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap14.clear();
        java.util.Set set16 = defaultedMap14.entrySet();
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) set16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1L);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) filterIterator25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        java.lang.Object obj28 = defaultedMap19.remove((java.lang.Object) filterIterator27);
        java.lang.Object obj29 = null;
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj29);
        java.util.Map map31 = collections.map.DefaultedMap.decorate(map17, obj29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) map31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) map31);
        java.lang.String str34 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + (short) -1 + "'", obj33.equals((short) -1));
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        java.util.Iterator iterator29 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        filterIterator26.setPredicate(predicate32);
        boolean b35 = defaultedMap15.containsKey((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1L);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) filterIterator43);
        filterIterator26.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        java.util.Iterator iterator49 = filterIterator47.getIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) predicate53);
        filterIterator43.setPredicate(predicate53);
        collections.Predicate predicate56 = filterIterator43.getPredicate();
        try {
            filterIterator43.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate56);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        int i10 = defaultedMap1.size();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.lang.Object obj22 = defaultedMap13.remove((java.lang.Object) filterIterator21);
        java.lang.Object obj23 = null;
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, obj23);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap13.equals(obj25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) filterIterator28);
        java.lang.Object obj39 = defaultedMap1.get((java.lang.Object) (-1.0f));
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{null=4}" + "'", str11.equals("{null=4}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) predicate42);
        filterIterator38.setPredicate(predicate42);
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate51);
        java.lang.Object obj54 = defaultedMap36.put((java.lang.Object) predicate42, (java.lang.Object) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        java.util.Iterator iterator60 = filterIterator58.getIterator();
        collections.Predicate predicate61 = filterIterator58.getPredicate();
        java.lang.Object obj63 = defaultedMap56.put((java.lang.Object) predicate61, (java.lang.Object) '4');
        java.util.Collection collection64 = defaultedMap56.values();
        java.util.Collection collection65 = defaultedMap56.values();
        java.util.Collection collection66 = defaultedMap56.values();
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        java.util.Iterator iterator69 = filterIterator68.getIterator();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) predicate72);
        filterIterator68.setPredicate(predicate72);
        collections.Predicate predicate75 = filterIterator68.getPredicate();
        java.lang.Object obj76 = defaultedMap56.get((java.lang.Object) predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate75);
        filterIterator18.setPredicate(predicate75);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "hi!" + "'", obj52.equals("hi!"));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNull(predicate61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNotNull(collection64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNotNull(collection66);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "hi!" + "'", obj73.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) -1 + "'", obj76.equals((short) -1));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate30);
        try {
            java.lang.Object obj32 = filterIterator18.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) predicate5);
        filterIterator1.setPredicate(predicate5);
        try {
            filterIterator1.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!" + "'", obj6.equals("hi!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        int i12 = defaultedMap1.size();
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) predicate18);
        filterIterator14.setPredicate(predicate18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1L);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) predicate33);
        filterIterator29.setPredicate(predicate33);
        collections.Predicate predicate36 = filterIterator29.getPredicate();
        java.lang.Object obj37 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate36);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) predicate43);
        filterIterator39.setPredicate(predicate43);
        collections.Predicate predicate46 = filterIterator39.getPredicate();
        java.lang.Object obj47 = defaultedMap22.get((java.lang.Object) predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate18, predicate46);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + "hi!" + "'", obj19.equals("hi!"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + (short) -1 + "'", obj47.equals((short) -1));
        org.junit.Assert.assertNotNull(map48);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        boolean b20 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b44 = defaultedMap24.containsKey((java.lang.Object) filterIterator35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1L);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) filterIterator52);
        filterIterator35.setIterator((java.util.Iterator) filterIterator52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) filterIterator52);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) predicate63);
        filterIterator59.setPredicate(predicate63);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        java.util.Iterator iterator68 = filterIterator67.getIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate72);
        java.lang.Object obj75 = defaultedMap57.put((java.lang.Object) predicate63, (java.lang.Object) filterIterator74);
        java.util.Iterator iterator76 = null;
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator76);
        java.util.Iterator iterator78 = filterIterator77.getIterator();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj83 = defaultedMap81.get((java.lang.Object) predicate82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate82);
        filterIterator74.setIterator((java.util.Iterator) filterIterator84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        filterIterator52.setIterator((java.util.Iterator) filterIterator74);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "hi!" + "'", obj64.equals("hi!"));
        org.junit.Assert.assertNull(iterator68);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "hi!" + "'", obj73.equals("hi!"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(iterator78);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + "hi!" + "'", obj83.equals("hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.Predicate predicate16 = filterIterator13.getPredicate();
        java.lang.Object obj18 = defaultedMap11.put((java.lang.Object) predicate16, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        java.lang.Object obj29 = defaultedMap22.put((java.lang.Object) predicate27, (java.lang.Object) '4');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        java.util.Iterator iterator38 = filterIterator36.getIterator();
        collections.Predicate predicate39 = filterIterator36.getPredicate();
        java.lang.Object obj41 = defaultedMap34.put((java.lang.Object) predicate39, (java.lang.Object) '4');
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap34);
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        java.util.Iterator iterator47 = filterIterator45.getIterator();
        java.util.Iterator iterator48 = filterIterator45.getIterator();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj52 = defaultedMap50.get((java.lang.Object) predicate51);
        filterIterator45.setPredicate(predicate51);
        boolean b54 = defaultedMap34.containsKey((java.lang.Object) filterIterator45);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 1L);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) filterIterator62);
        filterIterator45.setIterator((java.util.Iterator) filterIterator62);
        boolean b65 = defaultedMap11.containsKey((java.lang.Object) filterIterator62);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate66);
        boolean b68 = defaultedMap1.containsKey((java.lang.Object) predicate66);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + "hi!" + "'", obj52.equals("hi!"));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b68 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.lang.Object obj34 = defaultedMap27.put((java.lang.Object) predicate32, (java.lang.Object) '4');
        java.util.Collection collection35 = defaultedMap27.values();
        java.util.Collection collection36 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) filterIterator46);
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        java.util.Iterator iterator52 = filterIterator50.getIterator();
        java.util.Iterator iterator53 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) predicate56);
        filterIterator50.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) predicate68);
        filterIterator64.setPredicate(predicate68);
        collections.Predicate predicate71 = filterIterator64.getPredicate();
        filterIterator60.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate56, predicate71);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap27);
        collections.Transformer transformer75 = null;
        try {
            java.util.Map map76 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, transformer75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate12 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate15);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        java.util.Iterator iterator23 = filterIterator21.getIterator();
        collections.Predicate predicate24 = filterIterator21.getPredicate();
        java.lang.Object obj26 = defaultedMap19.put((java.lang.Object) predicate24, (java.lang.Object) '4');
        java.util.Collection collection27 = defaultedMap19.values();
        java.util.Collection collection28 = defaultedMap19.values();
        java.util.Collection collection29 = defaultedMap19.values();
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) predicate35);
        filterIterator31.setPredicate(predicate35);
        collections.Predicate predicate38 = filterIterator31.getPredicate();
        java.lang.Object obj39 = defaultedMap19.get((java.lang.Object) predicate38);
        boolean b41 = defaultedMap19.containsValue((java.lang.Object) 0);
        java.lang.Object obj42 = null;
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, obj42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        java.util.Iterator iterator49 = filterIterator47.getIterator();
        collections.Predicate predicate50 = filterIterator47.getPredicate();
        java.lang.Object obj52 = defaultedMap45.put((java.lang.Object) predicate50, (java.lang.Object) '4');
        java.util.Collection collection53 = defaultedMap45.values();
        java.util.Collection collection54 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 1L);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap56, (java.lang.Object) filterIterator62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        java.lang.Object obj65 = defaultedMap56.remove((java.lang.Object) filterIterator64);
        defaultedMap45.putAll((java.util.Map) defaultedMap56);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        java.util.Iterator iterator69 = filterIterator68.getIterator();
        java.util.Iterator iterator70 = filterIterator68.getIterator();
        java.util.Iterator iterator71 = filterIterator68.getIterator();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj75 = defaultedMap73.get((java.lang.Object) predicate74);
        filterIterator68.setPredicate(predicate74);
        java.util.Iterator iterator77 = null;
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator(iterator77);
        java.util.Iterator iterator79 = filterIterator78.getIterator();
        java.util.Iterator iterator80 = filterIterator78.getIterator();
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        java.util.Iterator iterator83 = filterIterator82.getIterator();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj87 = defaultedMap85.get((java.lang.Object) predicate86);
        filterIterator82.setPredicate(predicate86);
        collections.Predicate predicate89 = filterIterator82.getPredicate();
        filterIterator78.setPredicate(predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate74, predicate89);
        java.util.Map map92 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) defaultedMap45);
        collections.map.DefaultedMap defaultedMap94 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap94.clear();
        defaultedMap94.clear();
        int i97 = defaultedMap94.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap94);
        java.lang.Object obj99 = defaultedMap1.get((java.lang.Object) defaultedMap94);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + "hi!" + "'", obj36.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + (short) -1 + "'", obj39.equals((short) -1));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNull(iterator71);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue("'" + obj75 + "' != '" + "hi!" + "'", obj75.equals("hi!"));
        org.junit.Assert.assertNull(iterator79);
        org.junit.Assert.assertNull(iterator80);
        org.junit.Assert.assertNull(iterator83);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + "hi!" + "'", obj87.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(i97 == 0);
        org.junit.Assert.assertTrue("'" + obj99 + "' != '" + "hi!" + "'", obj99.equals("hi!"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b44 = defaultedMap24.containsKey((java.lang.Object) filterIterator35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1L);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) filterIterator52);
        filterIterator35.setIterator((java.util.Iterator) filterIterator52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) filterIterator52);
        boolean b56 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = filterIterator18.getPredicate();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) predicate2);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 1L);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.lang.Object obj14 = defaultedMap5.remove((java.lang.Object) filterIterator13);
        java.lang.Object obj15 = null;
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, obj15);
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap5.equals(obj17);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) predicate25);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate25);
        java.util.Map map28 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, (java.lang.Object) filterIterator20);
        java.lang.Object obj29 = defaultedMap1.get((java.lang.Object) filterIterator20);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + "hi!" + "'", obj26.equals("hi!"));
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) predicate12);
        filterIterator8.setPredicate(predicate12);
        collections.Predicate predicate15 = filterIterator8.getPredicate();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) predicate23, (java.lang.Object) '4');
        java.util.Collection collection26 = defaultedMap18.values();
        java.util.Collection collection27 = defaultedMap18.values();
        java.util.Collection collection28 = defaultedMap18.values();
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        java.util.Iterator iterator38 = filterIterator36.getIterator();
        collections.Predicate predicate39 = filterIterator36.getPredicate();
        java.lang.Object obj41 = defaultedMap34.put((java.lang.Object) predicate39, (java.lang.Object) '4');
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.Predicate predicate51 = filterIterator48.getPredicate();
        java.lang.Object obj53 = defaultedMap46.put((java.lang.Object) predicate51, (java.lang.Object) '4');
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) defaultedMap46);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        java.util.Iterator iterator63 = filterIterator61.getIterator();
        collections.Predicate predicate64 = filterIterator61.getPredicate();
        java.lang.Object obj66 = defaultedMap59.put((java.lang.Object) predicate64, (java.lang.Object) '4');
        defaultedMap57.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator72 = null;
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator(iterator72);
        java.util.Iterator iterator74 = filterIterator73.getIterator();
        java.util.Iterator iterator75 = filterIterator73.getIterator();
        collections.Predicate predicate76 = filterIterator73.getPredicate();
        java.lang.Object obj78 = defaultedMap71.put((java.lang.Object) predicate76, (java.lang.Object) '4');
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) defaultedMap71);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator83 = null;
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator(iterator83);
        java.util.Iterator iterator85 = filterIterator84.getIterator();
        java.util.Iterator iterator86 = filterIterator84.getIterator();
        collections.Predicate predicate87 = filterIterator84.getPredicate();
        java.lang.Object obj89 = defaultedMap82.put((java.lang.Object) predicate87, (java.lang.Object) '4');
        java.util.Collection collection90 = defaultedMap82.values();
        boolean b91 = defaultedMap71.equals((java.lang.Object) defaultedMap82);
        defaultedMap32.putAll((java.util.Map) defaultedMap82);
        java.util.Set set93 = defaultedMap82.keySet();
        java.lang.Object obj94 = defaultedMap30.get((java.lang.Object) set93);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(predicate51);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(iterator74);
        org.junit.Assert.assertNull(iterator75);
        org.junit.Assert.assertNull(predicate76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(iterator85);
        org.junit.Assert.assertNull(iterator86);
        org.junit.Assert.assertNull(predicate87);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(collection90);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertNotNull(set93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + false + "'", obj94.equals(false));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) predicate12);
        filterIterator8.setPredicate(predicate12);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        java.lang.Object obj24 = defaultedMap6.put((java.lang.Object) predicate12, (java.lang.Object) filterIterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate31);
        filterIterator23.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator4, predicate35);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(iterator38);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        collections.Predicate predicate5 = filterIterator1.getPredicate();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        java.lang.String str22 = defaultedMap1.toString();
        boolean b23 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{null=4}" + "'", str22.equals("{null=4}"));
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.String str19 = defaultedMap13.toString();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) predicate28);
        filterIterator24.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        java.lang.Object obj40 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator43 = null;
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator(iterator43);
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) predicate48);
        filterIterator44.setPredicate(predicate48);
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj58 = defaultedMap56.get((java.lang.Object) predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate57);
        java.lang.Object obj60 = defaultedMap42.put((java.lang.Object) predicate48, (java.lang.Object) filterIterator59);
        java.util.Iterator iterator61 = null;
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator(iterator61);
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate67);
        filterIterator59.setIterator((java.util.Iterator) filterIterator69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj74 = defaultedMap72.get((java.lang.Object) predicate73);
        filterIterator69.setPredicate(predicate73);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate73);
        java.lang.Object obj78 = defaultedMap1.get((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "hi!" + "'", obj49.equals("hi!"));
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue("'" + obj58 + "' != '" + "hi!" + "'", obj58.equals("hi!"));
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "hi!" + "'", obj68.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + "hi!" + "'", obj74.equals("hi!"));
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (short) -1 + "'", obj78.equals((short) -1));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate30);
        try {
            filterIterator18.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        java.util.Iterator iterator38 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) predicate41);
        filterIterator35.setPredicate(predicate41);
        boolean b44 = defaultedMap24.containsKey((java.lang.Object) filterIterator35);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1L);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        java.util.Map map53 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap46, (java.lang.Object) filterIterator52);
        filterIterator35.setIterator((java.util.Iterator) filterIterator52);
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) filterIterator52);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) predicate63);
        filterIterator59.setPredicate(predicate63);
        java.util.Iterator iterator66 = null;
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator(iterator66);
        java.util.Iterator iterator68 = filterIterator67.getIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) predicate72);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate72);
        java.lang.Object obj75 = defaultedMap57.put((java.lang.Object) predicate63, (java.lang.Object) filterIterator74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator78);
        java.util.Iterator iterator80 = filterIterator79.getIterator();
        java.util.Iterator iterator81 = filterIterator79.getIterator();
        collections.Predicate predicate82 = filterIterator79.getPredicate();
        java.lang.Object obj84 = defaultedMap77.put((java.lang.Object) predicate82, (java.lang.Object) '4');
        java.util.Collection collection85 = defaultedMap77.values();
        java.util.Collection collection86 = defaultedMap77.values();
        java.util.Collection collection87 = defaultedMap77.values();
        java.util.Iterator iterator88 = null;
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator(iterator88);
        java.util.Iterator iterator90 = filterIterator89.getIterator();
        collections.map.DefaultedMap defaultedMap92 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj94 = defaultedMap92.get((java.lang.Object) predicate93);
        filterIterator89.setPredicate(predicate93);
        collections.Predicate predicate96 = filterIterator89.getPredicate();
        java.lang.Object obj97 = defaultedMap77.get((java.lang.Object) predicate96);
        collections.iterators.FilterIterator filterIterator98 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74, predicate96);
        collections.iterators.FilterIterator filterIterator99 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate96);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + "hi!" + "'", obj42.equals("hi!"));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "hi!" + "'", obj64.equals("hi!"));
        org.junit.Assert.assertNull(iterator68);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + "hi!" + "'", obj73.equals("hi!"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNull(iterator80);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNull(predicate82);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(collection85);
        org.junit.Assert.assertNotNull(collection86);
        org.junit.Assert.assertNotNull(collection87);
        org.junit.Assert.assertNull(iterator90);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + "hi!" + "'", obj94.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate96);
        org.junit.Assert.assertTrue("'" + obj97 + "' != '" + (short) -1 + "'", obj97.equals((short) -1));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate32);
        java.util.Iterator iterator35 = filterIterator18.getIterator();
        try {
            java.lang.Object obj36 = filterIterator18.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        java.util.Set set8 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.Predicate predicate29 = filterIterator26.getPredicate();
        java.lang.Object obj31 = defaultedMap24.put((java.lang.Object) predicate29, (java.lang.Object) '4');
        defaultedMap22.putAll((java.util.Map) defaultedMap24);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        collections.Predicate predicate40 = filterIterator37.getPredicate();
        java.lang.Object obj42 = defaultedMap35.put((java.lang.Object) predicate40, (java.lang.Object) '4');
        java.util.Collection collection43 = defaultedMap35.values();
        boolean b44 = defaultedMap24.equals((java.lang.Object) defaultedMap35);
        defaultedMap24.clear();
        java.lang.Object obj46 = defaultedMap1.remove((java.lang.Object) defaultedMap24);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) predicate49);
        defaultedMap48.clear();
        defaultedMap48.clear();
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.Predicate predicate57 = filterIterator54.getPredicate();
        java.util.Iterator iterator58 = null;
        filterIterator54.setIterator(iterator58);
        boolean b60 = defaultedMap48.containsKey((java.lang.Object) iterator58);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) iterator58);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "hi!" + "'", obj50.equals("hi!"));
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNull(predicate57);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) predicate33, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        java.lang.Object obj47 = defaultedMap40.put((java.lang.Object) predicate45, (java.lang.Object) '4');
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        java.util.Iterator iterator55 = filterIterator53.getIterator();
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.lang.Object obj58 = defaultedMap51.put((java.lang.Object) predicate56, (java.lang.Object) '4');
        java.util.Collection collection59 = defaultedMap51.values();
        boolean b60 = defaultedMap40.equals((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        java.util.Set set62 = defaultedMap51.keySet();
        java.lang.Object obj64 = defaultedMap51.get((java.lang.Object) (-1));
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator(iterator67);
        java.util.Iterator iterator69 = filterIterator68.getIterator();
        java.util.Iterator iterator70 = filterIterator68.getIterator();
        collections.Predicate predicate71 = filterIterator68.getPredicate();
        java.lang.Object obj73 = defaultedMap66.put((java.lang.Object) predicate71, (java.lang.Object) '4');
        int i74 = defaultedMap66.size();
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) i74);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) -1 + "'", obj64.equals((short) -1));
        org.junit.Assert.assertNull(iterator69);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNull(predicate71);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertTrue(i74 == 1);
        org.junit.Assert.assertNotNull(map75);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) predicate14);
        filterIterator10.setPredicate(predicate14);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate23);
        java.lang.Object obj26 = defaultedMap8.put((java.lang.Object) predicate14, (java.lang.Object) filterIterator25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate33);
        filterIterator25.setIterator((java.util.Iterator) filterIterator35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator6, predicate37);
        filterIterator1.setPredicate(predicate37);
        try {
            java.lang.Object obj41 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "hi!" + "'", obj15.equals("hi!"));
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!" + "'", obj24.equals("hi!"));
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate37);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        collections.Factory factory22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.String str19 = defaultedMap13.toString();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator24);
        java.util.Collection collection26 = defaultedMap13.values();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(collection26);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj24);
        java.util.Set set26 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.Predicate predicate4 = filterIterator1.getPredicate();
        java.util.Iterator iterator5 = null;
        filterIterator1.setIterator(iterator5);
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        java.util.Iterator iterator10 = filterIterator8.getIterator();
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) predicate19);
        filterIterator15.setPredicate(predicate19);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate28);
        java.lang.Object obj31 = defaultedMap13.put((java.lang.Object) predicate19, (java.lang.Object) filterIterator30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate38);
        filterIterator30.setIterator((java.util.Iterator) filterIterator40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        filterIterator30.setPredicate(predicate42);
        filterIterator8.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator5, predicate42);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate42);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate12 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate15);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1L);
        boolean b25 = defaultedMap21.equals((java.lang.Object) (-1.0d));
        int i26 = defaultedMap21.size();
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) i26);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        java.util.Iterator iterator25 = filterIterator23.getIterator();
        collections.Predicate predicate26 = filterIterator23.getPredicate();
        java.lang.Object obj28 = defaultedMap21.put((java.lang.Object) predicate26, (java.lang.Object) '4');
        java.util.Collection collection29 = defaultedMap21.values();
        java.util.Collection collection30 = defaultedMap21.values();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) filterIterator31);
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap21);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate32);
        java.util.Iterator iterator35 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertNotNull(iterator35);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1L);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) (-1.0f));
        java.util.Set set16 = defaultedMap11.keySet();
        java.lang.String str17 = defaultedMap11.toString();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator1.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        java.util.Iterator iterator11 = filterIterator1.getIterator();
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator11);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 1L);
        java.lang.String str7 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1L);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) filterIterator15);
        boolean b17 = defaultedMap4.equals((java.lang.Object) map16);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) b17);
        java.util.Set set19 = defaultedMap1.keySet();
        boolean b20 = defaultedMap1.isEmpty();
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) filterIterator22);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) -1 + "'", obj25.equals((short) -1));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap1.equals(obj13);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator8 = null;
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator(iterator8);
        java.util.Iterator iterator10 = filterIterator9.getIterator();
        java.util.Iterator iterator11 = filterIterator9.getIterator();
        collections.Predicate predicate12 = filterIterator9.getPredicate();
        java.lang.Object obj14 = defaultedMap7.put((java.lang.Object) predicate12, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) predicate23, (java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        java.util.Iterator iterator34 = filterIterator32.getIterator();
        collections.Predicate predicate35 = filterIterator32.getPredicate();
        java.lang.Object obj37 = defaultedMap30.put((java.lang.Object) predicate35, (java.lang.Object) '4');
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap30);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        java.util.Iterator iterator43 = filterIterator41.getIterator();
        java.util.Iterator iterator44 = filterIterator41.getIterator();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) predicate47);
        filterIterator41.setPredicate(predicate47);
        boolean b50 = defaultedMap30.containsKey((java.lang.Object) filterIterator41);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 1L);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap52, (java.lang.Object) filterIterator58);
        filterIterator41.setIterator((java.util.Iterator) filterIterator58);
        boolean b61 = defaultedMap7.containsKey((java.lang.Object) filterIterator58);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate62);
        java.util.Iterator iterator64 = null;
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator(iterator64);
        java.util.Iterator iterator66 = filterIterator65.getIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj71 = defaultedMap69.get((java.lang.Object) predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate70);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate62, predicate70);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "hi!" + "'", obj48.equals("hi!"));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + "hi!" + "'", obj71.equals("hi!"));
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        java.util.Iterator iterator29 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        filterIterator26.setPredicate(predicate32);
        boolean b35 = defaultedMap15.containsKey((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1L);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) filterIterator43);
        filterIterator26.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        java.util.Iterator iterator49 = filterIterator47.getIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate51 = null;
        filterIterator43.setPredicate(predicate51);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNull(iterator49);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate30);
        java.util.Iterator iterator32 = filterIterator18.getIterator();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        java.util.Iterator iterator29 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        filterIterator26.setPredicate(predicate32);
        boolean b35 = defaultedMap15.containsKey((java.lang.Object) filterIterator26);
        java.util.Iterator iterator36 = filterIterator26.getIterator();
        collections.Predicate predicate37 = filterIterator26.getPredicate();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate37);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap12.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap17.clear();
        java.util.Set set19 = defaultedMap17.entrySet();
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) set19);
        java.util.Set set21 = defaultedMap12.keySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        java.util.Iterator iterator27 = filterIterator25.getIterator();
        collections.Predicate predicate28 = filterIterator25.getPredicate();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) predicate28, (java.lang.Object) '4');
        java.util.Collection collection31 = defaultedMap23.values();
        java.util.Collection collection32 = defaultedMap23.values();
        java.util.Collection collection33 = defaultedMap23.values();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) predicate39);
        filterIterator35.setPredicate(predicate39);
        collections.Predicate predicate42 = filterIterator35.getPredicate();
        java.lang.Object obj43 = defaultedMap23.get((java.lang.Object) predicate42);
        java.lang.Object obj45 = defaultedMap23.get((java.lang.Object) 'a');
        java.util.Map map46 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap23);
        java.lang.Object obj47 = defaultedMap1.remove((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(obj47);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1L);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.lang.Object obj21 = defaultedMap12.remove((java.lang.Object) filterIterator20);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Set set23 = defaultedMap12.entrySet();
        boolean b24 = defaultedMap12.isEmpty();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate31);
        collections.Predicate predicate34 = null;
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate31, predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.Predicate predicate42 = filterIterator39.getPredicate();
        java.lang.Object obj44 = defaultedMap37.put((java.lang.Object) predicate42, (java.lang.Object) '4');
        java.util.Collection collection45 = defaultedMap37.values();
        java.util.Collection collection46 = defaultedMap37.values();
        java.util.Collection collection47 = defaultedMap37.values();
        java.util.Set set48 = defaultedMap37.keySet();
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator54 = null;
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator(iterator54);
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) predicate59);
        filterIterator55.setPredicate(predicate59);
        java.util.Iterator iterator62 = null;
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator(iterator62);
        java.util.Iterator iterator64 = filterIterator63.getIterator();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate68);
        java.lang.Object obj71 = defaultedMap53.put((java.lang.Object) predicate59, (java.lang.Object) filterIterator70);
        java.util.Iterator iterator72 = filterIterator70.getIterator();
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) 1L);
        java.lang.Object obj78 = defaultedMap74.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator80 = null;
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator(iterator80);
        java.util.Iterator iterator82 = filterIterator81.getIterator();
        collections.map.DefaultedMap defaultedMap84 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj86 = defaultedMap84.get((java.lang.Object) predicate85);
        filterIterator81.setPredicate(predicate85);
        collections.Predicate predicate88 = filterIterator81.getPredicate();
        java.lang.Object obj89 = defaultedMap74.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate88);
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator(iterator72, predicate88);
        filterIterator50.setPredicate(predicate88);
        collections.Predicate predicate92 = collections.PredicateUtils.truePredicate();
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate88, predicate92);
        java.lang.Object obj94 = defaultedMap12.remove((java.lang.Object) defaultedMap37);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(collection45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + "hi!" + "'", obj60.equals("hi!"));
        org.junit.Assert.assertNull(iterator64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(iterator72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNull(iterator82);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + "hi!" + "'", obj86.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNull(obj89);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.clear();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        defaultedMap1.clear();
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        java.lang.Object obj23 = defaultedMap1.get((java.lang.Object) 'a');
        int i24 = defaultedMap1.size();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (short) -1 + "'", obj23.equals((short) -1));
        org.junit.Assert.assertTrue(i24 == 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1L);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) predicate33);
        filterIterator29.setPredicate(predicate33);
        collections.Predicate predicate36 = filterIterator29.getPredicate();
        java.lang.Object obj37 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator20, predicate36);
        collections.Predicate predicate39 = null;
        filterIterator38.setPredicate(predicate39);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        java.util.Iterator iterator4 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) predicate12);
        filterIterator8.setPredicate(predicate12);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        java.lang.Object obj24 = defaultedMap6.put((java.lang.Object) predicate12, (java.lang.Object) filterIterator23);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj32 = defaultedMap30.get((java.lang.Object) predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate31);
        filterIterator23.setIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate35);
        filterIterator1.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) predicate46);
        filterIterator42.setPredicate(predicate46);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate55);
        java.lang.Object obj58 = defaultedMap40.put((java.lang.Object) predicate46, (java.lang.Object) filterIterator57);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate65);
        filterIterator57.setIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate69);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + "hi!" + "'", obj32.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "hi!" + "'", obj47.equals("hi!"));
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "hi!" + "'", obj66.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate69);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1L);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) (-1.0f));
        java.util.Set set15 = defaultedMap10.keySet();
        java.lang.String str16 = defaultedMap10.toString();
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap15.equals((java.lang.Object) defaultedMap26);
        defaultedMap15.clear();
        java.util.Collection collection37 = defaultedMap15.values();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(collection37);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        try {
            java.lang.Object obj31 = filterIterator18.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        int i12 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator17 = null;
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator(iterator17);
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        collections.Predicate predicate21 = filterIterator18.getPredicate();
        java.lang.Object obj23 = defaultedMap16.put((java.lang.Object) predicate21, (java.lang.Object) '4');
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) predicate33, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) defaultedMap28);
        java.util.Iterator iterator38 = null;
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator38);
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        java.util.Iterator iterator42 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) predicate45);
        filterIterator39.setPredicate(predicate45);
        boolean b48 = defaultedMap28.containsKey((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 1L);
        java.util.Iterator iterator53 = null;
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator53);
        java.util.Iterator iterator55 = filterIterator54.getIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap50, (java.lang.Object) filterIterator56);
        filterIterator39.setIterator((java.util.Iterator) filterIterator56);
        java.lang.Object obj59 = defaultedMap1.remove((java.lang.Object) filterIterator56);
        java.util.Collection collection60 = defaultedMap1.values();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + "hi!" + "'", obj46.equals("hi!"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) predicate5);
        filterIterator1.setPredicate(predicate5);
        collections.Predicate predicate8 = filterIterator1.getPredicate();
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        java.util.Iterator iterator13 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        filterIterator17.setPredicate(predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate30);
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) predicate21, (java.lang.Object) filterIterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate40);
        filterIterator32.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator32.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator13, predicate44);
        filterIterator1.setPredicate(predicate44);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!" + "'", obj6.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!" + "'", obj31.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate44);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1L);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) filterIterator12);
        boolean b14 = defaultedMap1.equals((java.lang.Object) map13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) predicate23, (java.lang.Object) '4');
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.Object obj28 = defaultedMap16.remove((java.lang.Object) ' ');
        defaultedMap16.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap16);
        java.util.Collection collection31 = defaultedMap16.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection31);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate6);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        java.lang.Object obj29 = defaultedMap11.put((java.lang.Object) predicate17, (java.lang.Object) filterIterator28);
        java.util.Iterator iterator30 = null;
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator30);
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj37 = defaultedMap35.get((java.lang.Object) predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate36);
        filterIterator28.setIterator((java.util.Iterator) filterIterator38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj43 = defaultedMap41.get((java.lang.Object) predicate42);
        filterIterator38.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator9, predicate42);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + "hi!" + "'", obj37.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + "hi!" + "'", obj43.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.clear();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.util.Set set10 = defaultedMap1.entrySet();
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj21 = defaultedMap14.put((java.lang.Object) predicate19, (java.lang.Object) '4');
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap26);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        java.util.Iterator iterator40 = filterIterator37.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) predicate43);
        filterIterator37.setPredicate(predicate43);
        boolean b46 = defaultedMap26.containsKey((java.lang.Object) filterIterator37);
        filterIterator9.setIterator((java.util.Iterator) filterIterator37);
        try {
            boolean b48 = filterIterator9.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate30);
        java.util.Iterator iterator32 = filterIterator18.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        try {
            boolean b34 = filterIterator18.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(iterator32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate6);
        java.util.Iterator iterator9 = filterIterator1.getIterator();
        try {
            boolean b10 = filterIterator1.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "hi!" + "'", obj7.equals("hi!"));
        org.junit.Assert.assertNull(iterator9);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) predicate39);
        filterIterator35.setPredicate(predicate39);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate48);
        java.lang.Object obj51 = defaultedMap33.put((java.lang.Object) predicate39, (java.lang.Object) filterIterator50);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate58);
        filterIterator50.setIterator((java.util.Iterator) filterIterator60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate64);
        java.util.Iterator iterator67 = filterIterator50.getIterator();
        filterIterator18.setIterator(iterator67);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "hi!" + "'", obj49.equals("hi!"));
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "hi!" + "'", obj65.equals("hi!"));
        org.junit.Assert.assertNotNull(iterator67);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Set set6 = defaultedMap1.keySet();
        defaultedMap1.clear();
        int i8 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap7.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1L);
        java.lang.String str13 = defaultedMap10.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1L);
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) filterIterator21);
        boolean b23 = defaultedMap10.equals((java.lang.Object) map22);
        boolean b24 = defaultedMap7.containsValue((java.lang.Object) b23);
        java.util.Set set25 = defaultedMap7.keySet();
        boolean b26 = defaultedMap7.isEmpty();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Set set28 = defaultedMap7.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set28);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        filterIterator18.setIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate25 = filterIterator21.getPredicate();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate25);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.String str19 = defaultedMap13.toString();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) predicate28);
        filterIterator24.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        java.lang.Object obj40 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) filterIterator39);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate47);
        filterIterator39.setIterator((java.util.Iterator) filterIterator49);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) filterIterator49);
        java.util.Set set52 = defaultedMap1.entrySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "hi!" + "'", obj48.equals("hi!"));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator7 = null;
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) predicate12);
        filterIterator8.setPredicate(predicate12);
        collections.Predicate predicate15 = filterIterator8.getPredicate();
        java.lang.Object obj16 = defaultedMap1.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator19);
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.Predicate predicate23 = filterIterator20.getPredicate();
        java.lang.Object obj25 = defaultedMap18.put((java.lang.Object) predicate23, (java.lang.Object) '4');
        java.util.Collection collection26 = defaultedMap18.values();
        java.util.Collection collection27 = defaultedMap18.values();
        java.util.Collection collection28 = defaultedMap18.values();
        boolean b29 = defaultedMap1.containsValue((java.lang.Object) defaultedMap18);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) b29);
        collections.Predicate predicate31 = null;
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        java.util.Iterator iterator37 = filterIterator35.getIterator();
        collections.Predicate predicate38 = filterIterator35.getPredicate();
        java.lang.Object obj40 = defaultedMap33.put((java.lang.Object) predicate38, (java.lang.Object) '4');
        java.util.Collection collection41 = defaultedMap33.values();
        java.util.Collection collection42 = defaultedMap33.values();
        java.util.Collection collection43 = defaultedMap33.values();
        java.util.Set set44 = defaultedMap33.keySet();
        java.util.Iterator iterator45 = null;
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator45);
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator50 = null;
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator(iterator50);
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj56 = defaultedMap54.get((java.lang.Object) predicate55);
        filterIterator51.setPredicate(predicate55);
        java.util.Iterator iterator58 = null;
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator(iterator58);
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj65 = defaultedMap63.get((java.lang.Object) predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate64);
        java.lang.Object obj67 = defaultedMap49.put((java.lang.Object) predicate55, (java.lang.Object) filterIterator66);
        java.util.Iterator iterator68 = filterIterator66.getIterator();
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap70.remove((java.lang.Object) 1L);
        java.lang.Object obj74 = defaultedMap70.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator76 = null;
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator(iterator76);
        java.util.Iterator iterator78 = filterIterator77.getIterator();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj82 = defaultedMap80.get((java.lang.Object) predicate81);
        filterIterator77.setPredicate(predicate81);
        collections.Predicate predicate84 = filterIterator77.getPredicate();
        java.lang.Object obj85 = defaultedMap70.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator(iterator68, predicate84);
        filterIterator46.setPredicate(predicate84);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate84, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate31, predicate84);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + "hi!" + "'", obj13.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + "hi!" + "'", obj56.equals("hi!"));
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + "hi!" + "'", obj65.equals("hi!"));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(iterator68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNull(iterator78);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertTrue("'" + obj82 + "' != '" + "hi!" + "'", obj82.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNull(obj85);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        try {
            java.lang.Object obj20 = filterIterator18.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 1L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1L);
        java.lang.String str17 = defaultedMap14.toString();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1L);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap19, (java.lang.Object) filterIterator25);
        boolean b27 = defaultedMap14.equals((java.lang.Object) map26);
        boolean b28 = defaultedMap11.containsValue((java.lang.Object) b27);
        java.util.Set set29 = defaultedMap11.keySet();
        boolean b30 = defaultedMap11.isEmpty();
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        boolean b32 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        int i33 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(i33 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 1L);
        java.lang.String str7 = defaultedMap4.toString();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1L);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) filterIterator15);
        boolean b17 = defaultedMap4.equals((java.lang.Object) map16);
        boolean b18 = defaultedMap1.containsValue((java.lang.Object) b17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.Predicate predicate27 = filterIterator24.getPredicate();
        java.lang.Object obj29 = defaultedMap22.put((java.lang.Object) predicate27, (java.lang.Object) '4');
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator35 = null;
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator(iterator35);
        java.util.Iterator iterator37 = filterIterator36.getIterator();
        java.util.Iterator iterator38 = filterIterator36.getIterator();
        collections.Predicate predicate39 = filterIterator36.getPredicate();
        java.lang.Object obj41 = defaultedMap34.put((java.lang.Object) predicate39, (java.lang.Object) '4');
        defaultedMap32.putAll((java.util.Map) defaultedMap34);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) defaultedMap34);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        java.util.Iterator iterator49 = filterIterator47.getIterator();
        collections.Predicate predicate50 = filterIterator47.getPredicate();
        java.lang.Object obj52 = defaultedMap45.put((java.lang.Object) predicate50, (java.lang.Object) '4');
        java.util.Collection collection53 = defaultedMap45.values();
        boolean b54 = defaultedMap34.equals((java.lang.Object) defaultedMap45);
        java.lang.Object obj56 = defaultedMap1.put((java.lang.Object) defaultedMap45, (java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        collections.Predicate predicate63 = filterIterator60.getPredicate();
        java.lang.Object obj65 = defaultedMap58.put((java.lang.Object) predicate63, (java.lang.Object) '4');
        int i66 = defaultedMap58.size();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap58, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj72 = defaultedMap70.remove((java.lang.Object) 1L);
        java.lang.Object obj74 = defaultedMap70.remove((java.lang.Object) (-1.0f));
        java.util.Set set75 = defaultedMap70.keySet();
        java.lang.String str76 = defaultedMap70.toString();
        java.lang.Object obj77 = defaultedMap58.get((java.lang.Object) defaultedMap70);
        java.util.Iterator iterator78 = null;
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator(iterator78);
        java.util.Iterator iterator80 = filterIterator79.getIterator();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        java.util.Map map82 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) filterIterator81);
        boolean b83 = defaultedMap1.containsKey((java.lang.Object) filterIterator81);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNull(iterator37);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertTrue(b54 == true);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(predicate63);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertTrue(i66 == 1);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(set75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj77 + "' != '" + (short) -1 + "'", obj77.equals((short) -1));
        org.junit.Assert.assertNull(iterator80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertTrue(b83 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        int i10 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1L);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) filterIterator18);
        defaultedMap12.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj30 = defaultedMap28.get((java.lang.Object) predicate29);
        filterIterator25.setPredicate(predicate29);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate38);
        java.lang.Object obj41 = defaultedMap23.put((java.lang.Object) predicate29, (java.lang.Object) filterIterator40);
        java.util.Iterator iterator42 = null;
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator(iterator42);
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate48);
        filterIterator40.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate52);
        java.util.Iterator iterator54 = filterIterator40.getIterator();
        java.lang.Object obj55 = defaultedMap1.get((java.lang.Object) filterIterator40);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + "hi!" + "'", obj30.equals("hi!"));
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + "hi!" + "'", obj49.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(iterator54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + (short) -1 + "'", obj55.equals((short) -1));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Predicate predicate12 = null;
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj16 = defaultedMap14.get((java.lang.Object) predicate15);
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate12, predicate15);
        boolean b19 = defaultedMap1.containsValue((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        java.util.Iterator iterator25 = filterIterator23.getIterator();
        collections.Predicate predicate26 = filterIterator23.getPredicate();
        java.lang.Object obj28 = defaultedMap21.put((java.lang.Object) predicate26, (java.lang.Object) '4');
        java.util.Collection collection29 = defaultedMap21.values();
        java.util.Collection collection30 = defaultedMap21.values();
        java.util.Collection collection31 = defaultedMap21.values();
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) predicate37);
        filterIterator33.setPredicate(predicate37);
        collections.Predicate predicate40 = filterIterator33.getPredicate();
        java.lang.Object obj41 = defaultedMap21.get((java.lang.Object) predicate40);
        java.lang.Object obj43 = defaultedMap21.get((java.lang.Object) 'a');
        java.lang.Object obj44 = defaultedMap1.remove((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator47 = null;
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator(iterator47);
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) predicate52);
        filterIterator48.setPredicate(predicate52);
        java.util.Iterator iterator55 = null;
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator(iterator55);
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj62 = defaultedMap60.get((java.lang.Object) predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate61);
        java.lang.Object obj64 = defaultedMap46.put((java.lang.Object) predicate52, (java.lang.Object) filterIterator63);
        java.util.Iterator iterator65 = null;
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator(iterator65);
        java.util.Iterator iterator67 = filterIterator66.getIterator();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj72 = defaultedMap70.get((java.lang.Object) predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate71);
        filterIterator63.setIterator((java.util.Iterator) filterIterator73);
        collections.Predicate predicate75 = collections.PredicateUtils.truePredicate();
        filterIterator63.setPredicate(predicate75);
        java.util.Iterator iterator77 = filterIterator63.getIterator();
        java.lang.Object obj78 = defaultedMap1.get((java.lang.Object) iterator77);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + "hi!" + "'", obj16.equals("hi!"));
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + (short) -1 + "'", obj41.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + "hi!" + "'", obj53.equals("hi!"));
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue("'" + obj62 + "' != '" + "hi!" + "'", obj62.equals("hi!"));
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "hi!" + "'", obj72.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(iterator77);
        org.junit.Assert.assertTrue("'" + obj78 + "' != '" + "hi!" + "'", obj78.equals("hi!"));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.String str19 = defaultedMap13.toString();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        java.util.Iterator iterator21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator(iterator21);
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator24);
        java.util.Set set26 = defaultedMap13.entrySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        java.util.Iterator iterator29 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        filterIterator26.setPredicate(predicate32);
        boolean b35 = defaultedMap15.containsKey((java.lang.Object) filterIterator26);
        try {
            filterIterator26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 1L);
        boolean b9 = defaultedMap5.equals((java.lang.Object) (-1.0d));
        int i10 = defaultedMap5.size();
        int i11 = defaultedMap5.size();
        java.util.Set set12 = defaultedMap5.entrySet();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj21 = defaultedMap14.put((java.lang.Object) predicate19, (java.lang.Object) '4');
        java.util.Collection collection22 = defaultedMap14.values();
        java.util.Collection collection23 = defaultedMap14.values();
        java.util.Collection collection24 = defaultedMap14.values();
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) predicate30);
        filterIterator26.setPredicate(predicate30);
        collections.Predicate predicate33 = filterIterator26.getPredicate();
        java.lang.Object obj34 = defaultedMap14.get((java.lang.Object) predicate33);
        boolean b36 = defaultedMap14.containsValue((java.lang.Object) 0);
        java.lang.Object obj37 = defaultedMap5.remove((java.lang.Object) defaultedMap14);
        java.lang.Object obj38 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!" + "'", obj31.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (short) -1 + "'", obj34.equals((short) -1));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + (short) -1 + "'", obj38.equals((short) -1));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1L);
        java.lang.Object obj26 = defaultedMap22.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) predicate33);
        filterIterator29.setPredicate(predicate33);
        collections.Predicate predicate36 = filterIterator29.getPredicate();
        java.lang.Object obj37 = defaultedMap22.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator20, predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator(iterator20);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj37);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj21 = defaultedMap14.put((java.lang.Object) predicate19, (java.lang.Object) '4');
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap26);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        java.util.Iterator iterator40 = filterIterator37.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) predicate43);
        filterIterator37.setPredicate(predicate43);
        boolean b46 = defaultedMap26.containsKey((java.lang.Object) filterIterator37);
        filterIterator9.setIterator((java.util.Iterator) filterIterator37);
        try {
            filterIterator37.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        java.lang.Object obj11 = null;
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj11);
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap1.equals(obj13);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate21);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        try {
            java.lang.Object obj25 = filterIterator16.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNotNull(map24);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.String str19 = defaultedMap13.toString();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap22.clear();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 1L);
        java.lang.String str28 = defaultedMap25.toString();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 1L);
        java.util.Iterator iterator33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator33);
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) filterIterator36);
        boolean b38 = defaultedMap25.equals((java.lang.Object) map37);
        boolean b39 = defaultedMap22.containsValue((java.lang.Object) b38);
        java.util.Set set40 = defaultedMap22.keySet();
        boolean b41 = defaultedMap13.equals((java.lang.Object) set40);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b41 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set3);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.lang.Object obj34 = defaultedMap27.put((java.lang.Object) predicate32, (java.lang.Object) '4');
        java.util.Collection collection35 = defaultedMap27.values();
        java.util.Collection collection36 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) filterIterator46);
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        java.util.Iterator iterator52 = filterIterator50.getIterator();
        java.util.Iterator iterator53 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) predicate56);
        filterIterator50.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) predicate68);
        filterIterator64.setPredicate(predicate68);
        collections.Predicate predicate71 = filterIterator64.getPredicate();
        filterIterator60.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate56, predicate71);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap27);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) ' ');
        java.util.Set set77 = defaultedMap1.keySet();
        java.util.Set set78 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) -1 + "'", obj76.equals((short) -1));
        org.junit.Assert.assertNotNull(set77);
        org.junit.Assert.assertNotNull(set78);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) predicate33, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        java.lang.Object obj47 = defaultedMap40.put((java.lang.Object) predicate45, (java.lang.Object) '4');
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        java.util.Iterator iterator55 = filterIterator53.getIterator();
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.lang.Object obj58 = defaultedMap51.put((java.lang.Object) predicate56, (java.lang.Object) '4');
        java.util.Collection collection59 = defaultedMap51.values();
        boolean b60 = defaultedMap40.equals((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        java.util.Set set62 = defaultedMap51.keySet();
        collections.Factory factory63 = null;
        try {
            java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, factory63);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set62);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Set set12 = defaultedMap1.keySet();
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) predicate23);
        filterIterator19.setPredicate(predicate23);
        java.util.Iterator iterator26 = null;
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator26);
        java.util.Iterator iterator28 = filterIterator27.getIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate32);
        java.lang.Object obj35 = defaultedMap17.put((java.lang.Object) predicate23, (java.lang.Object) filterIterator34);
        java.util.Iterator iterator36 = filterIterator34.getIterator();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.lang.Object obj42 = defaultedMap38.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator44 = null;
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator(iterator44);
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj50 = defaultedMap48.get((java.lang.Object) predicate49);
        filterIterator45.setPredicate(predicate49);
        collections.Predicate predicate52 = filterIterator45.getPredicate();
        java.lang.Object obj53 = defaultedMap38.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator(iterator36, predicate52);
        filterIterator14.setPredicate(predicate52);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate52, predicate56);
        collections.Transformer transformer58 = null;
        try {
            java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer58);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + "hi!" + "'", obj24.equals("hi!"));
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(iterator36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + "hi!" + "'", obj50.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) predicate33, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        java.lang.Object obj47 = defaultedMap40.put((java.lang.Object) predicate45, (java.lang.Object) '4');
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        java.util.Iterator iterator55 = filterIterator53.getIterator();
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.lang.Object obj58 = defaultedMap51.put((java.lang.Object) predicate56, (java.lang.Object) '4');
        java.util.Collection collection59 = defaultedMap51.values();
        boolean b60 = defaultedMap40.equals((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        java.lang.String str62 = defaultedMap1.toString();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{null=4}" + "'", str62.equals("{null=4}"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap15.equals((java.lang.Object) defaultedMap26);
        int i36 = defaultedMap26.size();
        int i37 = defaultedMap26.size();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue(i37 == 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap15.equals((java.lang.Object) defaultedMap26);
        int i36 = defaultedMap26.size();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) filterIterator46);
        java.lang.Object obj48 = null;
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, obj48);
        java.lang.Object obj50 = null;
        boolean b51 = defaultedMap38.equals(obj50);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate58);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator53);
        java.lang.Object obj62 = defaultedMap26.remove((java.lang.Object) filterIterator53);
        collections.Predicate predicate63 = filterIterator53.getPredicate();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + "hi!" + "'", obj59.equals("hi!"));
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertNull(predicate63);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap15.equals((java.lang.Object) defaultedMap26);
        collections.Transformer transformer36 = null;
        try {
            java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, transformer36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        boolean b10 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator13 = null;
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator(iterator13);
        java.util.Iterator iterator15 = filterIterator14.getIterator();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.Predicate predicate17 = filterIterator14.getPredicate();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) predicate17, (java.lang.Object) '4');
        java.util.Collection collection20 = defaultedMap12.values();
        java.util.Collection collection21 = defaultedMap12.values();
        java.util.Collection collection22 = defaultedMap12.values();
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) predicate28);
        filterIterator24.setPredicate(predicate28);
        collections.Predicate predicate31 = filterIterator24.getPredicate();
        java.lang.Object obj32 = defaultedMap12.get((java.lang.Object) predicate31);
        boolean b34 = defaultedMap12.containsValue((java.lang.Object) 0);
        java.lang.Object obj35 = null;
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, obj35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        java.util.Iterator iterator42 = filterIterator40.getIterator();
        collections.Predicate predicate43 = filterIterator40.getPredicate();
        java.lang.Object obj45 = defaultedMap38.put((java.lang.Object) predicate43, (java.lang.Object) '4');
        java.util.Collection collection46 = defaultedMap38.values();
        java.util.Collection collection47 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1L);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        java.util.Map map56 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) filterIterator55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        java.lang.Object obj58 = defaultedMap49.remove((java.lang.Object) filterIterator57);
        defaultedMap38.putAll((java.util.Map) defaultedMap49);
        java.util.Iterator iterator60 = null;
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator(iterator60);
        java.util.Iterator iterator62 = filterIterator61.getIterator();
        java.util.Iterator iterator63 = filterIterator61.getIterator();
        java.util.Iterator iterator64 = filterIterator61.getIterator();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj68 = defaultedMap66.get((java.lang.Object) predicate67);
        filterIterator61.setPredicate(predicate67);
        java.util.Iterator iterator70 = null;
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator(iterator70);
        java.util.Iterator iterator72 = filterIterator71.getIterator();
        java.util.Iterator iterator73 = filterIterator71.getIterator();
        java.util.Iterator iterator74 = null;
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator(iterator74);
        java.util.Iterator iterator76 = filterIterator75.getIterator();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj80 = defaultedMap78.get((java.lang.Object) predicate79);
        filterIterator75.setPredicate(predicate79);
        collections.Predicate predicate82 = filterIterator75.getPredicate();
        filterIterator71.setPredicate(predicate82);
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate67, predicate82);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap38);
        collections.map.DefaultedMap defaultedMap87 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap87.clear();
        defaultedMap87.clear();
        int i90 = defaultedMap87.size();
        defaultedMap12.putAll((java.util.Map) defaultedMap87);
        boolean b92 = defaultedMap1.containsKey((java.lang.Object) defaultedMap12);
        java.util.Set set93 = defaultedMap12.keySet();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(collection20);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + (short) -1 + "'", obj32.equals((short) -1));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(iterator64);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + "hi!" + "'", obj68.equals("hi!"));
        org.junit.Assert.assertNull(iterator72);
        org.junit.Assert.assertNull(iterator73);
        org.junit.Assert.assertNull(iterator76);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + "hi!" + "'", obj80.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertTrue(i90 == 0);
        org.junit.Assert.assertTrue(b92 == false);
        org.junit.Assert.assertNotNull(set93);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) predicate7);
        filterIterator3.setPredicate(predicate7);
        java.util.Iterator iterator10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator10);
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj17 = defaultedMap15.get((java.lang.Object) predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11, predicate16);
        java.lang.Object obj19 = defaultedMap1.put((java.lang.Object) predicate7, (java.lang.Object) filterIterator18);
        java.util.Iterator iterator20 = null;
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator(iterator20);
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj27 = defaultedMap25.get((java.lang.Object) predicate26);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21, predicate26);
        filterIterator18.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1L);
        java.lang.Object obj37 = defaultedMap33.remove((java.lang.Object) (-1.0f));
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) predicate44);
        filterIterator40.setPredicate(predicate44);
        collections.Predicate predicate47 = filterIterator40.getPredicate();
        java.lang.Object obj48 = defaultedMap33.put((java.lang.Object) (-1.0f), (java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate47);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "hi!" + "'", obj8.equals("hi!"));
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + "hi!" + "'", obj17.equals("hi!"));
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + "hi!" + "'", obj27.equals("hi!"));
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNull(obj48);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) predicate2);
        defaultedMap1.clear();
        defaultedMap1.clear();
        java.util.Iterator iterator6 = null;
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator(iterator6);
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.Predicate predicate10 = filterIterator7.getPredicate();
        java.util.Iterator iterator11 = null;
        filterIterator7.setIterator(iterator11);
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) iterator11);
        java.util.Set set14 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + "hi!" + "'", obj3.equals("hi!"));
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(set14);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) (-1.0f));
        java.util.Set set18 = defaultedMap13.keySet();
        java.lang.String str19 = defaultedMap13.toString();
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator23);
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) predicate28);
        filterIterator24.setPredicate(predicate28);
        java.util.Iterator iterator31 = null;
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator(iterator31);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj38 = defaultedMap36.get((java.lang.Object) predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate37);
        java.lang.Object obj40 = defaultedMap22.put((java.lang.Object) predicate28, (java.lang.Object) filterIterator39);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj48 = defaultedMap46.get((java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42, predicate47);
        filterIterator39.setIterator((java.util.Iterator) filterIterator49);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) filterIterator49);
        try {
            java.lang.Object obj52 = filterIterator49.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + (short) -1 + "'", obj20.equals((short) -1));
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + "hi!" + "'", obj38.equals("hi!"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + "hi!" + "'", obj48.equals("hi!"));
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        java.util.Collection collection34 = defaultedMap26.values();
        boolean b35 = defaultedMap15.equals((java.lang.Object) defaultedMap26);
        boolean b36 = defaultedMap26.isEmpty();
        java.lang.Object obj38 = defaultedMap26.remove((java.lang.Object) 100);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(collection34);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        java.util.Iterator iterator13 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        filterIterator17.setPredicate(predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate30);
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) predicate21, (java.lang.Object) filterIterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate40);
        filterIterator32.setIterator((java.util.Iterator) filterIterator42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator32.setPredicate(predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator(iterator13, predicate44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate44);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!" + "'", obj31.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate44);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj6 = defaultedMap4.get((java.lang.Object) predicate5);
        filterIterator1.setPredicate(predicate5);
        collections.Predicate predicate8 = filterIterator1.getPredicate();
        collections.Predicate predicate9 = filterIterator1.getPredicate();
        java.util.Iterator iterator10 = filterIterator1.getIterator();
        try {
            java.lang.Object obj11 = filterIterator1.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + obj6 + "' != '" + "hi!" + "'", obj6.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj24 = null;
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator28);
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.Predicate predicate32 = filterIterator29.getPredicate();
        java.lang.Object obj34 = defaultedMap27.put((java.lang.Object) predicate32, (java.lang.Object) '4');
        java.util.Collection collection35 = defaultedMap27.values();
        java.util.Collection collection36 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1L);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.lang.Object obj47 = defaultedMap38.remove((java.lang.Object) filterIterator46);
        defaultedMap27.putAll((java.util.Map) defaultedMap38);
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        java.util.Iterator iterator52 = filterIterator50.getIterator();
        java.util.Iterator iterator53 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) predicate56);
        filterIterator50.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        java.util.Iterator iterator63 = null;
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator(iterator63);
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj69 = defaultedMap67.get((java.lang.Object) predicate68);
        filterIterator64.setPredicate(predicate68);
        collections.Predicate predicate71 = filterIterator64.getPredicate();
        filterIterator60.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate56, predicate71);
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap27);
        java.lang.Object obj76 = defaultedMap1.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + "hi!" + "'", obj69.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + obj76 + "' != '" + (short) -1 + "'", obj76.equals((short) -1));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.Predicate predicate18 = filterIterator15.getPredicate();
        java.lang.Object obj20 = defaultedMap13.put((java.lang.Object) predicate18, (java.lang.Object) '4');
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.Object obj23 = defaultedMap11.remove((java.lang.Object) ' ');
        defaultedMap11.clear();
        defaultedMap11.clear();
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator29 = null;
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator(iterator29);
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.Predicate predicate33 = filterIterator30.getPredicate();
        java.lang.Object obj35 = defaultedMap28.put((java.lang.Object) predicate33, (java.lang.Object) '4');
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator41);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.Predicate predicate45 = filterIterator42.getPredicate();
        java.lang.Object obj47 = defaultedMap40.put((java.lang.Object) predicate45, (java.lang.Object) '4');
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator52 = null;
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator(iterator52);
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        java.util.Iterator iterator55 = filterIterator53.getIterator();
        collections.Predicate predicate56 = filterIterator53.getPredicate();
        java.lang.Object obj58 = defaultedMap51.put((java.lang.Object) predicate56, (java.lang.Object) '4');
        java.util.Collection collection59 = defaultedMap51.values();
        boolean b60 = defaultedMap40.equals((java.lang.Object) defaultedMap51);
        defaultedMap1.putAll((java.util.Map) defaultedMap51);
        java.util.Set set62 = defaultedMap51.keySet();
        java.lang.Object obj64 = defaultedMap51.get((java.lang.Object) (-1));
        int i65 = defaultedMap51.size();
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNull(iterator55);
        org.junit.Assert.assertNull(predicate56);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(collection59);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + (short) -1 + "'", obj64.equals((short) -1));
        org.junit.Assert.assertTrue(i65 == 1);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.remove((java.lang.Object) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator15 = null;
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator(iterator15);
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.Predicate predicate19 = filterIterator16.getPredicate();
        java.lang.Object obj21 = defaultedMap14.put((java.lang.Object) predicate19, (java.lang.Object) '4');
        defaultedMap12.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.Predicate predicate31 = filterIterator28.getPredicate();
        java.lang.Object obj33 = defaultedMap26.put((java.lang.Object) predicate31, (java.lang.Object) '4');
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) defaultedMap26);
        java.util.Iterator iterator36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator(iterator36);
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        java.util.Iterator iterator40 = filterIterator37.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) predicate43);
        filterIterator37.setPredicate(predicate43);
        boolean b46 = defaultedMap26.containsKey((java.lang.Object) filterIterator37);
        filterIterator9.setIterator((java.util.Iterator) filterIterator37);
        try {
            java.lang.Object obj48 = filterIterator9.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + "hi!" + "'", obj44.equals("hi!"));
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator11 = null;
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator(iterator11);
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.Predicate predicate15 = filterIterator12.getPredicate();
        java.lang.Object obj17 = defaultedMap10.put((java.lang.Object) predicate15, (java.lang.Object) '4');
        defaultedMap8.putAll((java.util.Map) defaultedMap10);
        collections.Predicate predicate19 = null;
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) predicate22);
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate19, predicate22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap26.clear();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 1L);
        java.lang.String str32 = defaultedMap29.toString();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1L);
        java.util.Iterator iterator37 = null;
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator(iterator37);
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) filterIterator40);
        boolean b42 = defaultedMap29.equals((java.lang.Object) map41);
        boolean b43 = defaultedMap26.containsValue((java.lang.Object) b42);
        defaultedMap8.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) defaultedMap26);
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap1.containsKey(obj46);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + "hi!" + "'", obj23.equals("hi!"));
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertTrue(b47 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.Predicate predicate20 = filterIterator17.getPredicate();
        java.lang.Object obj22 = defaultedMap15.put((java.lang.Object) predicate20, (java.lang.Object) '4');
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap15);
        java.util.Iterator iterator25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator25);
        java.util.Iterator iterator27 = filterIterator26.getIterator();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        java.util.Iterator iterator29 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj33 = defaultedMap31.get((java.lang.Object) predicate32);
        filterIterator26.setPredicate(predicate32);
        boolean b35 = defaultedMap15.containsKey((java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1L);
        java.util.Iterator iterator40 = null;
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator(iterator40);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) filterIterator43);
        filterIterator26.setIterator((java.util.Iterator) filterIterator43);
        java.util.Iterator iterator46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator46);
        java.util.Iterator iterator48 = filterIterator47.getIterator();
        java.util.Iterator iterator49 = filterIterator47.getIterator();
        filterIterator43.setIterator((java.util.Iterator) filterIterator47);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj54 = defaultedMap52.get((java.lang.Object) predicate53);
        filterIterator43.setPredicate(predicate53);
        collections.Predicate predicate56 = filterIterator43.getPredicate();
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj63 = defaultedMap61.get((java.lang.Object) predicate62);
        filterIterator58.setPredicate(predicate62);
        collections.Predicate predicate65 = filterIterator58.getPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate65);
        try {
            boolean b67 = filterIterator66.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + "hi!" + "'", obj33.equals("hi!"));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + "hi!" + "'", obj54.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + "hi!" + "'", obj63.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate65);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        int i10 = defaultedMap1.size();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator14);
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) predicate19);
        filterIterator15.setPredicate(predicate19);
        java.util.Iterator iterator22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator22);
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23, predicate28);
        java.lang.Object obj31 = defaultedMap13.put((java.lang.Object) predicate19, (java.lang.Object) filterIterator30);
        java.util.Iterator iterator32 = null;
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator(iterator32);
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj39 = defaultedMap37.get((java.lang.Object) predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33, predicate38);
        filterIterator30.setIterator((java.util.Iterator) filterIterator40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj45 = defaultedMap43.get((java.lang.Object) predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate44);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator49 = null;
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator(iterator49);
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj55 = defaultedMap53.get((java.lang.Object) predicate54);
        filterIterator50.setPredicate(predicate54);
        java.util.Iterator iterator57 = null;
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator(iterator57);
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj64 = defaultedMap62.get((java.lang.Object) predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate63);
        java.lang.Object obj66 = defaultedMap48.put((java.lang.Object) predicate54, (java.lang.Object) filterIterator65);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator69 = null;
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator69);
        java.util.Iterator iterator71 = filterIterator70.getIterator();
        java.util.Iterator iterator72 = filterIterator70.getIterator();
        collections.Predicate predicate73 = filterIterator70.getPredicate();
        java.lang.Object obj75 = defaultedMap68.put((java.lang.Object) predicate73, (java.lang.Object) '4');
        java.util.Collection collection76 = defaultedMap68.values();
        java.util.Collection collection77 = defaultedMap68.values();
        java.util.Collection collection78 = defaultedMap68.values();
        java.util.Iterator iterator79 = null;
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator(iterator79);
        java.util.Iterator iterator81 = filterIterator80.getIterator();
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj85 = defaultedMap83.get((java.lang.Object) predicate84);
        filterIterator80.setPredicate(predicate84);
        collections.Predicate predicate87 = filterIterator80.getPredicate();
        java.lang.Object obj88 = defaultedMap68.get((java.lang.Object) predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate87);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate44, predicate87);
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b92 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{null=4}" + "'", str11.equals("{null=4}"));
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + "hi!" + "'", obj29.equals("hi!"));
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + "hi!" + "'", obj39.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + "hi!" + "'", obj45.equals("hi!"));
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + "hi!" + "'", obj55.equals("hi!"));
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertTrue("'" + obj64 + "' != '" + "hi!" + "'", obj64.equals("hi!"));
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(iterator71);
        org.junit.Assert.assertNull(iterator72);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(collection76);
        org.junit.Assert.assertNotNull(collection77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue("'" + obj85 + "' != '" + "hi!" + "'", obj85.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + (short) -1 + "'", obj88.equals((short) -1));
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertTrue(b92 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj4 = defaultedMap1.put((java.lang.Object) 10L, (java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap6.clear();
        java.util.Set set8 = defaultedMap6.entrySet();
        java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) set8);
        java.util.Set set10 = defaultedMap1.keySet();
        java.util.Collection collection11 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(map9);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNotNull(collection11);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        int i10 = defaultedMap1.size();
        java.lang.String str11 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1L);
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.lang.Object obj22 = defaultedMap13.remove((java.lang.Object) filterIterator21);
        java.lang.Object obj23 = null;
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, obj23);
        java.lang.Object obj25 = null;
        boolean b26 = defaultedMap13.equals(obj25);
        java.util.Iterator iterator27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator27);
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj34 = defaultedMap32.get((java.lang.Object) predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) filterIterator28);
        boolean b37 = defaultedMap1.equals((java.lang.Object) filterIterator28);
        boolean b38 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{null=4}" + "'", str11.equals("{null=4}"));
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + "hi!" + "'", obj34.equals("hi!"));
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj15 = defaultedMap13.get((java.lang.Object) predicate14);
        defaultedMap13.clear();
        defaultedMap13.clear();
        java.util.Iterator iterator18 = null;
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator(iterator18);
        java.util.Iterator iterator20 = filterIterator19.getIterator();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.Predicate predicate22 = filterIterator19.getPredicate();
        java.util.Iterator iterator23 = null;
        filterIterator19.setIterator(iterator23);
        boolean b25 = defaultedMap13.containsKey((java.lang.Object) iterator23);
        boolean b26 = defaultedMap1.containsKey((java.lang.Object) b25);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + "hi!" + "'", obj15.equals("hi!"));
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        int i9 = defaultedMap1.size();
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) (byte) -1);
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        java.util.Iterator iterator16 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj20 = defaultedMap18.get((java.lang.Object) predicate19);
        filterIterator13.setPredicate(predicate19);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        java.util.Iterator iterator27 = filterIterator25.getIterator();
        collections.Predicate predicate28 = filterIterator25.getPredicate();
        java.lang.Object obj30 = defaultedMap23.put((java.lang.Object) predicate28, (java.lang.Object) '4');
        java.util.Collection collection31 = defaultedMap23.values();
        java.util.Collection collection32 = defaultedMap23.values();
        java.util.Collection collection33 = defaultedMap23.values();
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj40 = defaultedMap38.get((java.lang.Object) predicate39);
        filterIterator35.setPredicate(predicate39);
        collections.Predicate predicate42 = filterIterator35.getPredicate();
        java.lang.Object obj43 = defaultedMap23.get((java.lang.Object) predicate42);
        java.lang.Object obj45 = defaultedMap23.get((java.lang.Object) "hi!");
        java.lang.Object obj46 = defaultedMap1.put((java.lang.Object) filterIterator13, (java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + "hi!" + "'", obj20.equals("hi!"));
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(collection31);
        org.junit.Assert.assertNotNull(collection32);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + "hi!" + "'", obj40.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + (short) -1 + "'", obj43.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + (short) -1 + "'", obj45.equals((short) -1));
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1L);
        boolean b5 = defaultedMap1.equals((java.lang.Object) (-1.0d));
        java.util.Set set6 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator2 = null;
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator(iterator2);
        java.util.Iterator iterator4 = filterIterator3.getIterator();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.Predicate predicate6 = filterIterator3.getPredicate();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) predicate6, (java.lang.Object) '4');
        java.util.Collection collection9 = defaultedMap1.values();
        java.util.Collection collection10 = defaultedMap1.values();
        java.util.Collection collection11 = defaultedMap1.values();
        java.util.Iterator iterator12 = null;
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator(iterator12);
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) predicate17);
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate20 = filterIterator13.getPredicate();
        java.lang.Object obj21 = defaultedMap1.get((java.lang.Object) predicate20);
        boolean b23 = defaultedMap1.containsValue((java.lang.Object) 0);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) (short) 1);
        int i26 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1L);
        java.lang.String str34 = defaultedMap31.toString();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1L);
        java.util.Iterator iterator39 = null;
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator(iterator39);
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) filterIterator42);
        boolean b44 = defaultedMap31.equals((java.lang.Object) map43);
        boolean b45 = defaultedMap28.containsValue((java.lang.Object) b44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator48 = null;
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator(iterator48);
        java.util.Iterator iterator50 = filterIterator49.getIterator();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        collections.Predicate predicate52 = filterIterator49.getPredicate();
        java.lang.Object obj54 = defaultedMap47.put((java.lang.Object) predicate52, (java.lang.Object) '4');
        java.util.Collection collection55 = defaultedMap47.values();
        java.util.Collection collection56 = defaultedMap47.values();
        java.util.Collection collection57 = defaultedMap47.values();
        java.util.Set set58 = defaultedMap47.keySet();
        defaultedMap47.clear();
        java.lang.Object obj60 = defaultedMap28.get((java.lang.Object) defaultedMap47);
        java.lang.Object obj61 = defaultedMap1.get((java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + "hi!" + "'", obj18.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + (short) -1 + "'", obj21.equals((short) -1));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short) -1 + "'", obj25.equals((short) -1));
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(collection55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(collection57);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + (short) -1 + "'", obj60.equals((short) -1));
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + (short) -1 + "'", obj61.equals((short) -1));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator4 = null;
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator(iterator4);
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.Predicate predicate8 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap3.put((java.lang.Object) predicate8, (java.lang.Object) '4');
        java.util.Collection collection11 = defaultedMap3.values();
        int i12 = defaultedMap3.size();
        java.lang.String str13 = defaultedMap3.toString();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator16 = null;
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator(iterator16);
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) predicate21);
        filterIterator17.setPredicate(predicate21);
        java.util.Iterator iterator24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator24);
        java.util.Iterator iterator26 = filterIterator25.getIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj31 = defaultedMap29.get((java.lang.Object) predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate30);
        java.lang.Object obj33 = defaultedMap15.put((java.lang.Object) predicate21, (java.lang.Object) filterIterator32);
        java.util.Iterator iterator34 = null;
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator(iterator34);
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj41 = defaultedMap39.get((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate40);
        filterIterator32.setIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj47 = defaultedMap45.get((java.lang.Object) predicate46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate46);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        java.util.Iterator iterator51 = null;
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator(iterator51);
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) predicate56);
        filterIterator52.setPredicate(predicate56);
        java.util.Iterator iterator59 = null;
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator59);
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj66 = defaultedMap64.get((java.lang.Object) predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate65);
        java.lang.Object obj68 = defaultedMap50.put((java.lang.Object) predicate56, (java.lang.Object) filterIterator67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) (short) -1);
        java.util.Iterator iterator71 = null;
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator(iterator71);
        java.util.Iterator iterator73 = filterIterator72.getIterator();
        java.util.Iterator iterator74 = filterIterator72.getIterator();
        collections.Predicate predicate75 = filterIterator72.getPredicate();
        java.lang.Object obj77 = defaultedMap70.put((java.lang.Object) predicate75, (java.lang.Object) '4');
        java.util.Collection collection78 = defaultedMap70.values();
        java.util.Collection collection79 = defaultedMap70.values();
        java.util.Collection collection80 = defaultedMap70.values();
        java.util.Iterator iterator81 = null;
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator81);
        java.util.Iterator iterator83 = filterIterator82.getIterator();
        collections.map.DefaultedMap defaultedMap85 = new collections.map.DefaultedMap((java.lang.Object) "hi!");
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        java.lang.Object obj87 = defaultedMap85.get((java.lang.Object) predicate86);
        filterIterator82.setPredicate(predicate86);
        collections.Predicate predicate89 = filterIterator82.getPredicate();
        java.lang.Object obj90 = defaultedMap70.get((java.lang.Object) predicate89);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate89);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate46, predicate89);
        filterIterator1.setPredicate(predicate46);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(collection11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{null=4}" + "'", str13.equals("{null=4}"));
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + "hi!" + "'", obj22.equals("hi!"));
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + "hi!" + "'", obj31.equals("hi!"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + "hi!" + "'", obj41.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + "hi!" + "'", obj47.equals("hi!"));
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + "hi!" + "'", obj57.equals("hi!"));
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + "hi!" + "'", obj66.equals("hi!"));
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNull(iterator73);
        org.junit.Assert.assertNull(iterator74);
        org.junit.Assert.assertNull(predicate75);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(collection78);
        org.junit.Assert.assertNotNull(collection79);
        org.junit.Assert.assertNotNull(collection80);
        org.junit.Assert.assertNull(iterator83);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + "hi!" + "'", obj87.equals("hi!"));
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertTrue("'" + obj90 + "' != '" + (short) -1 + "'", obj90.equals((short) -1));
        org.junit.Assert.assertNotNull(map92);
    }
}

