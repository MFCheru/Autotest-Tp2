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
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate2 = null;
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
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
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        boolean b5 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        java.lang.String str15 = defaultedMap14.toString();
        java.lang.Object obj18 = defaultedMap14.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate22, predicate24);
        filterIterator0.setPredicate(predicate22);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        int i9 = defaultedMap8.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) filterIterator12);
        java.lang.Object obj17 = defaultedMap8.remove((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap10.containsKey(obj12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) filterIterator14);
        boolean b19 = defaultedMap3.containsValue((java.lang.Object) filterIterator14);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        int i20 = defaultedMap19.size();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        java.util.Iterator iterator23 = filterIterator21.getIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        int i25 = defaultedMap24.size();
        defaultedMap19.putAll((java.util.Map) defaultedMap24);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        java.util.Iterator iterator29 = filterIterator27.getIterator();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        java.util.Set set31 = defaultedMap30.entrySet();
        java.lang.String str32 = defaultedMap30.toString();
        int i33 = defaultedMap30.size();
        boolean b34 = defaultedMap24.containsValue((java.lang.Object) i33);
        java.lang.Object obj35 = defaultedMap2.remove((java.lang.Object) i33);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        java.util.Set set16 = defaultedMap2.keySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        java.util.Iterator iterator10 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.lang.Object obj13 = null;
        boolean b14 = defaultedMap11.containsKey(obj13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        java.lang.Object obj19 = defaultedMap11.remove((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator20.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        filterIterator20.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        filterIterator20.setIterator((java.util.Iterator) filterIterator28);
        filterIterator15.setIterator((java.util.Iterator) filterIterator28);
        filterIterator0.setIterator((java.util.Iterator) filterIterator15);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(predicate29);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        int i6 = defaultedMap3.size();
        java.lang.Object obj8 = defaultedMap3.get((java.lang.Object) (short) 0);
        defaultedMap3.clear();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator20);
        filterIterator14.setIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate24);
        boolean b26 = defaultedMap3.containsKey((java.lang.Object) filterIterator14);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) (short) 10);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) 0);
        java.lang.String str12 = defaultedMap8.toString();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        java.lang.Object obj14 = null;
        boolean b15 = defaultedMap3.containsKey(obj14);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.String str18 = defaultedMap17.toString();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.String str23 = defaultedMap22.toString();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        java.lang.Object obj32 = defaultedMap22.get((java.lang.Object) filterIterator29);
        java.lang.Object obj33 = defaultedMap17.remove((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        java.util.Iterator iterator36 = filterIterator34.getIterator();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        int i38 = defaultedMap37.size();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        int i43 = defaultedMap42.size();
        defaultedMap37.putAll((java.util.Map) defaultedMap42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap42);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        java.lang.Object obj49 = defaultedMap42.get((java.lang.Object) filterIterator46);
        java.lang.Object obj50 = defaultedMap3.put(obj33, obj49);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(obj49);
        org.junit.Assert.assertNull(obj50);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate21, predicate23);
        boolean b25 = defaultedMap3.containsKey((java.lang.Object) map24);
        java.util.Set set26 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.lang.String str9 = defaultedMap8.toString();
        java.lang.Object obj12 = defaultedMap8.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate16, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        filterIterator28.setPredicate(predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap23, predicate31, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate16, predicate33);
        java.util.Map map36 = null;
        try {
            defaultedMap3.putAll(map36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map35);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.lang.String str9 = defaultedMap8.toString();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator15);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) filterIterator15);
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) filterIterator15);
        defaultedMap3.clear();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.util.Collection collection5 = defaultedMap3.values();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        int i9 = defaultedMap8.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.lang.String str16 = defaultedMap15.toString();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        java.lang.String str21 = defaultedMap20.toString();
        java.lang.Object obj24 = defaultedMap20.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        java.util.Iterator iterator34 = filterIterator32.getIterator();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        java.lang.String str36 = defaultedMap35.toString();
        java.lang.Object obj39 = defaultedMap35.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate43, predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate28, predicate45);
        boolean b48 = defaultedMap8.containsValue((java.lang.Object) predicate45);
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj50 = defaultedMap8.get((java.lang.Object) predicate49);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(obj50);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        int i14 = defaultedMap13.size();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        int i19 = defaultedMap18.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        java.lang.Object obj25 = defaultedMap18.get((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap18.entrySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap18);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        int i32 = defaultedMap31.size();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        int i37 = defaultedMap36.size();
        defaultedMap31.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap36);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        java.lang.Object obj43 = defaultedMap36.get((java.lang.Object) filterIterator40);
        java.lang.Object obj44 = defaultedMap18.get((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(obj44);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        filterIterator5.setIterator((java.util.Iterator) filterIterator10);
        java.lang.Object obj13 = defaultedMap3.get((java.lang.Object) filterIterator10);
        int i14 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate22);
        java.lang.Object obj24 = defaultedMap18.remove((java.lang.Object) filterIterator19);
        java.lang.Object obj25 = defaultedMap3.get(obj24);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        java.util.Set set15 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) set21, (java.lang.Object) defaultedMap25);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        boolean b21 = defaultedMap3.containsValue((java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        filterIterator25.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.lang.String str38 = defaultedMap36.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        java.lang.String str58 = defaultedMap57.toString();
        java.lang.Object obj61 = defaultedMap57.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate52, predicate65);
        filterIterator25.setPredicate(predicate52);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate23, predicate52);
        java.util.Set set72 = defaultedMap3.keySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(set72);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        int i14 = defaultedMap13.size();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        int i19 = defaultedMap18.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        java.util.Set set22 = defaultedMap18.entrySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap18);
        java.util.Set set24 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.util.Set set28 = defaultedMap16.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.lang.String str34 = defaultedMap32.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap32);
        java.util.Set set37 = defaultedMap10.keySet();
        java.util.Set set38 = defaultedMap10.keySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = filterIterator9.getPredicate();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap15.containsKey(obj17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) filterIterator19);
        defaultedMap11.putAll((java.util.Map) defaultedMap15);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        java.util.Iterator iterator27 = filterIterator25.getIterator();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        java.util.Iterator iterator34 = filterIterator32.getIterator();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        java.util.Set set36 = defaultedMap35.entrySet();
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap35.containsKey(obj37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) filterIterator39);
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object obj46 = defaultedMap31.get(obj45);
        java.lang.Object obj47 = defaultedMap11.put((java.lang.Object) filterIterator25, obj46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = filterIterator48.getPredicate();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        java.lang.String str52 = defaultedMap51.toString();
        java.lang.Object obj55 = defaultedMap51.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate59, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        filterIterator63.setPredicate(predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate61, predicate66);
        filterIterator0.setPredicate(predicate61);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate10);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map68);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator20);
        filterIterator7.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate24 = filterIterator20.getPredicate();
        try {
            filterIterator20.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator20);
        filterIterator7.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate24 = filterIterator20.getPredicate();
        try {
            java.lang.Object obj25 = filterIterator20.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        java.lang.Object obj4 = defaultedMap2.get((java.lang.Object) (short) 100);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj17 = defaultedMap6.remove((java.lang.Object) "{}");
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        java.util.Iterator iterator25 = filterIterator23.getIterator();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap26.containsKey(obj28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) filterIterator30);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object obj37 = defaultedMap22.get(obj36);
        java.lang.Object obj38 = defaultedMap2.put((java.lang.Object) filterIterator16, obj37);
        try {
            java.lang.Object obj39 = filterIterator16.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator16.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        filterIterator16.setIterator((java.util.Iterator) filterIterator21);
        filterIterator15.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate25);
        filterIterator10.setIterator((java.util.Iterator) filterIterator15);
        filterIterator4.setIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate30);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        java.util.Set set6 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(predicate7);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.lang.String str18 = defaultedMap16.toString();
        int i19 = defaultedMap16.size();
        java.lang.Object obj21 = defaultedMap16.get((java.lang.Object) (short) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator6);
        java.lang.String str10 = defaultedMap9.toString();
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        java.util.Iterator iterator23 = filterIterator21.getIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj28 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate32, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate19, predicate32);
        boolean b37 = defaultedMap3.isEmpty();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = filterIterator47.getPredicate();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) predicate48);
        int i50 = defaultedMap49.size();
        java.lang.Object obj51 = defaultedMap42.remove((java.lang.Object) defaultedMap49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = filterIterator52.getPredicate();
        java.util.Iterator iterator54 = filterIterator52.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        java.lang.String str56 = defaultedMap55.toString();
        java.lang.Object obj59 = defaultedMap55.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator60.setPredicate(predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map66 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate63, predicate65);
        java.util.Set set67 = defaultedMap55.keySet();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = filterIterator68.getPredicate();
        java.util.Iterator iterator70 = filterIterator68.getIterator();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) filterIterator68);
        java.util.Set set72 = defaultedMap71.entrySet();
        java.lang.String str73 = defaultedMap71.toString();
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) defaultedMap71);
        java.util.Map map75 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) defaultedMap71);
        java.util.Set set76 = defaultedMap49.keySet();
        java.lang.Object obj77 = defaultedMap3.put((java.lang.Object) 0, (java.lang.Object) set76);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(predicate48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNull(predicate69);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(set76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        int i15 = defaultedMap14.size();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        int i20 = defaultedMap19.size();
        defaultedMap14.putAll((java.util.Map) defaultedMap19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap19);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator23.setPredicate(predicate24);
        java.lang.Object obj26 = defaultedMap19.get((java.lang.Object) filterIterator23);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator10.setIterator((java.util.Iterator) filterIterator27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        int i33 = defaultedMap32.size();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = filterIterator34.getPredicate();
        java.util.Iterator iterator36 = filterIterator34.getIterator();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) filterIterator34);
        int i38 = defaultedMap37.size();
        defaultedMap32.putAll((java.util.Map) defaultedMap37);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap37);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        java.util.Iterator iterator43 = filterIterator41.getIterator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        java.lang.String str45 = defaultedMap44.toString();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        filterIterator46.setIterator((java.util.Iterator) filterIterator51);
        java.lang.Object obj54 = defaultedMap44.get((java.lang.Object) filterIterator51);
        java.lang.Object obj55 = defaultedMap37.remove(obj54);
        java.util.Collection collection56 = defaultedMap37.values();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = null;
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate58, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate58);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(collection56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map61);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        int i9 = defaultedMap8.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        java.lang.Object obj15 = defaultedMap8.get((java.lang.Object) filterIterator12);
        java.util.Set set16 = defaultedMap8.entrySet();
        boolean b17 = defaultedMap8.isEmpty();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        java.util.Iterator iterator25 = filterIterator23.getIterator();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap26.containsKey(obj28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) filterIterator30);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object obj37 = defaultedMap22.get(obj36);
        java.lang.Object obj38 = defaultedMap2.put((java.lang.Object) filterIterator16, obj37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        java.util.Iterator iterator45 = filterIterator43.getIterator();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) filterIterator43);
        java.lang.String str47 = defaultedMap46.toString();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = filterIterator48.getPredicate();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        java.lang.String str52 = defaultedMap51.toString();
        java.lang.Object obj55 = defaultedMap51.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate59, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        java.util.Iterator iterator65 = filterIterator63.getIterator();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) filterIterator63);
        java.lang.String str67 = defaultedMap66.toString();
        java.lang.Object obj70 = defaultedMap66.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        filterIterator71.setPredicate(predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        filterIterator71.setPredicate(predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate74, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate59, predicate76);
        filterIterator39.setPredicate(predicate59);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate80);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(predicate80);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.lang.String str9 = defaultedMap8.toString();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator15);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) filterIterator15);
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) filterIterator15);
        java.lang.Object obj21 = defaultedMap3.remove((java.lang.Object) 1.0f);
        int i22 = defaultedMap3.size();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        boolean b21 = defaultedMap3.containsValue((java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        filterIterator25.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.lang.String str38 = defaultedMap36.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        java.lang.String str58 = defaultedMap57.toString();
        java.lang.Object obj61 = defaultedMap57.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate52, predicate65);
        filterIterator25.setPredicate(predicate52);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate23, predicate52);
        collections.Factory factory72 = null;
        try {
            java.util.Map map73 = collections.map.DefaultedMap.decorate(map71, factory72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        java.lang.Object obj14 = defaultedMap10.remove((java.lang.Object) 10L);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        int i6 = defaultedMap3.size();
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap15.containsKey(obj17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        java.lang.Object obj23 = defaultedMap15.remove((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        filterIterator24.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        filterIterator24.setIterator((java.util.Iterator) filterIterator32);
        filterIterator19.setIterator((java.util.Iterator) filterIterator32);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) filterIterator19);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        java.util.Set set15 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) set21, (java.lang.Object) defaultedMap25);
        java.util.Set set28 = defaultedMap3.entrySet();
        boolean b29 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) filterIterator6);
        java.lang.String str10 = defaultedMap9.toString();
        java.lang.Object obj13 = defaultedMap9.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate17);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate17, predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        java.util.Iterator iterator23 = filterIterator21.getIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        java.lang.String str25 = defaultedMap24.toString();
        java.lang.Object obj28 = defaultedMap24.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate32, predicate34);
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate19, predicate32);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) predicate32);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.util.Set set28 = defaultedMap16.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.lang.String str34 = defaultedMap32.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap32);
        java.util.Set set37 = defaultedMap10.keySet();
        boolean b39 = defaultedMap10.containsValue((java.lang.Object) 10L);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        java.util.Set set7 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        filterIterator8.setIterator((java.util.Iterator) filterIterator13);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        filterIterator8.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate19 = null;
        filterIterator8.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) predicate22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.util.Set set28 = defaultedMap27.entrySet();
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap27.containsKey(obj29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.util.Iterator iterator33 = filterIterator31.getIterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) filterIterator31);
        defaultedMap23.putAll((java.util.Map) defaultedMap27);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = filterIterator37.getPredicate();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) filterIterator37);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        java.util.Iterator iterator46 = filterIterator44.getIterator();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        java.util.Set set48 = defaultedMap47.entrySet();
        java.lang.Object obj49 = null;
        boolean b50 = defaultedMap47.containsKey(obj49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        java.util.Iterator iterator53 = filterIterator51.getIterator();
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) filterIterator51);
        java.lang.Object obj55 = defaultedMap47.remove((java.lang.Object) filterIterator51);
        defaultedMap43.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Object obj58 = defaultedMap43.get(obj57);
        java.lang.Object obj59 = defaultedMap23.put((java.lang.Object) filterIterator37, obj58);
        java.lang.Object obj60 = defaultedMap3.put((java.lang.Object) filterIterator8, (java.lang.Object) defaultedMap23);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNull(predicate38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.lang.String str9 = defaultedMap8.toString();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator15);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) filterIterator15);
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) filterIterator15);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        int i24 = defaultedMap23.size();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        java.util.Iterator iterator27 = filterIterator25.getIterator();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        java.lang.String str29 = defaultedMap28.toString();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) predicate34);
        int i36 = defaultedMap35.size();
        java.lang.Object obj37 = defaultedMap28.remove((java.lang.Object) defaultedMap35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        java.util.Iterator iterator40 = filterIterator38.getIterator();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) filterIterator38);
        java.lang.String str42 = defaultedMap41.toString();
        java.lang.Object obj45 = defaultedMap41.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate49, predicate51);
        java.util.Set set53 = defaultedMap41.keySet();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        java.util.Set set58 = defaultedMap57.entrySet();
        java.lang.String str59 = defaultedMap57.toString();
        java.util.Map map60 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap41, (java.lang.Object) defaultedMap57);
        java.util.Map map61 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) defaultedMap57);
        java.util.Set set62 = defaultedMap35.keySet();
        java.lang.Object obj63 = defaultedMap23.get((java.lang.Object) defaultedMap35);
        java.lang.Object obj64 = defaultedMap3.get(obj63);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNotNull(obj63);
        org.junit.Assert.assertNotNull(obj64);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        boolean b21 = defaultedMap3.containsValue((java.lang.Object) (short) 100);
        collections.Transformer transformer22 = null;
        try {
            java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.util.Set set14 = defaultedMap13.entrySet();
        java.lang.String str15 = defaultedMap13.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.lang.String str20 = defaultedMap19.toString();
        java.lang.Object obj23 = defaultedMap19.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap19, predicate27, predicate29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.util.Iterator iterator33 = filterIterator31.getIterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj38 = defaultedMap34.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate29, predicate42);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = filterIterator47.getPredicate();
        java.util.Iterator iterator49 = filterIterator47.getIterator();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) filterIterator47);
        java.lang.String str51 = defaultedMap50.toString();
        java.lang.Object obj54 = defaultedMap50.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        filterIterator55.setPredicate(predicate56);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator55.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate58, predicate60);
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) map61);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) map62);
        java.lang.Object obj64 = defaultedMap3.remove((java.lang.Object) defaultedMap63);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNull(predicate48);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "{}" + "'", str51.equals("{}"));
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = filterIterator1.getPredicate();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) filterIterator1);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.lang.String str9 = defaultedMap8.toString();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.String str14 = defaultedMap13.toString();
        java.lang.Object obj17 = defaultedMap13.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        filterIterator18.setPredicate(predicate21);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map24 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate21, predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        java.util.Iterator iterator27 = filterIterator25.getIterator();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        java.lang.String str29 = defaultedMap28.toString();
        java.lang.Object obj32 = defaultedMap28.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate36, predicate38);
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate21, predicate38);
        filterIterator1.setPredicate(predicate21);
        filterIterator0.setPredicate(predicate21);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        java.util.Iterator iterator45 = filterIterator43.getIterator();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) filterIterator43);
        java.lang.String str47 = defaultedMap46.toString();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = filterIterator48.getPredicate();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        java.lang.String str52 = defaultedMap51.toString();
        java.lang.Object obj55 = defaultedMap51.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator56.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate59, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        java.util.Iterator iterator65 = filterIterator63.getIterator();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) filterIterator63);
        java.lang.String str67 = defaultedMap66.toString();
        java.lang.Object obj70 = defaultedMap66.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator();
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        filterIterator71.setPredicate(predicate72);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        filterIterator71.setPredicate(predicate74);
        collections.Predicate predicate76 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate74, predicate76);
        java.util.Map map78 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate59, predicate76);
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate59);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertTrue("'" + str67 + "' != '" + "{}" + "'", str67.equals("{}"));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNotNull(map77);
        org.junit.Assert.assertNotNull(map78);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap20.containsKey(obj22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) filterIterator24);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = defaultedMap16.get(obj30);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        collections.Predicate predicate40 = filterIterator38.getPredicate();
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap36.keySet();
        boolean b43 = defaultedMap3.containsKey((java.lang.Object) set42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        java.util.Iterator iterator46 = filterIterator44.getIterator();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        java.util.Set set48 = defaultedMap47.entrySet();
        java.util.Set set49 = defaultedMap47.entrySet();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = filterIterator50.getPredicate();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) predicate51);
        defaultedMap47.putAll((java.util.Map) defaultedMap52);
        java.lang.Object obj55 = defaultedMap52.get((java.lang.Object) 0);
        java.util.Set set56 = defaultedMap52.keySet();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        java.util.Iterator iterator59 = filterIterator57.getIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = filterIterator61.getPredicate();
        java.util.Iterator iterator63 = filterIterator61.getIterator();
        java.util.Iterator iterator64 = filterIterator61.getIterator();
        filterIterator57.setIterator((java.util.Iterator) filterIterator61);
        java.util.Iterator iterator66 = filterIterator61.getIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        boolean b68 = defaultedMap52.containsKey((java.lang.Object) filterIterator67);
        defaultedMap52.clear();
        java.lang.Object obj70 = defaultedMap3.get((java.lang.Object) defaultedMap52);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNotNull(set49);
        org.junit.Assert.assertNull(predicate51);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNull(predicate58);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate62);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(iterator64);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(obj70);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        java.util.Set set15 = defaultedMap3.keySet();
        java.util.Set set16 = defaultedMap3.entrySet();
        java.lang.String str17 = defaultedMap3.toString();
        java.util.Set set18 = defaultedMap3.entrySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{false=100}" + "'", str17.equals("{false=100}"));
        org.junit.Assert.assertNotNull(set18);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.util.Set set28 = defaultedMap16.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.lang.String str34 = defaultedMap32.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap32);
        java.util.Set set37 = defaultedMap10.keySet();
        boolean b38 = defaultedMap10.isEmpty();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate7);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator6.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        filterIterator6.setIterator((java.util.Iterator) filterIterator11);
        filterIterator5.setIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate15);
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) filterIterator18);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        java.lang.String str26 = defaultedMap25.toString();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = filterIterator27.getPredicate();
        java.util.Iterator iterator29 = filterIterator27.getIterator();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        java.lang.String str31 = defaultedMap30.toString();
        java.lang.Object obj34 = defaultedMap30.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate38, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = filterIterator42.getPredicate();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        java.lang.String str46 = defaultedMap45.toString();
        java.lang.Object obj49 = defaultedMap45.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        filterIterator50.setPredicate(predicate51);
        collections.Predicate predicate53 = collections.PredicateUtils.uniquePredicate();
        filterIterator50.setPredicate(predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate53, predicate55);
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate38, predicate55);
        filterIterator18.setPredicate(predicate38);
        filterIterator0.setIterator((java.util.Iterator) filterIterator18);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "{}" + "'", str26.equals("{}"));
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "{}" + "'", str46.equals("{}"));
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(map57);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.util.Collection collection2 = defaultedMap1.values();
        org.junit.Assert.assertNotNull(collection2);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        java.lang.Object obj16 = new java.lang.Object();
        java.lang.Object obj17 = defaultedMap2.get(obj16);
        defaultedMap2.clear();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        int i18 = defaultedMap17.size();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        java.util.Iterator iterator21 = filterIterator19.getIterator();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) filterIterator19);
        int i23 = defaultedMap22.size();
        defaultedMap17.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap22);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        java.lang.String str30 = defaultedMap29.toString();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.util.Iterator iterator33 = filterIterator31.getIterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        java.lang.String str35 = defaultedMap34.toString();
        java.lang.Object obj38 = defaultedMap34.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate42, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = filterIterator46.getPredicate();
        java.util.Iterator iterator48 = filterIterator46.getIterator();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        java.lang.String str50 = defaultedMap49.toString();
        java.lang.Object obj53 = defaultedMap49.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate57, predicate59);
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate42, predicate59);
        boolean b62 = defaultedMap22.containsValue((java.lang.Object) predicate59);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        java.util.Iterator iterator65 = filterIterator63.getIterator();
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) filterIterator63);
        java.util.Set set67 = defaultedMap66.entrySet();
        java.util.Set set68 = defaultedMap66.entrySet();
        java.lang.Object obj69 = defaultedMap3.put((java.lang.Object) b62, (java.lang.Object) defaultedMap66);
        java.util.Collection collection70 = defaultedMap66.values();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertTrue(i23 == 0);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "{}" + "'", str35.equals("{}"));
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNotNull(set67);
        org.junit.Assert.assertNotNull(set68);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(collection70);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        java.util.Set set15 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) set21, (java.lang.Object) defaultedMap25);
        java.lang.String str28 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = filterIterator32.getPredicate();
        java.util.Iterator iterator34 = filterIterator32.getIterator();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) filterIterator32);
        java.util.Set set36 = defaultedMap35.entrySet();
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap35.containsKey(obj37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.Object obj43 = defaultedMap35.remove((java.lang.Object) filterIterator39);
        defaultedMap31.putAll((java.util.Map) defaultedMap35);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = filterIterator45.getPredicate();
        java.util.Iterator iterator47 = filterIterator45.getIterator();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) filterIterator45);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = filterIterator52.getPredicate();
        java.util.Iterator iterator54 = filterIterator52.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        java.util.Set set56 = defaultedMap55.entrySet();
        java.lang.Object obj57 = null;
        boolean b58 = defaultedMap55.containsKey(obj57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = filterIterator59.getPredicate();
        java.util.Iterator iterator61 = filterIterator59.getIterator();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) filterIterator59);
        java.lang.Object obj63 = defaultedMap55.remove((java.lang.Object) filterIterator59);
        defaultedMap51.putAll((java.util.Map) defaultedMap55);
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Object obj66 = defaultedMap51.get(obj65);
        java.lang.Object obj67 = defaultedMap31.put((java.lang.Object) filterIterator45, obj66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = filterIterator68.getPredicate();
        java.util.Iterator iterator70 = filterIterator68.getIterator();
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) filterIterator68);
        java.lang.String str72 = defaultedMap71.toString();
        java.lang.Object obj75 = defaultedMap71.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        filterIterator76.setPredicate(predicate77);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        filterIterator76.setPredicate(predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate79, predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        filterIterator83.setPredicate(predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        filterIterator83.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate81, predicate86);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        filterIterator89.setPredicate(predicate90);
        collections.Predicate predicate92 = collections.PredicateUtils.uniquePredicate();
        filterIterator89.setPredicate(predicate92);
        java.lang.Object obj94 = defaultedMap3.put((java.lang.Object) predicate81, (java.lang.Object) predicate92);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{[]={}, false=100}" + "'", str28.equals("{[]={}, false=100}"));
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNotNull(set36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(obj63);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNull(predicate69);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "{}" + "'", str72.equals("{}"));
        org.junit.Assert.assertNull(obj75);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(predicate92);
        org.junit.Assert.assertNull(obj94);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        java.util.Set set15 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.lang.String str21 = defaultedMap19.toString();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) defaultedMap19);
        java.util.Set set23 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        filterIterator25.setIterator((java.util.Iterator) filterIterator30);
        filterIterator24.setIterator((java.util.Iterator) filterIterator25);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator34.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        filterIterator39.setIterator((java.util.Iterator) filterIterator44);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = filterIterator47.getPredicate();
        filterIterator39.setIterator((java.util.Iterator) filterIterator47);
        filterIterator34.setIterator((java.util.Iterator) filterIterator47);
        filterIterator24.setIterator((java.util.Iterator) filterIterator34);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = filterIterator52.getPredicate();
        java.util.Iterator iterator54 = filterIterator52.getIterator();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) filterIterator52);
        filterIterator24.setIterator((java.util.Iterator) filterIterator52);
        java.lang.Object obj57 = defaultedMap3.remove((java.lang.Object) filterIterator24);
        collections.Predicate predicate58 = filterIterator24.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(predicate48);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNull(predicate58);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        boolean b21 = defaultedMap3.containsValue((java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        filterIterator25.setIterator((java.util.Iterator) filterIterator30);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.lang.String str38 = defaultedMap36.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        java.lang.String str58 = defaultedMap57.toString();
        java.lang.Object obj61 = defaultedMap57.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate52, predicate65);
        filterIterator25.setPredicate(predicate52);
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate23, predicate52);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = filterIterator72.getPredicate();
        java.util.Iterator iterator74 = filterIterator72.getIterator();
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) filterIterator72);
        java.lang.String str76 = defaultedMap75.toString();
        java.lang.Object obj79 = defaultedMap75.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        filterIterator80.setPredicate(predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        filterIterator80.setPredicate(predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate83, predicate85);
        java.util.Set set87 = defaultedMap75.keySet();
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        collections.Predicate predicate89 = filterIterator88.getPredicate();
        java.util.Iterator iterator90 = filterIterator88.getIterator();
        collections.map.DefaultedMap defaultedMap91 = new collections.map.DefaultedMap((java.lang.Object) filterIterator88);
        java.util.Set set92 = defaultedMap91.entrySet();
        java.lang.String str93 = defaultedMap91.toString();
        java.util.Map map94 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap75, (java.lang.Object) defaultedMap91);
        defaultedMap3.putAll(map94);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(predicate73);
        org.junit.Assert.assertNull(iterator74);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(set87);
        org.junit.Assert.assertNull(predicate89);
        org.junit.Assert.assertNull(iterator90);
        org.junit.Assert.assertNotNull(set92);
        org.junit.Assert.assertTrue("'" + str93 + "' != '" + "{}" + "'", str93.equals("{}"));
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator20);
        filterIterator7.setIterator((java.util.Iterator) filterIterator20);
        collections.Predicate predicate24 = filterIterator20.getPredicate();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) predicate24);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap20.containsKey(obj22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) filterIterator24);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = defaultedMap16.get(obj30);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        collections.Predicate predicate40 = filterIterator38.getPredicate();
        boolean b41 = defaultedMap36.containsValue((java.lang.Object) predicate40);
        java.util.Set set42 = defaultedMap36.keySet();
        boolean b43 = defaultedMap3.containsKey((java.lang.Object) set42);
        collections.Transformer transformer44 = null;
        try {
            java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        java.util.Iterator iterator25 = filterIterator23.getIterator();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap26.containsKey(obj28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) filterIterator30);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object obj37 = defaultedMap22.get(obj36);
        java.lang.Object obj38 = defaultedMap2.put((java.lang.Object) filterIterator16, obj37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate52, predicate57);
        java.util.Set set60 = defaultedMap2.keySet();
        int i61 = defaultedMap2.size();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(i61 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        java.util.Iterator iterator10 = filterIterator8.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) filterIterator8);
        java.util.Set set12 = defaultedMap11.entrySet();
        java.lang.String str13 = defaultedMap11.toString();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.String str18 = defaultedMap17.toString();
        java.lang.Object obj21 = defaultedMap17.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.lang.String str33 = defaultedMap32.toString();
        java.lang.Object obj36 = defaultedMap32.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator37.setPredicate(predicate38);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator37.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate27, predicate40);
        filterIterator0.setPredicate(predicate27);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate47);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator46.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = filterIterator51.getPredicate();
        filterIterator46.setIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        java.util.Set set58 = defaultedMap57.entrySet();
        java.lang.String str59 = defaultedMap57.toString();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = filterIterator60.getPredicate();
        java.util.Iterator iterator62 = filterIterator60.getIterator();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) filterIterator60);
        java.lang.String str64 = defaultedMap63.toString();
        java.lang.Object obj67 = defaultedMap63.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        filterIterator68.setPredicate(predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap63, predicate71, predicate73);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = filterIterator75.getPredicate();
        java.util.Iterator iterator77 = filterIterator75.getIterator();
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) filterIterator75);
        java.lang.String str79 = defaultedMap78.toString();
        java.lang.Object obj82 = defaultedMap78.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        filterIterator83.setPredicate(predicate84);
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        filterIterator83.setPredicate(predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap78, predicate86, predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate73, predicate86);
        filterIterator46.setPredicate(predicate73);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate73);
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        filterIterator92.setPredicate(predicate93);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNull(iterator10);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(predicate52);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNull(predicate61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNull(predicate76);
        org.junit.Assert.assertNull(iterator77);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(predicate93);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.util.Set set16 = defaultedMap15.entrySet();
        java.util.Set set17 = defaultedMap15.entrySet();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = filterIterator18.getPredicate();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) predicate19);
        defaultedMap15.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj23 = defaultedMap20.get((java.lang.Object) 0);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.util.Set set28 = defaultedMap27.entrySet();
        java.lang.Object obj29 = null;
        boolean b30 = defaultedMap27.containsKey(obj29);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.util.Iterator iterator33 = filterIterator31.getIterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        java.lang.Object obj35 = defaultedMap27.remove((java.lang.Object) filterIterator31);
        java.lang.String str36 = defaultedMap27.toString();
        java.util.Set set37 = defaultedMap27.entrySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = filterIterator38.getPredicate();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        java.util.Iterator iterator43 = filterIterator41.getIterator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        java.util.Set set45 = defaultedMap44.entrySet();
        java.lang.Object obj46 = null;
        boolean b47 = defaultedMap44.containsKey(obj46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = filterIterator48.getPredicate();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) filterIterator48);
        java.lang.Object obj52 = defaultedMap44.remove((java.lang.Object) filterIterator48);
        defaultedMap40.putAll((java.util.Map) defaultedMap44);
        java.lang.Object obj54 = new java.lang.Object();
        java.lang.Object obj55 = defaultedMap40.get(obj54);
        java.lang.Object obj56 = defaultedMap27.get((java.lang.Object) defaultedMap40);
        defaultedMap20.putAll((java.util.Map) defaultedMap40);
        boolean b58 = defaultedMap8.containsValue((java.lang.Object) defaultedMap20);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(predicate19);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(predicate39);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(predicate49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(obj56);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator8.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate11, predicate13);
        java.util.Set set15 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        java.util.Set set20 = defaultedMap19.entrySet();
        java.util.Set set21 = defaultedMap19.entrySet();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        java.util.Iterator iterator24 = filterIterator22.getIterator();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) filterIterator22);
        java.util.Set set26 = defaultedMap25.entrySet();
        java.lang.Object obj27 = defaultedMap3.put((java.lang.Object) set21, (java.lang.Object) defaultedMap25);
        defaultedMap25.clear();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator33.setPredicate(predicate36);
        java.lang.Object obj38 = defaultedMap32.remove((java.lang.Object) filterIterator33);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        int i43 = defaultedMap42.size();
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = filterIterator44.getPredicate();
        java.util.Iterator iterator46 = filterIterator44.getIterator();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) filterIterator44);
        int i48 = defaultedMap47.size();
        defaultedMap42.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap47);
        java.util.Set set51 = defaultedMap47.entrySet();
        defaultedMap32.putAll((java.util.Map) defaultedMap47);
        java.util.Set set53 = defaultedMap47.keySet();
        defaultedMap47.clear();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap25, (java.lang.Object) defaultedMap47);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue(i43 == 0);
        org.junit.Assert.assertNull(predicate45);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertTrue(i48 == 0);
        org.junit.Assert.assertNotNull(set51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(map55);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.util.Set set9 = defaultedMap8.entrySet();
        java.lang.String str10 = defaultedMap8.toString();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        java.lang.String str15 = defaultedMap14.toString();
        java.lang.Object obj18 = defaultedMap14.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate20);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator19.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate22, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        java.lang.String str30 = defaultedMap29.toString();
        java.lang.Object obj33 = defaultedMap29.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        filterIterator34.setPredicate(predicate35);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator34.setPredicate(predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate37, predicate39);
        java.util.Map map41 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate24, predicate37);
        boolean b42 = defaultedMap3.containsValue((java.lang.Object) predicate37);
        boolean b44 = defaultedMap3.containsKey((java.lang.Object) '4');
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        collections.Predicate predicate46 = filterIterator45.getPredicate();
        java.util.Iterator iterator47 = filterIterator45.getIterator();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) filterIterator45);
        int i49 = defaultedMap48.size();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = filterIterator50.getPredicate();
        java.util.Iterator iterator52 = filterIterator50.getIterator();
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) filterIterator50);
        int i54 = defaultedMap53.size();
        defaultedMap48.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = filterIterator57.getPredicate();
        java.util.Iterator iterator59 = filterIterator57.getIterator();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) filterIterator57);
        java.lang.String str61 = defaultedMap60.toString();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = filterIterator62.getPredicate();
        java.util.Iterator iterator64 = filterIterator62.getIterator();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) filterIterator62);
        java.lang.String str66 = defaultedMap65.toString();
        java.lang.Object obj69 = defaultedMap65.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        filterIterator70.setPredicate(predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        filterIterator70.setPredicate(predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate73, predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = filterIterator77.getPredicate();
        java.util.Iterator iterator79 = filterIterator77.getIterator();
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) filterIterator77);
        java.lang.String str81 = defaultedMap80.toString();
        java.lang.Object obj84 = defaultedMap80.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator();
        collections.Predicate predicate86 = collections.PredicateUtils.uniquePredicate();
        filterIterator85.setPredicate(predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        filterIterator85.setPredicate(predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate88, predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate73, predicate90);
        boolean b93 = defaultedMap53.containsValue((java.lang.Object) predicate90);
        collections.Predicate predicate94 = collections.PredicateUtils.truePredicate();
        java.util.Map map95 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate90, predicate94);
        int i96 = defaultedMap3.size();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNull(predicate46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertTrue(i49 == 0);
        org.junit.Assert.assertNull(predicate51);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertTrue(i54 == 0);
        org.junit.Assert.assertNull(predicate58);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertTrue("'" + str61 + "' != '" + "{}" + "'", str61.equals("{}"));
        org.junit.Assert.assertNull(predicate63);
        org.junit.Assert.assertNull(iterator64);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(predicate78);
        org.junit.Assert.assertNull(iterator79);
        org.junit.Assert.assertTrue("'" + str81 + "' != '" + "{}" + "'", str81.equals("{}"));
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertTrue(b93 == false);
        org.junit.Assert.assertNotNull(predicate94);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertTrue(i96 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        int i9 = defaultedMap8.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        java.util.Set set15 = defaultedMap14.entrySet();
        java.lang.String str16 = defaultedMap14.toString();
        int i17 = defaultedMap14.size();
        boolean b18 = defaultedMap8.containsValue((java.lang.Object) i17);
        java.lang.String str19 = defaultedMap8.toString();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap20.containsKey(obj22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) filterIterator24);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = defaultedMap16.get(obj30);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.lang.String str37 = defaultedMap36.toString();
        java.lang.Object obj40 = defaultedMap36.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        filterIterator41.setPredicate(predicate42);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator41.setPredicate(predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate44, predicate46);
        java.util.Set set48 = defaultedMap36.keySet();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) filterIterator49);
        java.util.Set set53 = defaultedMap52.entrySet();
        java.lang.String str54 = defaultedMap52.toString();
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) defaultedMap52);
        java.util.Set set56 = defaultedMap36.entrySet();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.uniquePredicate();
        filterIterator58.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = filterIterator63.getPredicate();
        filterIterator58.setIterator((java.util.Iterator) filterIterator63);
        filterIterator57.setIterator((java.util.Iterator) filterIterator58);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate68);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        filterIterator67.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator();
        collections.Predicate predicate73 = collections.PredicateUtils.uniquePredicate();
        filterIterator72.setPredicate(predicate73);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        filterIterator72.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = filterIterator77.getPredicate();
        filterIterator72.setIterator((java.util.Iterator) filterIterator77);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        collections.Predicate predicate81 = filterIterator80.getPredicate();
        filterIterator72.setIterator((java.util.Iterator) filterIterator80);
        filterIterator67.setIterator((java.util.Iterator) filterIterator80);
        filterIterator57.setIterator((java.util.Iterator) filterIterator67);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator();
        collections.Predicate predicate86 = filterIterator85.getPredicate();
        java.util.Iterator iterator87 = filterIterator85.getIterator();
        collections.map.DefaultedMap defaultedMap88 = new collections.map.DefaultedMap((java.lang.Object) filterIterator85);
        filterIterator57.setIterator((java.util.Iterator) filterIterator85);
        java.lang.Object obj90 = defaultedMap36.remove((java.lang.Object) filterIterator57);
        defaultedMap16.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNull(predicate64);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertNull(predicate78);
        org.junit.Assert.assertNull(predicate81);
        org.junit.Assert.assertNull(predicate86);
        org.junit.Assert.assertNull(iterator87);
        org.junit.Assert.assertNull(obj90);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.util.Set set17 = defaultedMap16.entrySet();
        java.lang.Object obj18 = null;
        boolean b19 = defaultedMap16.containsKey(obj18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        java.lang.Object obj24 = defaultedMap16.remove((java.lang.Object) filterIterator20);
        defaultedMap12.putAll((java.util.Map) defaultedMap16);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.Predicate predicate27 = filterIterator26.getPredicate();
        java.util.Iterator iterator28 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap36.containsKey(obj38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = filterIterator40.getPredicate();
        java.util.Iterator iterator42 = filterIterator40.getIterator();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) filterIterator40);
        java.lang.Object obj44 = defaultedMap36.remove((java.lang.Object) filterIterator40);
        defaultedMap32.putAll((java.util.Map) defaultedMap36);
        java.lang.Object obj46 = new java.lang.Object();
        java.lang.Object obj47 = defaultedMap32.get(obj46);
        java.lang.Object obj48 = defaultedMap12.put((java.lang.Object) filterIterator26, obj47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = filterIterator49.getPredicate();
        java.util.Iterator iterator51 = filterIterator49.getIterator();
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) filterIterator49);
        java.lang.String str53 = defaultedMap52.toString();
        java.lang.Object obj56 = defaultedMap52.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate60);
        collections.Predicate predicate62 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map63 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate60, predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        filterIterator64.setPredicate(predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate62, predicate67);
        java.util.Set set70 = defaultedMap12.keySet();
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) set70);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(predicate41);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNull(predicate50);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(set70);
        org.junit.Assert.assertNotNull(map71);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        java.util.Iterator iterator5 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator3);
        java.util.Set set7 = defaultedMap6.entrySet();
        java.lang.Object obj8 = null;
        boolean b9 = defaultedMap6.containsKey(obj8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        java.lang.Object obj14 = defaultedMap6.remove((java.lang.Object) filterIterator10);
        defaultedMap2.putAll((java.util.Map) defaultedMap6);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        collections.Predicate predicate17 = filterIterator16.getPredicate();
        java.util.Iterator iterator18 = filterIterator16.getIterator();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        java.util.Iterator iterator25 = filterIterator23.getIterator();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) filterIterator23);
        java.util.Set set27 = defaultedMap26.entrySet();
        java.lang.Object obj28 = null;
        boolean b29 = defaultedMap26.containsKey(obj28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = filterIterator30.getPredicate();
        java.util.Iterator iterator32 = filterIterator30.getIterator();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) filterIterator30);
        java.lang.Object obj34 = defaultedMap26.remove((java.lang.Object) filterIterator30);
        defaultedMap22.putAll((java.util.Map) defaultedMap26);
        java.lang.Object obj36 = new java.lang.Object();
        java.lang.Object obj37 = defaultedMap22.get(obj36);
        java.lang.Object obj38 = defaultedMap2.put((java.lang.Object) filterIterator16, obj37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        filterIterator54.setPredicate(predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap2, predicate52, predicate57);
        collections.Factory factory60 = null;
        try {
            java.util.Map map61 = collections.map.DefaultedMap.decorate(map59, factory60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        filterIterator1.setIterator((java.util.Iterator) filterIterator6);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate16);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        filterIterator15.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = filterIterator23.getPredicate();
        filterIterator15.setIterator((java.util.Iterator) filterIterator23);
        filterIterator10.setIterator((java.util.Iterator) filterIterator23);
        filterIterator0.setIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = filterIterator28.getPredicate();
        java.util.Iterator iterator30 = filterIterator28.getIterator();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        filterIterator0.setIterator((java.util.Iterator) filterIterator28);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate24);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertNull(iterator30);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        int i9 = defaultedMap8.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        java.util.Iterator iterator13 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.lang.Object obj16 = defaultedMap3.remove((java.lang.Object) predicate15);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        java.util.Set set7 = defaultedMap3.keySet();
        java.lang.Object obj8 = null;
        java.lang.Object obj9 = defaultedMap3.remove(obj8);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.Predicate predicate3 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) 0);
        java.util.Set set12 = defaultedMap8.keySet();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) set12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap13.remove(obj14);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        int i4 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        int i9 = defaultedMap8.size();
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap8);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = filterIterator12.getPredicate();
        java.util.Iterator iterator14 = filterIterator12.getIterator();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) filterIterator12);
        java.lang.String str16 = defaultedMap15.toString();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        filterIterator17.setPredicate(predicate18);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        filterIterator17.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        filterIterator17.setIterator((java.util.Iterator) filterIterator22);
        java.lang.Object obj25 = defaultedMap15.get((java.lang.Object) filterIterator22);
        java.lang.Object obj26 = defaultedMap8.remove(obj25);
        java.util.Collection collection27 = defaultedMap8.values();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = null;
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate29, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.lang.String str38 = defaultedMap36.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) filterIterator39);
        java.lang.String str43 = defaultedMap42.toString();
        java.lang.Object obj46 = defaultedMap42.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = filterIterator54.getPredicate();
        java.util.Iterator iterator56 = filterIterator54.getIterator();
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) filterIterator54);
        java.lang.String str58 = defaultedMap57.toString();
        java.lang.Object obj61 = defaultedMap57.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap57, predicate65, predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate52, predicate65);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator();
        collections.Predicate predicate71 = filterIterator70.getPredicate();
        java.util.Iterator iterator72 = filterIterator70.getIterator();
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) filterIterator70);
        java.lang.String str74 = defaultedMap73.toString();
        java.lang.Object obj77 = defaultedMap73.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.uniquePredicate();
        filterIterator78.setPredicate(predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate81, predicate83);
        java.util.Map map85 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) map84);
        java.util.Set set86 = defaultedMap36.entrySet();
        defaultedMap8.putAll((java.util.Map) defaultedMap36);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(predicate13);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(collection27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + "{}" + "'", str43.equals("{}"));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNull(predicate55);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(predicate71);
        org.junit.Assert.assertNull(iterator72);
        org.junit.Assert.assertTrue("'" + str74 + "' != '" + "{}" + "'", str74.equals("{}"));
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(set86);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        int i6 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap10.containsKey(obj12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) filterIterator14);
        java.lang.String str19 = defaultedMap10.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        boolean b28 = defaultedMap10.containsValue((java.lang.Object) (short) 100);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b28);
        java.util.Set set30 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.util.Iterator iterator33 = filterIterator31.getIterator();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate36);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        filterIterator35.setPredicate(predicate38);
        java.lang.Object obj40 = defaultedMap34.remove((java.lang.Object) filterIterator35);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = filterIterator41.getPredicate();
        java.util.Iterator iterator43 = filterIterator41.getIterator();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) filterIterator41);
        int i45 = defaultedMap44.size();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = filterIterator46.getPredicate();
        java.util.Iterator iterator48 = filterIterator46.getIterator();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) filterIterator46);
        int i50 = defaultedMap49.size();
        defaultedMap44.putAll((java.util.Map) defaultedMap49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap49);
        java.util.Set set53 = defaultedMap49.entrySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap49);
        java.util.Set set55 = defaultedMap49.keySet();
        boolean b57 = defaultedMap49.containsValue((java.lang.Object) (byte) 10);
        defaultedMap3.putAll((java.util.Map) defaultedMap49);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertNull(predicate47);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertTrue(i50 == 0);
        org.junit.Assert.assertNotNull(set53);
        org.junit.Assert.assertNotNull(set55);
        org.junit.Assert.assertTrue(b57 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        filterIterator1.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        filterIterator1.setIterator((java.util.Iterator) filterIterator6);
        filterIterator0.setIterator((java.util.Iterator) filterIterator1);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set11 = defaultedMap10.entrySet();
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.String str5 = defaultedMap3.toString();
        int i6 = defaultedMap3.size();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.util.Set set11 = defaultedMap10.entrySet();
        java.lang.Object obj12 = null;
        boolean b13 = defaultedMap10.containsKey(obj12);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        java.util.Iterator iterator16 = filterIterator14.getIterator();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) filterIterator14);
        java.lang.Object obj18 = defaultedMap10.remove((java.lang.Object) filterIterator14);
        java.lang.String str19 = defaultedMap10.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        java.util.Iterator iterator22 = filterIterator20.getIterator();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) filterIterator20);
        java.lang.String str24 = defaultedMap23.toString();
        java.lang.Object obj27 = defaultedMap23.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        boolean b28 = defaultedMap10.containsValue((java.lang.Object) (short) 100);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) b28);
        java.util.Set set30 = defaultedMap3.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = filterIterator31.getPredicate();
        java.util.Iterator iterator33 = filterIterator31.getIterator();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate34);
        java.lang.Object obj36 = defaultedMap3.get((java.lang.Object) predicate34);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(predicate32);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(obj36);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        int i3 = defaultedMap2.size();
        java.util.Collection collection4 = defaultedMap2.values();
        java.util.Set set5 = defaultedMap2.entrySet();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        java.lang.Object obj7 = defaultedMap3.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = filterIterator8.getPredicate();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) predicate9);
        int i11 = defaultedMap10.size();
        java.lang.Object obj12 = defaultedMap3.remove((java.lang.Object) defaultedMap10);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = filterIterator13.getPredicate();
        java.util.Iterator iterator15 = filterIterator13.getIterator();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        java.lang.String str17 = defaultedMap16.toString();
        java.lang.Object obj20 = defaultedMap16.put((java.lang.Object) false, (java.lang.Object) (short) 100);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        filterIterator21.setPredicate(predicate24);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate24, predicate26);
        java.util.Set set28 = defaultedMap16.keySet();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        java.util.Set set33 = defaultedMap32.entrySet();
        java.lang.String str34 = defaultedMap32.toString();
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) defaultedMap32);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) defaultedMap32);
        defaultedMap32.clear();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(predicate14);
        org.junit.Assert.assertNull(iterator15);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map36);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate13);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator12.setPredicate(predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator17);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = filterIterator20.getPredicate();
        filterIterator12.setIterator((java.util.Iterator) filterIterator20);
        filterIterator7.setIterator((java.util.Iterator) filterIterator20);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = filterIterator25.getPredicate();
        java.util.Iterator iterator27 = filterIterator25.getIterator();
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator25);
        java.lang.String str29 = defaultedMap28.toString();
        java.util.Collection collection30 = defaultedMap28.values();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate32);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        filterIterator31.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = filterIterator36.getPredicate();
        filterIterator31.setIterator((java.util.Iterator) filterIterator36);
        boolean b39 = defaultedMap28.containsValue((java.lang.Object) filterIterator36);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        filterIterator24.setIterator((java.util.Iterator) filterIterator40);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(predicate21);
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(predicate37);
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = filterIterator4.getPredicate();
        java.util.Iterator iterator6 = filterIterator4.getIterator();
        java.util.Iterator iterator7 = filterIterator4.getIterator();
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        java.util.Iterator iterator9 = filterIterator4.getIterator();
        java.util.Iterator iterator10 = filterIterator4.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(iterator10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str4 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = filterIterator5.getPredicate();
        java.util.Iterator iterator7 = filterIterator5.getIterator();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) filterIterator5);
        java.lang.String str9 = defaultedMap8.toString();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate11);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        filterIterator10.setPredicate(predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        filterIterator10.setIterator((java.util.Iterator) filterIterator15);
        java.lang.Object obj18 = defaultedMap8.get((java.lang.Object) filterIterator15);
        java.lang.Object obj19 = defaultedMap3.remove((java.lang.Object) filterIterator15);
        boolean b20 = defaultedMap3.isEmpty();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        collections.Predicate predicate22 = filterIterator21.getPredicate();
        java.util.Iterator iterator23 = filterIterator21.getIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) filterIterator21);
        java.util.Set set25 = defaultedMap24.keySet();
        boolean b26 = defaultedMap3.containsKey((java.lang.Object) defaultedMap24);
        java.lang.String str27 = defaultedMap3.toString();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertNull(predicate6);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.util.Set set5 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate7);
        defaultedMap3.putAll((java.util.Map) defaultedMap8);
        java.lang.Object obj11 = defaultedMap8.get((java.lang.Object) 0);
        java.util.Set set12 = defaultedMap8.keySet();
        java.util.Set set13 = defaultedMap8.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        filterIterator14.setPredicate(predicate17);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = filterIterator19.getPredicate();
        filterIterator14.setIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = filterIterator22.getPredicate();
        filterIterator14.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate25 = null;
        filterIterator14.setPredicate(predicate25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap8.put((java.lang.Object) filterIterator14, obj27);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNull(predicate7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNull(predicate23);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate5);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        filterIterator4.setPredicate(predicate7);
        java.lang.Object obj9 = defaultedMap3.remove((java.lang.Object) filterIterator4);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = filterIterator10.getPredicate();
        java.util.Iterator iterator12 = filterIterator10.getIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) filterIterator10);
        int i14 = defaultedMap13.size();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = filterIterator15.getPredicate();
        java.util.Iterator iterator17 = filterIterator15.getIterator();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) filterIterator15);
        int i19 = defaultedMap18.size();
        defaultedMap13.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap18);
        java.util.Set set22 = defaultedMap18.entrySet();
        defaultedMap3.putAll((java.util.Map) defaultedMap18);
        java.util.Set set24 = defaultedMap18.keySet();
        boolean b26 = defaultedMap18.containsValue((java.lang.Object) (byte) 10);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) b26);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(predicate11);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set4 = defaultedMap3.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap3.containsKey(obj5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) filterIterator7);
        java.lang.Object obj11 = defaultedMap3.remove((java.lang.Object) filterIterator7);
        java.lang.String str12 = defaultedMap3.toString();
        java.util.Set set13 = defaultedMap3.entrySet();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.Predicate predicate15 = filterIterator14.getPredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) predicate15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = filterIterator17.getPredicate();
        java.util.Iterator iterator19 = filterIterator17.getIterator();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) filterIterator17);
        java.util.Set set21 = defaultedMap20.entrySet();
        java.lang.Object obj22 = null;
        boolean b23 = defaultedMap20.containsKey(obj22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = filterIterator24.getPredicate();
        java.util.Iterator iterator26 = filterIterator24.getIterator();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator24);
        java.lang.Object obj28 = defaultedMap20.remove((java.lang.Object) filterIterator24);
        defaultedMap16.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj30 = new java.lang.Object();
        java.lang.Object obj31 = defaultedMap16.get(obj30);
        java.lang.Object obj32 = defaultedMap3.get((java.lang.Object) defaultedMap16);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = filterIterator33.getPredicate();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) filterIterator33);
        java.util.Set set37 = defaultedMap36.entrySet();
        java.lang.Object obj38 = null;
        boolean b39 = defaultedMap36.containsKey(obj38);
        java.util.Set set40 = defaultedMap36.keySet();
        java.lang.Object obj41 = defaultedMap3.remove((java.lang.Object) defaultedMap36);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(predicate8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNull(iterator26);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertNull(obj41);
    }
}

