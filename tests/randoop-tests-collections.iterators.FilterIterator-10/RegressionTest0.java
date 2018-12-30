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
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.Factory factory9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate(map8, factory9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        try {
            java.lang.Object obj4 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate4);
        try {
            filterIterator3.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) (short) -1);
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) filterIterator6);
        try {
            boolean b13 = filterIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        boolean b8 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(collection5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate(map6, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        try {
            boolean b6 = filterIterator4.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate4);
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) iterator6);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        boolean b16 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        int i11 = defaultedMap8.size();
        java.lang.Object obj12 = defaultedMap1.remove((java.lang.Object) i11);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        int i20 = defaultedMap14.size();
        defaultedMap14.clear();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator29);
        filterIterator6.setIterator((java.util.Iterator) filterIterator29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator35.setPredicate(predicate36);
        filterIterator6.setPredicate(predicate36);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNotNull(predicate36);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap2.putAll((java.util.Map) defaultedMap4);
        java.lang.String str6 = defaultedMap2.toString();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.lang.Object obj8 = defaultedMap2.get((java.lang.Object) filterIterator7);
        java.util.Iterator iterator9 = null;
        collections.Predicate predicate10 = null;
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator(iterator9, predicate10);
        filterIterator7.setIterator(iterator9);
        collections.Predicate predicate13 = filterIterator7.getPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator0.setIterator((java.util.Iterator) filterIterator14);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 0 + "'", obj8.equals(0));
        org.junit.Assert.assertNull(predicate13);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        try {
            boolean b8 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.Factory factory8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate12);
        collections.Transformer transformer14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate(map13, transformer14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) filterIterator9);
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate12);
        collections.Factory factory14 = null;
        try {
            java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        int i20 = defaultedMap14.size();
        defaultedMap14.clear();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator29);
        filterIterator6.setIterator((java.util.Iterator) filterIterator29);
        try {
            boolean b32 = filterIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) map12, (java.lang.Object) "hi!");
        java.lang.String str15 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{{}=hi!}" + "'", str15.equals("{{}=hi!}"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = null;
        filterIterator13.setPredicate(predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        filterIterator12.setIterator((java.util.Iterator) filterIterator16);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate18);
        filterIterator11.setPredicate(predicate18);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNotNull(predicate18);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator14 = filterIterator6.getIterator();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(iterator14);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.lang.Object obj21 = defaultedMap12.get((java.lang.Object) filterIterator20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        filterIterator10.setIterator((java.util.Iterator) filterIterator20);
        try {
            boolean b24 = filterIterator20.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) "");
        java.lang.Object obj13 = defaultedMap1.get((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = null;
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap11.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) filterIterator16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        filterIterator16.setIterator(iterator18);
        collections.Predicate predicate22 = filterIterator16.getPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator3.setIterator((java.util.Iterator) filterIterator23);
        try {
            java.lang.Object obj25 = filterIterator3.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNull(predicate22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        try {
            java.lang.Object obj8 = filterIterator0.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) map20);
        boolean b22 = defaultedMap7.isEmpty();
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap7.containsKey(obj23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap28.toString();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) filterIterator33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) (-1L));
        int i39 = defaultedMap36.size();
        defaultedMap36.clear();
        boolean b41 = defaultedMap28.equals((java.lang.Object) defaultedMap36);
        java.lang.Object obj42 = defaultedMap7.put((java.lang.Object) 100, (java.lang.Object) b41);
        defaultedMap7.clear();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate24);
        filterIterator6.setPredicate(predicate22);
        try {
            filterIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        try {
            filterIterator6.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        boolean b7 = defaultedMap1.isEmpty();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.Predicate predicate13 = filterIterator6.getPredicate();
        try {
            boolean b14 = filterIterator6.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(predicate13);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        int i15 = defaultedMap9.size();
        defaultedMap9.clear();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        filterIterator17.setIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate23 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate23);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) filterIterator24);
        boolean b26 = defaultedMap1.containsValue((java.lang.Object) map25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        int i31 = defaultedMap28.size();
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.String str45 = defaultedMap41.toString();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = null;
        filterIterator46.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map39, predicate50, predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.lang.String str73 = defaultedMap69.toString();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.Predicate predicate75 = null;
        filterIterator74.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate78, predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.Predicate predicate83 = null;
        filterIterator82.setPredicate(predicate83);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        filterIterator85.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map67, predicate78, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate58, predicate86);
        java.util.Map map90 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) map89);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        boolean b25 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b26 = defaultedMap1.isEmpty();
        collections.PredicateUtils predicateUtils27 = new collections.PredicateUtils();
        boolean b28 = defaultedMap1.containsValue((java.lang.Object) predicateUtils27);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        filterIterator3.setPredicate(predicate4);
        java.util.Iterator iterator6 = filterIterator3.getIterator();
        try {
            boolean b7 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(iterator6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.util.Iterator iterator0 = null;
        collections.Predicate predicate1 = null;
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator(iterator0, predicate1);
        collections.Predicate predicate3 = null;
        filterIterator2.setPredicate(predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        int i9 = defaultedMap6.size();
        defaultedMap6.clear();
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) true);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.lang.String str19 = defaultedMap15.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.lang.Object obj21 = defaultedMap15.get((java.lang.Object) filterIterator20);
        java.util.Iterator iterator22 = null;
        collections.Predicate predicate23 = null;
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator(iterator22, predicate23);
        filterIterator20.setIterator(iterator22);
        collections.Predicate predicate26 = filterIterator20.getPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) filterIterator27);
        collections.Predicate predicate29 = filterIterator27.getPredicate();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b33 = defaultedMap31.containsKey((java.lang.Object) (-1L));
        int i34 = defaultedMap31.size();
        defaultedMap31.clear();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate40, predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.String str48 = defaultedMap44.toString();
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = null;
        filterIterator49.setPredicate(predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49);
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        filterIterator52.setPredicate(predicate53);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap44, predicate53, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        java.util.Map map63 = collections.map.PredicatedMap.decorate(map42, predicate53, predicate61);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        java.util.Map map70 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate68, predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap72.putAll((java.util.Map) defaultedMap74);
        java.lang.String str76 = defaultedMap72.toString();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = null;
        filterIterator77.setPredicate(predicate78);
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        filterIterator80.setPredicate(predicate81);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        java.util.Map map84 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap72, predicate81, predicate83);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator();
        collections.Predicate predicate86 = null;
        filterIterator85.setPredicate(predicate86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator85);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        filterIterator88.setPredicate(predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate(map70, predicate81, predicate89);
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate61, predicate89);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate61);
        java.util.Map map94 = collections.map.PredicatedMap.decorate(map12, predicate13, predicate61);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2, predicate61);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNull(predicate26);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertTrue(i34 == 0);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "{}" + "'", str48.equals("{}"));
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "{}" + "'", str76.equals("{}"));
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(map84);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map94);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) (-1L));
        int i11 = defaultedMap8.size();
        defaultedMap8.clear();
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap17.putAll((java.util.Map) defaultedMap19);
        java.lang.String str21 = defaultedMap17.toString();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.lang.Object obj23 = defaultedMap17.get((java.lang.Object) filterIterator22);
        java.util.Iterator iterator24 = null;
        collections.Predicate predicate25 = null;
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        filterIterator22.setIterator(iterator24);
        collections.Predicate predicate28 = filterIterator22.getPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) filterIterator29);
        collections.Predicate predicate31 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        int i36 = defaultedMap33.size();
        defaultedMap33.clear();
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b41 = defaultedMap39.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate42, predicate43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap46.putAll((java.util.Map) defaultedMap48);
        java.lang.String str50 = defaultedMap46.toString();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = null;
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        filterIterator54.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate55, predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = null;
        filterIterator59.setPredicate(predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        filterIterator62.setPredicate(predicate63);
        java.util.Map map65 = collections.map.PredicatedMap.decorate(map44, predicate55, predicate63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b69 = defaultedMap67.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap67, predicate70, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap74.putAll((java.util.Map) defaultedMap76);
        java.lang.String str78 = defaultedMap74.toString();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator();
        collections.Predicate predicate80 = null;
        filterIterator79.setPredicate(predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator79);
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        filterIterator82.setPredicate(predicate83);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate83, predicate85);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        collections.Predicate predicate88 = null;
        filterIterator87.setPredicate(predicate88);
        collections.iterators.FilterIterator filterIterator90 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator87);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        filterIterator90.setPredicate(predicate91);
        java.util.Map map93 = collections.map.PredicatedMap.decorate(map72, predicate83, predicate91);
        java.util.Map map94 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate63, predicate91);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate63);
        java.util.Map map96 = collections.map.PredicatedMap.decorate(map14, predicate15, predicate63);
        boolean b97 = defaultedMap1.containsValue((java.lang.Object) predicate63);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertNull(predicate28);
        org.junit.Assert.assertNull(predicate31);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue(i36 == 0);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map94);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertTrue(b97 == false);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap10.remove((java.lang.Object) predicate21);
        java.lang.String str24 = defaultedMap10.toString();
        java.lang.Object obj25 = null;
        java.lang.Object obj26 = defaultedMap10.get(obj25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.Predicate predicate7 = null;
        filterIterator6.setPredicate(predicate7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        filterIterator9.setPredicate(predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        java.util.Map map13 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        int i18 = defaultedMap15.size();
        defaultedMap15.clear();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate24, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap28.toString();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        collections.Predicate predicate34 = null;
        filterIterator33.setPredicate(predicate34);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        filterIterator36.setPredicate(predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate37, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        filterIterator44.setPredicate(predicate45);
        java.util.Map map47 = collections.map.PredicatedMap.decorate(map26, predicate37, predicate45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b51 = defaultedMap49.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate53 = collections.PredicateUtils.truePredicate();
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap49, predicate52, predicate53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        java.lang.String str60 = defaultedMap56.toString();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate65, predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        filterIterator72.setPredicate(predicate73);
        java.util.Map map75 = collections.map.PredicatedMap.decorate(map54, predicate65, predicate73);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate45, predicate73);
        java.lang.Object obj77 = defaultedMap1.remove((java.lang.Object) predicate73);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map75);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNull(obj77);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.Predicate predicate12 = filterIterator11.getPredicate();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertNull(predicate12);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = null;
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        try {
            boolean b10 = filterIterator3.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap33.toString();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) filterIterator38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator38.setIterator(iterator40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate56);
        filterIterator38.setPredicate(predicate54);
        collections.Predicate predicate59 = filterIterator38.getPredicate();
        boolean b60 = defaultedMap27.containsKey((java.lang.Object) filterIterator38);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate67, predicate68);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap73, obj77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate83, predicate84);
        java.lang.Object obj86 = defaultedMap73.remove((java.lang.Object) predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate84);
        try {
            boolean b88 = filterIterator62.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        java.util.Set set6 = defaultedMap3.entrySet();
        boolean b7 = defaultedMap3.isEmpty();
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate24);
        filterIterator6.setPredicate(predicate22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        int i31 = defaultedMap28.size();
        defaultedMap28.clear();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap41.putAll((java.util.Map) defaultedMap43);
        java.lang.String str45 = defaultedMap41.toString();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.Predicate predicate47 = null;
        filterIterator46.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        filterIterator49.setPredicate(predicate50);
        collections.Predicate predicate52 = collections.PredicateUtils.truePredicate();
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate50, predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = null;
        filterIterator54.setPredicate(predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        filterIterator57.setPredicate(predicate58);
        java.util.Map map60 = collections.map.PredicatedMap.decorate(map39, predicate50, predicate58);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.lang.String str73 = defaultedMap69.toString();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.Predicate predicate75 = null;
        filterIterator74.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate78, predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.Predicate predicate83 = null;
        filterIterator82.setPredicate(predicate83);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        filterIterator85.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map67, predicate78, predicate86);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate58, predicate86);
        filterIterator6.setPredicate(predicate58);
        collections.Predicate predicate91 = filterIterator6.getPredicate();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(i31 == 0);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertNotNull(predicate91);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        boolean b6 = defaultedMap3.equals((java.lang.Object) 100.0f);
        java.util.Set set7 = defaultedMap3.keySet();
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) map16);
        java.util.Collection collection18 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap22.values();
        boolean b25 = defaultedMap3.equals((java.lang.Object) defaultedMap22);
        boolean b27 = defaultedMap3.equals((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.Transformer transformer29 = null;
        try {
            java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.lang.String str7 = defaultedMap3.toString();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.lang.Object obj9 = defaultedMap3.get((java.lang.Object) filterIterator8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8);
        java.util.Iterator iterator11 = filterIterator8.getIterator();
        filterIterator0.setIterator(iterator11);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0 + "'", obj9.equals(0));
        org.junit.Assert.assertNull(iterator11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b32 = defaultedMap1.isEmpty();
        java.lang.String str33 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertTrue("'" + str33 + "' != '" + "{}" + "'", str33.equals("{}"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        int i12 = defaultedMap9.size();
        defaultedMap9.clear();
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) b14);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) set5);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) set26);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        java.util.Collection collection16 = defaultedMap10.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.util.Set set13 = defaultedMap11.keySet();
        java.lang.Object obj14 = defaultedMap1.get((java.lang.Object) defaultedMap11);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 0 + "'", obj14.equals(0));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate7 = collections.PredicateUtils.truePredicate();
        java.util.Map map8 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap3, predicate6, predicate7);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.String str14 = defaultedMap10.toString();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        filterIterator18.setPredicate(predicate19);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate19, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        java.util.Map map29 = collections.map.PredicatedMap.decorate(map8, predicate19, predicate27);
        filterIterator0.setPredicate(predicate19);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) map16);
        java.util.Collection collection18 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap22.values();
        boolean b25 = defaultedMap3.equals((java.lang.Object) defaultedMap22);
        boolean b27 = defaultedMap3.equals((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) 100L);
        java.util.Collection collection29 = defaultedMap1.values();
        java.util.Set set30 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = null;
        filterIterator32.setPredicate(predicate33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        filterIterator31.setIterator((java.util.Iterator) filterIterator35);
        java.lang.Object obj37 = defaultedMap1.get((java.lang.Object) filterIterator35);
        boolean b39 = defaultedMap1.containsValue((java.lang.Object) 1L);
        collections.Factory factory40 = null;
        try {
            java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertTrue(b39 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        boolean b7 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        int i12 = defaultedMap9.size();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate23 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate23, predicate24);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap14.get((java.lang.Object) map27);
        boolean b29 = defaultedMap14.isEmpty();
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) b29);
        java.lang.Object obj31 = defaultedMap1.remove((java.lang.Object) defaultedMap9);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 0 + "'", obj28.equals(0));
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(obj31);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) 100.0d, (java.lang.Object) "");
        java.util.Set set12 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(set12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        boolean b16 = defaultedMap1.isEmpty();
        java.util.Collection collection17 = defaultedMap1.values();
        java.util.Collection collection18 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(collection17);
        org.junit.Assert.assertNotNull(collection18);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = null;
        filterIterator4.setPredicate(predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4);
        filterIterator3.setIterator((java.util.Iterator) filterIterator7);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap11.putAll((java.util.Map) defaultedMap13);
        java.lang.String str15 = defaultedMap11.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.lang.Object obj17 = defaultedMap11.get((java.lang.Object) filterIterator16);
        java.util.Iterator iterator18 = null;
        collections.Predicate predicate19 = null;
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator(iterator18, predicate19);
        filterIterator16.setIterator(iterator18);
        collections.Predicate predicate22 = filterIterator16.getPredicate();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16);
        filterIterator3.setIterator((java.util.Iterator) filterIterator23);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        java.util.Iterator iterator26 = filterIterator23.getIterator();
        try {
            filterIterator23.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNull(predicate22);
        org.junit.Assert.assertNotNull(iterator26);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap9.get((java.lang.Object) map22);
        boolean b24 = defaultedMap9.isEmpty();
        java.util.Set set25 = defaultedMap9.entrySet();
        boolean b26 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate27, predicate28);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        java.util.Set set9 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        int i24 = defaultedMap21.size();
        defaultedMap21.clear();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap34.putAll((java.util.Map) defaultedMap36);
        java.lang.String str38 = defaultedMap34.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = null;
        filterIterator39.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        filterIterator42.setPredicate(predicate43);
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate43, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator50.setPredicate(predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate(map32, predicate43, predicate51);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b57 = defaultedMap55.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate58 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate58, predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap62.putAll((java.util.Map) defaultedMap64);
        java.lang.String str66 = defaultedMap62.toString();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        filterIterator70.setPredicate(predicate71);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate71, predicate73);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = null;
        filterIterator75.setPredicate(predicate76);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        filterIterator78.setPredicate(predicate79);
        java.util.Map map81 = collections.map.PredicatedMap.decorate(map60, predicate71, predicate79);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate51, predicate79);
        java.util.Map map83 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate17, predicate79);
        collections.Transformer transformer84 = null;
        try {
            java.util.Map map85 = collections.map.DefaultedMap.decorate(map83, transformer84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(i24 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map53);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "{}" + "'", str66.equals("{}"));
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(map83);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap6.get((java.lang.Object) map19);
        boolean b21 = defaultedMap6.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b21);
        java.util.Set set23 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b32 = defaultedMap1.isEmpty();
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b32 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b32 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection40 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) ' ');
        java.util.Collection collection47 = defaultedMap42.values();
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) collection40, (java.lang.Object) defaultedMap42);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        java.util.Collection collection50 = defaultedMap34.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(collection50);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate9, predicate10);
        int i12 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator14.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) filterIterator21);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) map22);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap(obj23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate29, predicate30);
        int i32 = defaultedMap26.size();
        defaultedMap26.clear();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.Predicate predicate36 = null;
        filterIterator35.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35);
        filterIterator34.setIterator((java.util.Iterator) filterIterator38);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator34, predicate40);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap26, (java.lang.Object) filterIterator41);
        java.lang.Object obj43 = defaultedMap24.remove((java.lang.Object) defaultedMap26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue(i32 == 0);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) map20);
        boolean b22 = defaultedMap7.isEmpty();
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap7.containsKey(obj23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        java.util.Set set26 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.util.Set set24 = defaultedMap1.entrySet();
        collections.Factory factory25 = null;
        try {
            java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj10 = null;
        java.lang.Object obj11 = defaultedMap7.remove(obj10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.lang.Object obj20 = defaultedMap7.put((java.lang.Object) map18, (java.lang.Object) "hi!");
        java.lang.Object obj21 = defaultedMap3.get((java.lang.Object) map18);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        boolean b25 = defaultedMap1.equals((java.lang.Object) 100L);
        boolean b26 = defaultedMap1.isEmpty();
        java.util.Set set27 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        int i14 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap24.toString();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map22, predicate33, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.String str56 = defaultedMap52.toString();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = null;
        filterIterator65.setPredicate(predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map50, predicate61, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate41, predicate69);
        filterIterator6.setPredicate(predicate69);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.lang.String str79 = defaultedMap75.toString();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        java.lang.Object obj81 = defaultedMap75.get((java.lang.Object) filterIterator80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80);
        java.util.Iterator iterator83 = filterIterator80.getIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator80);
        try {
            java.lang.Object obj85 = filterIterator80.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0 + "'", obj81.equals(0));
        org.junit.Assert.assertNull(iterator83);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) map20);
        java.util.Collection collection22 = defaultedMap7.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.util.Collection collection28 = defaultedMap26.values();
        boolean b29 = defaultedMap7.equals((java.lang.Object) defaultedMap26);
        java.lang.Object obj30 = new java.lang.Object();
        boolean b31 = defaultedMap7.containsKey(obj30);
        java.util.Set set32 = defaultedMap7.entrySet();
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(b29 == true);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertNotNull(map33);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap6.get((java.lang.Object) map19);
        boolean b21 = defaultedMap6.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b21);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap25.putAll((java.util.Map) defaultedMap27);
        java.lang.String str29 = defaultedMap25.toString();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.lang.Object obj31 = defaultedMap25.get((java.lang.Object) filterIterator30);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        filterIterator30.setIterator(iterator32);
        collections.Predicate predicate36 = filterIterator30.getPredicate();
        java.lang.Object obj37 = defaultedMap1.remove((java.lang.Object) filterIterator30);
        java.util.Collection collection38 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 0 + "'", obj31.equals(0));
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(collection38);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        int i12 = defaultedMap9.size();
        defaultedMap9.clear();
        boolean b14 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b26 = defaultedMap24.containsKey((java.lang.Object) (-1L));
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) ' ');
        java.util.Collection collection29 = defaultedMap24.values();
        java.lang.Object obj30 = defaultedMap16.put((java.lang.Object) collection22, (java.lang.Object) defaultedMap24);
        boolean b31 = defaultedMap1.equals((java.lang.Object) defaultedMap16);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(iterator4);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection7 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) ' ');
        java.util.Collection collection14 = defaultedMap9.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) collection7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        int i20 = defaultedMap17.size();
        defaultedMap17.clear();
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap17, (java.lang.Object) true);
        java.util.Collection collection24 = defaultedMap17.values();
        java.util.Collection collection25 = defaultedMap17.values();
        java.lang.Object obj26 = defaultedMap1.get((java.lang.Object) collection25);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 0 + "'", obj26.equals(0));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection7 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) ' ');
        java.util.Collection collection14 = defaultedMap9.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) collection7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.util.Collection collection23 = defaultedMap21.values();
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) (-1L));
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) ' ');
        java.util.Collection collection30 = defaultedMap25.values();
        java.lang.Object obj31 = defaultedMap17.put((java.lang.Object) collection23, (java.lang.Object) defaultedMap25);
        defaultedMap1.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        int i37 = defaultedMap34.size();
        defaultedMap34.clear();
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) true);
        boolean b41 = defaultedMap34.isEmpty();
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b45 = defaultedMap43.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.truePredicate();
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap43, predicate46, predicate47);
        java.util.Map map50 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.Object obj56 = null;
        java.lang.Object obj57 = defaultedMap43.put((java.lang.Object) defaultedMap52, obj56);
        java.util.Collection collection58 = defaultedMap43.values();
        java.lang.Object obj59 = defaultedMap34.remove((java.lang.Object) defaultedMap43);
        java.lang.String str60 = defaultedMap43.toString();
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b64 = defaultedMap62.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap62, predicate65, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap69.putAll((java.util.Map) defaultedMap71);
        java.lang.String str73 = defaultedMap69.toString();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        collections.Predicate predicate75 = null;
        filterIterator74.setPredicate(predicate75);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator74);
        collections.Predicate predicate78 = collections.PredicateUtils.truePredicate();
        filterIterator77.setPredicate(predicate78);
        collections.Predicate predicate80 = collections.PredicateUtils.truePredicate();
        java.util.Map map81 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate78, predicate80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        collections.Predicate predicate83 = null;
        filterIterator82.setPredicate(predicate83);
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator82);
        collections.Predicate predicate86 = collections.PredicateUtils.truePredicate();
        filterIterator85.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate(map67, predicate78, predicate86);
        java.lang.Object obj89 = defaultedMap1.put((java.lang.Object) str60, (java.lang.Object) map88);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(i37 == 0);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{{}=null}" + "'", str60.equals("{{}=null}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "{}" + "'", str73.equals("{}"));
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map81);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNull(obj89);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) '#');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap15.putAll((java.util.Map) defaultedMap17);
        java.util.Collection collection19 = defaultedMap17.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) (-1L));
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) ' ');
        java.util.Collection collection26 = defaultedMap21.values();
        java.lang.Object obj27 = defaultedMap13.put((java.lang.Object) collection19, (java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap31.putAll((java.util.Map) defaultedMap33);
        java.util.Collection collection35 = defaultedMap33.values();
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b39 = defaultedMap37.containsKey((java.lang.Object) (-1L));
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) ' ');
        java.util.Collection collection42 = defaultedMap37.values();
        java.lang.Object obj43 = defaultedMap29.put((java.lang.Object) collection35, (java.lang.Object) defaultedMap37);
        defaultedMap13.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(collection26);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNull(obj43);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) predicate6);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap13.putAll((java.util.Map) defaultedMap15);
        java.lang.String str17 = defaultedMap13.toString();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.Predicate predicate19 = null;
        filterIterator18.setPredicate(predicate19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate22 = collections.PredicateUtils.truePredicate();
        filterIterator21.setPredicate(predicate22);
        collections.Predicate predicate24 = collections.PredicateUtils.truePredicate();
        java.util.Map map25 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate22, predicate24);
        filterIterator11.setPredicate(predicate22);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator(iterator9, predicate22);
        try {
            boolean b28 = filterIterator27.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map25);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) filterIterator11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator11.setIterator(iterator13);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.lang.String str22 = defaultedMap18.toString();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        filterIterator26.setPredicate(predicate27);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate27, predicate29);
        filterIterator11.setPredicate(predicate27);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator11);
        defaultedMap1.putAll((java.util.Map) defaultedMap32);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap33.toString();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) filterIterator38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator38.setIterator(iterator40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate56);
        filterIterator38.setPredicate(predicate54);
        collections.Predicate predicate59 = filterIterator38.getPredicate();
        boolean b60 = defaultedMap27.containsKey((java.lang.Object) filterIterator38);
        try {
            boolean b61 = filterIterator38.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap9.putAll((java.util.Map) defaultedMap11);
        java.lang.String str13 = defaultedMap9.toString();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.lang.Object obj15 = defaultedMap9.get((java.lang.Object) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        boolean b17 = defaultedMap1.containsKey((java.lang.Object) filterIterator14);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.util.Collection collection5 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) (-1L));
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map16 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate14, predicate15);
        defaultedMap3.putAll(map16);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map16);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate38, predicate39);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap35, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.lang.Object obj48 = null;
        java.lang.Object obj49 = defaultedMap35.put((java.lang.Object) defaultedMap44, obj48);
        java.util.Collection collection50 = defaultedMap35.values();
        java.lang.Object obj51 = defaultedMap27.get((java.lang.Object) collection50);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(collection50);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 0 + "'", obj51.equals(0));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap6.get((java.lang.Object) map19);
        boolean b21 = defaultedMap6.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b21);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        java.util.Set set31 = defaultedMap28.entrySet();
        java.util.Set set32 = defaultedMap28.keySet();
        java.lang.Object obj33 = defaultedMap1.get((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertNotNull(set32);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 0 + "'", obj33.equals(0));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        boolean b32 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap36.putAll((java.util.Map) defaultedMap38);
        java.util.Collection collection40 = defaultedMap38.values();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b44 = defaultedMap42.containsKey((java.lang.Object) (-1L));
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) ' ');
        java.util.Collection collection47 = defaultedMap42.values();
        java.lang.Object obj48 = defaultedMap34.put((java.lang.Object) collection40, (java.lang.Object) defaultedMap42);
        boolean b49 = defaultedMap1.containsKey((java.lang.Object) defaultedMap34);
        defaultedMap34.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b32 == true);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap33.toString();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) filterIterator38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator38.setIterator(iterator40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate56);
        filterIterator38.setPredicate(predicate54);
        collections.Predicate predicate59 = filterIterator38.getPredicate();
        boolean b60 = defaultedMap27.containsKey((java.lang.Object) filterIterator38);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate67, predicate68);
        java.util.Map map71 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap64, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        java.lang.Object obj77 = null;
        java.lang.Object obj78 = defaultedMap64.put((java.lang.Object) defaultedMap73, obj77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b82 = defaultedMap80.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate83 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap80, predicate83, predicate84);
        java.lang.Object obj86 = defaultedMap73.remove((java.lang.Object) predicate84);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate84);
        java.util.Iterator iterator88 = null;
        filterIterator62.setIterator(iterator88);
        try {
            boolean b90 = filterIterator62.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertTrue(b82 == false);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNull(obj86);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        int i20 = defaultedMap14.size();
        defaultedMap14.clear();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        collections.Predicate predicate24 = null;
        filterIterator23.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator23);
        filterIterator22.setIterator((java.util.Iterator) filterIterator26);
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22, predicate28);
        java.util.Map map30 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) filterIterator29);
        filterIterator6.setIterator((java.util.Iterator) filterIterator29);
        java.util.Iterator iterator32 = null;
        collections.Predicate predicate33 = null;
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator(iterator32, predicate33);
        collections.Predicate predicate35 = null;
        filterIterator34.setPredicate(predicate35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate41, predicate42);
        int i44 = defaultedMap38.size();
        defaultedMap38.clear();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator47);
        filterIterator46.setIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate52);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap38, (java.lang.Object) filterIterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = null;
        filterIterator56.setPredicate(predicate57);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        filterIterator55.setIterator((java.util.Iterator) filterIterator59);
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate61);
        filterIterator34.setPredicate(predicate61);
        filterIterator29.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator();
        collections.Predicate predicate68 = null;
        filterIterator67.setPredicate(predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        filterIterator66.setIterator((java.util.Iterator) filterIterator70);
        collections.Predicate predicate72 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate72);
        java.util.Iterator iterator74 = null;
        collections.Predicate predicate75 = null;
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator(iterator74, predicate75);
        java.util.Iterator iterator77 = filterIterator76.getIterator();
        filterIterator66.setIterator(iterator77);
        filterIterator29.setIterator((java.util.Iterator) filterIterator66);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(i44 == 0);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNull(iterator77);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap35.putAll((java.util.Map) defaultedMap37);
        int i39 = defaultedMap37.size();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.Predicate predicate42 = null;
        filterIterator41.setPredicate(predicate42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        filterIterator40.setIterator((java.util.Iterator) filterIterator44);
        collections.Predicate predicate46 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate46);
        java.lang.Object obj48 = defaultedMap37.get((java.lang.Object) filterIterator40);
        defaultedMap1.putAll((java.util.Map) defaultedMap37);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 0 + "'", obj48.equals(0));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) defaultedMap19, obj23);
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap10.containsKey(obj25);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.Factory factory28 = null;
        try {
            java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, factory28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        java.util.Set set26 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) set26);
        java.util.Collection collection28 = defaultedMap27.values();
        int i29 = defaultedMap27.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertNotNull(collection28);
        org.junit.Assert.assertTrue(i29 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        int i18 = defaultedMap15.size();
        defaultedMap15.clear();
        boolean b20 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        defaultedMap15.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = null;
        filterIterator5.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.Predicate predicate9 = filterIterator5.getPredicate();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) predicate9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap3.putAll((java.util.Map) defaultedMap5);
        java.util.Collection collection7 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) ' ');
        java.util.Collection collection14 = defaultedMap9.values();
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) collection7, (java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b18 = defaultedMap1.containsKey((java.lang.Object) defaultedMap17);
        org.junit.Assert.assertNotNull(collection7);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) -1);
        int i2 = defaultedMap1.size();
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        filterIterator0.setIterator(iterator11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap14.putAll((java.util.Map) defaultedMap16);
        java.lang.String str18 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        java.lang.Object obj20 = defaultedMap14.get((java.lang.Object) filterIterator19);
        java.util.Iterator iterator21 = null;
        collections.Predicate predicate22 = null;
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator(iterator21, predicate22);
        filterIterator19.setIterator(iterator21);
        collections.Predicate predicate25 = filterIterator19.getPredicate();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate30, predicate31);
        int i33 = defaultedMap27.size();
        defaultedMap27.clear();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = null;
        filterIterator36.setPredicate(predicate37);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36);
        filterIterator35.setIterator((java.util.Iterator) filterIterator39);
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator35, predicate41);
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) filterIterator42);
        filterIterator19.setIterator((java.util.Iterator) filterIterator42);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        collections.Predicate predicate48 = null;
        filterIterator47.setPredicate(predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        java.util.Map map56 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate54, predicate55);
        int i57 = defaultedMap51.size();
        defaultedMap51.clear();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        collections.Predicate predicate61 = null;
        filterIterator60.setPredicate(predicate61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        filterIterator59.setIterator((java.util.Iterator) filterIterator63);
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate65);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) filterIterator66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = null;
        filterIterator69.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69);
        filterIterator68.setIterator((java.util.Iterator) filterIterator72);
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate74);
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66, predicate74);
        filterIterator47.setPredicate(predicate74);
        filterIterator42.setPredicate(predicate74);
        filterIterator0.setPredicate(predicate74);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue(i33 == 0);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(map56);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNotNull(predicate74);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b14 = defaultedMap12.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate15 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate15, predicate16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap12, (java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap6.get((java.lang.Object) map19);
        boolean b21 = defaultedMap6.isEmpty();
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b21);
        java.util.Collection collection23 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        java.lang.Object obj26 = defaultedMap1.put((java.lang.Object) (short) 100, (java.lang.Object) filterIterator25);
        java.util.Set set27 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 0 + "'", obj20.equals(0));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(collection23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(set27);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        int i16 = defaultedMap10.size();
        defaultedMap10.clear();
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) filterIterator25);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(map26);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        defaultedMap1.clear();
        boolean b25 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection33 = defaultedMap31.values();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        boolean b39 = defaultedMap35.containsValue((java.lang.Object) ' ');
        java.util.Collection collection40 = defaultedMap35.values();
        java.lang.Object obj41 = defaultedMap27.put((java.lang.Object) collection33, (java.lang.Object) defaultedMap35);
        boolean b42 = defaultedMap1.equals(obj41);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(collection40);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertTrue(b42 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator9.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) filterIterator26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate24);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        collections.Predicate predicate8 = null;
        filterIterator7.setPredicate(predicate8);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator6.setIterator((java.util.Iterator) filterIterator10);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        java.lang.Object obj16 = new java.lang.Object();
        boolean b17 = defaultedMap1.containsKey(obj16);
        boolean b18 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (byte) 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap1.put((java.lang.Object) (short) 1, (java.lang.Object) '#');
        java.lang.String str12 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{1=#}" + "'", str12.equals("{1=#}"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator9.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        java.util.Set set18 = defaultedMap1.keySet();
        java.util.Collection collection19 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b5 = defaultedMap3.containsKey((java.lang.Object) (-1L));
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        java.util.Map map14 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate12, predicate13);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap3.get((java.lang.Object) map16);
        java.util.Collection collection18 = defaultedMap3.values();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap20.putAll((java.util.Map) defaultedMap22);
        java.util.Collection collection24 = defaultedMap22.values();
        boolean b25 = defaultedMap3.equals((java.lang.Object) defaultedMap22);
        boolean b27 = defaultedMap3.equals((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate33, predicate34);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap39.putAll((java.util.Map) defaultedMap41);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap30.put((java.lang.Object) defaultedMap39, obj43);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b48 = defaultedMap46.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate49, predicate50);
        java.lang.Object obj52 = defaultedMap39.remove((java.lang.Object) predicate50);
        defaultedMap39.clear();
        boolean b54 = defaultedMap1.containsKey((java.lang.Object) defaultedMap39);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap56.putAll((java.util.Map) defaultedMap58);
        int i60 = defaultedMap58.size();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = null;
        filterIterator62.setPredicate(predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        filterIterator61.setIterator((java.util.Iterator) filterIterator65);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate67);
        java.lang.Object obj69 = defaultedMap58.get((java.lang.Object) filterIterator61);
        java.lang.Object obj70 = defaultedMap1.get(obj69);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 0 + "'", obj17.equals(0));
        org.junit.Assert.assertNotNull(collection18);
        org.junit.Assert.assertNotNull(collection24);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue(i60 == 0);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertTrue("'" + obj69 + "' != '" + 0 + "'", obj69.equals(0));
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 0 + "'", obj70.equals(0));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap33.putAll((java.util.Map) defaultedMap35);
        java.lang.String str37 = defaultedMap33.toString();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.lang.Object obj39 = defaultedMap33.get((java.lang.Object) filterIterator38);
        java.util.Iterator iterator40 = null;
        collections.Predicate predicate41 = null;
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40, predicate41);
        filterIterator38.setIterator(iterator40);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate56);
        filterIterator38.setPredicate(predicate54);
        collections.Predicate predicate59 = filterIterator38.getPredicate();
        boolean b60 = defaultedMap27.containsKey((java.lang.Object) filterIterator38);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate61);
        try {
            java.lang.Object obj63 = filterIterator38.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 0 + "'", obj39.equals(0));
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(predicate61);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        boolean b16 = defaultedMap1.isEmpty();
        java.lang.Object obj17 = null;
        boolean b18 = defaultedMap1.containsKey(obj17);
        int i19 = defaultedMap1.size();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(i19 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.util.Set set4 = defaultedMap1.entrySet();
        java.util.Set set5 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.util.Set set11 = defaultedMap9.keySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap9);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(set5);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate9, predicate10);
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        java.lang.Object obj15 = defaultedMap6.get((java.lang.Object) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        filterIterator0.setIterator((java.util.Iterator) filterIterator16);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.lang.Object obj14 = defaultedMap1.put((java.lang.Object) map12, (java.lang.Object) "hi!");
        boolean b15 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        java.util.Iterator iterator8 = null;
        collections.Predicate predicate9 = null;
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator(iterator8, predicate9);
        filterIterator6.setIterator(iterator8);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) filterIterator13);
        collections.Predicate predicate15 = filterIterator13.getPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13);
        try {
            filterIterator13.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(predicate12);
        org.junit.Assert.assertNull(predicate15);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        boolean b25 = defaultedMap1.equals((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = null;
        filterIterator27.setPredicate(predicate28);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27);
        filterIterator26.setIterator((java.util.Iterator) filterIterator30);
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate32);
        java.util.Iterator iterator34 = filterIterator26.getIterator();
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) (-1L));
        int i39 = defaultedMap36.size();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate50, predicate51);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap41.get((java.lang.Object) map54);
        boolean b56 = defaultedMap41.isEmpty();
        java.util.Map map57 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) b56);
        java.util.Collection collection58 = defaultedMap36.values();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap60.putAll((java.util.Map) defaultedMap62);
        java.lang.String str64 = defaultedMap60.toString();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        java.lang.Object obj66 = defaultedMap60.get((java.lang.Object) filterIterator65);
        java.util.Iterator iterator67 = null;
        collections.Predicate predicate68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator(iterator67, predicate68);
        filterIterator65.setIterator(iterator67);
        collections.Predicate predicate71 = filterIterator65.getPredicate();
        java.lang.Object obj72 = defaultedMap36.remove((java.lang.Object) filterIterator65);
        filterIterator26.setIterator((java.util.Iterator) filterIterator65);
        boolean b74 = defaultedMap1.containsValue((java.lang.Object) filterIterator26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(iterator34);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue("'" + obj55 + "' != '" + 0 + "'", obj55.equals(0));
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(collection58);
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 0 + "'", obj66.equals(0));
        org.junit.Assert.assertNull(predicate71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(b74 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        java.util.Set set17 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        java.util.Map map11 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate9, predicate10);
        int i12 = defaultedMap6.size();
        defaultedMap6.clear();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = null;
        filterIterator15.setPredicate(predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        filterIterator14.setIterator((java.util.Iterator) filterIterator18);
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14, predicate20);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) filterIterator21);
        java.lang.Object obj23 = defaultedMap1.remove((java.lang.Object) map22);
        defaultedMap1.clear();
        java.lang.String str25 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "{}" + "'", str25.equals("{}"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        int i18 = defaultedMap15.size();
        defaultedMap15.clear();
        boolean b20 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b25 = defaultedMap23.containsKey((java.lang.Object) (-1L));
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b31 = defaultedMap29.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap29, predicate32, predicate33);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap23.get((java.lang.Object) map36);
        java.util.Collection collection38 = defaultedMap23.values();
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap40.putAll((java.util.Map) defaultedMap42);
        java.util.Collection collection44 = defaultedMap42.values();
        boolean b45 = defaultedMap23.equals((java.lang.Object) defaultedMap42);
        java.lang.Object obj46 = new java.lang.Object();
        boolean b47 = defaultedMap23.containsKey(obj46);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap49.putAll((java.util.Map) defaultedMap51);
        defaultedMap23.putAll((java.util.Map) defaultedMap49);
        java.util.Set set54 = defaultedMap49.keySet();
        boolean b55 = defaultedMap1.containsKey((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 0 + "'", obj37.equals(0));
        org.junit.Assert.assertNotNull(collection38);
        org.junit.Assert.assertNotNull(collection44);
        org.junit.Assert.assertTrue(b45 == true);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(set54);
        org.junit.Assert.assertTrue(b55 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate16, predicate17);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap7.get((java.lang.Object) map20);
        boolean b22 = defaultedMap7.isEmpty();
        java.lang.Object obj23 = null;
        boolean b24 = defaultedMap7.containsKey(obj23);
        boolean b25 = defaultedMap1.containsValue((java.lang.Object) defaultedMap7);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap28.putAll((java.util.Map) defaultedMap30);
        java.lang.String str32 = defaultedMap28.toString();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.lang.Object obj34 = defaultedMap28.get((java.lang.Object) filterIterator33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b38 = defaultedMap36.containsKey((java.lang.Object) (-1L));
        int i39 = defaultedMap36.size();
        defaultedMap36.clear();
        boolean b41 = defaultedMap28.equals((java.lang.Object) defaultedMap36);
        java.lang.Object obj42 = defaultedMap7.put((java.lang.Object) 100, (java.lang.Object) b41);
        collections.Factory factory43 = null;
        try {
            java.util.Map map44 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, factory43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 0 + "'", obj21.equals(0));
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "{}" + "'", str32.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 0 + "'", obj34.equals(0));
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNull(obj42);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        defaultedMap1.clear();
        java.util.Set set25 = defaultedMap1.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 0 + "'", obj27.equals(0));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.remove(obj4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap7.putAll((java.util.Map) defaultedMap9);
        java.lang.String str11 = defaultedMap7.toString();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        java.lang.Object obj13 = defaultedMap7.get((java.lang.Object) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        int i18 = defaultedMap15.size();
        defaultedMap15.clear();
        boolean b20 = defaultedMap7.equals((java.lang.Object) defaultedMap15);
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        boolean b22 = defaultedMap15.isEmpty();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap26.putAll((java.util.Map) defaultedMap28);
        java.util.Collection collection30 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) ' ');
        java.util.Collection collection37 = defaultedMap32.values();
        java.lang.Object obj38 = defaultedMap24.put((java.lang.Object) collection30, (java.lang.Object) defaultedMap32);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap42.putAll((java.util.Map) defaultedMap44);
        java.util.Collection collection46 = defaultedMap44.values();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b50 = defaultedMap48.containsKey((java.lang.Object) (-1L));
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) ' ');
        java.util.Collection collection53 = defaultedMap48.values();
        java.lang.Object obj54 = defaultedMap40.put((java.lang.Object) collection46, (java.lang.Object) defaultedMap48);
        defaultedMap24.putAll((java.util.Map) defaultedMap40);
        java.util.Set set56 = defaultedMap40.entrySet();
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b60 = defaultedMap58.containsKey((java.lang.Object) (-1L));
        java.lang.Object obj61 = null;
        java.lang.Object obj62 = defaultedMap58.remove(obj61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b66 = defaultedMap64.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate67 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap64, predicate67, predicate68);
        java.lang.Object obj71 = defaultedMap58.put((java.lang.Object) map69, (java.lang.Object) "hi!");
        boolean b72 = defaultedMap40.equals(obj71);
        java.lang.Object obj73 = defaultedMap15.get(obj71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 0 + "'", obj13.equals(0));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(collection30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(collection37);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(collection46);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 0 + "'", obj73.equals(0));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        int i6 = defaultedMap1.size();
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) (-1L));
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b17 = defaultedMap15.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate19 = collections.PredicateUtils.truePredicate();
        java.util.Map map20 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate18, predicate19);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap9.get((java.lang.Object) map22);
        boolean b24 = defaultedMap9.isEmpty();
        java.util.Set set25 = defaultedMap9.entrySet();
        boolean b26 = defaultedMap1.equals((java.lang.Object) defaultedMap9);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b30 = defaultedMap28.containsKey((java.lang.Object) (-1L));
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b36 = defaultedMap34.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate38 = collections.PredicateUtils.truePredicate();
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate37, predicate38);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) 100L);
        java.lang.Object obj42 = defaultedMap28.get((java.lang.Object) map41);
        java.util.Collection collection43 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.util.Collection collection49 = defaultedMap47.values();
        boolean b50 = defaultedMap28.equals((java.lang.Object) defaultedMap47);
        boolean b52 = defaultedMap28.equals((java.lang.Object) 100L);
        boolean b53 = defaultedMap28.isEmpty();
        java.util.Collection collection54 = defaultedMap28.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap28);
        boolean b56 = defaultedMap9.containsValue((java.lang.Object) defaultedMap28);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0 + "'", obj23.equals(0));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0 + "'", obj42.equals(0));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(collection49);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        java.lang.Object obj23 = defaultedMap10.remove((java.lang.Object) predicate21);
        defaultedMap10.clear();
        int i25 = defaultedMap10.size();
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b29 = defaultedMap27.containsKey((java.lang.Object) (-1L));
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        java.util.Map map40 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100L);
        java.lang.Object obj41 = defaultedMap27.get((java.lang.Object) map40);
        java.util.Collection collection42 = defaultedMap27.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap44.putAll((java.util.Map) defaultedMap46);
        java.util.Collection collection48 = defaultedMap46.values();
        boolean b49 = defaultedMap27.equals((java.lang.Object) defaultedMap46);
        java.lang.Object obj50 = new java.lang.Object();
        boolean b51 = defaultedMap27.containsKey(obj50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap53.putAll((java.util.Map) defaultedMap55);
        defaultedMap27.putAll((java.util.Map) defaultedMap53);
        boolean b58 = defaultedMap27.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b62 = defaultedMap60.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate64 = collections.PredicateUtils.truePredicate();
        java.util.Map map65 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate63, predicate64);
        java.util.Map map67 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap60, (java.lang.Object) 100L);
        defaultedMap27.putAll(map67);
        boolean b69 = defaultedMap10.equals((java.lang.Object) map67);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue(i25 == 0);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 0 + "'", obj41.equals(0));
        org.junit.Assert.assertNotNull(collection42);
        org.junit.Assert.assertNotNull(collection48);
        org.junit.Assert.assertTrue(b49 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b69 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate10 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate11 = collections.PredicateUtils.truePredicate();
        java.util.Map map12 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate10, predicate11);
        java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) map14);
        java.util.Collection collection16 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap18.putAll((java.util.Map) defaultedMap20);
        java.util.Collection collection22 = defaultedMap20.values();
        boolean b23 = defaultedMap1.equals((java.lang.Object) defaultedMap20);
        java.lang.Object obj24 = new java.lang.Object();
        boolean b25 = defaultedMap1.containsKey(obj24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap27.putAll((java.util.Map) defaultedMap29);
        defaultedMap1.putAll((java.util.Map) defaultedMap27);
        java.lang.Object obj33 = defaultedMap1.remove((java.lang.Object) 100.0d);
        collections.Factory factory34 = null;
        try {
            java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(map14);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 0 + "'", obj15.equals(0));
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertNotNull(collection22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = null;
        filterIterator1.setPredicate(predicate2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1);
        filterIterator0.setIterator((java.util.Iterator) filterIterator4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b9 = defaultedMap7.containsKey((java.lang.Object) (-1L));
        int i10 = defaultedMap7.size();
        defaultedMap7.clear();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) true);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap16.putAll((java.util.Map) defaultedMap18);
        java.lang.String str20 = defaultedMap16.toString();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.lang.Object obj22 = defaultedMap16.get((java.lang.Object) filterIterator21);
        java.util.Iterator iterator23 = null;
        collections.Predicate predicate24 = null;
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator(iterator23, predicate24);
        filterIterator21.setIterator(iterator23);
        collections.Predicate predicate27 = filterIterator21.getPredicate();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) filterIterator28);
        collections.Predicate predicate30 = filterIterator28.getPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) (-1L));
        int i35 = defaultedMap32.size();
        defaultedMap32.clear();
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b40 = defaultedMap38.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap38, predicate41, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap45.putAll((java.util.Map) defaultedMap47);
        java.lang.String str49 = defaultedMap45.toString();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.Predicate predicate51 = null;
        filterIterator50.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        filterIterator53.setPredicate(predicate54);
        collections.Predicate predicate56 = collections.PredicateUtils.truePredicate();
        java.util.Map map57 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate54, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        collections.Predicate predicate59 = null;
        filterIterator58.setPredicate(predicate59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58);
        collections.Predicate predicate62 = collections.PredicateUtils.truePredicate();
        filterIterator61.setPredicate(predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate(map43, predicate54, predicate62);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b68 = defaultedMap66.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate70 = collections.PredicateUtils.truePredicate();
        java.util.Map map71 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate69, predicate70);
        collections.map.DefaultedMap defaultedMap73 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap73.putAll((java.util.Map) defaultedMap75);
        java.lang.String str77 = defaultedMap73.toString();
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = null;
        filterIterator78.setPredicate(predicate79);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator78);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator81.setPredicate(predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap73, predicate82, predicate84);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.Predicate predicate87 = null;
        filterIterator86.setPredicate(predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        filterIterator89.setPredicate(predicate90);
        java.util.Map map92 = collections.map.PredicatedMap.decorate(map71, predicate82, predicate90);
        java.util.Map map93 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate62, predicate90);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28, predicate62);
        java.util.Map map95 = collections.map.PredicatedMap.decorate(map13, predicate14, predicate62);
        collections.iterators.FilterIterator filterIterator96 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate14);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0 + "'", obj22.equals(0));
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(i35 == 0);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map57);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "{}" + "'", str77.equals("{}"));
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNotNull(map93);
        org.junit.Assert.assertNotNull(map95);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = null;
        filterIterator0.setPredicate(predicate1);
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b6 = defaultedMap4.containsKey((java.lang.Object) (-1L));
        boolean b8 = defaultedMap4.containsValue((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap4.get((java.lang.Object) map17);
        java.util.Collection collection19 = defaultedMap4.values();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap21.putAll((java.util.Map) defaultedMap23);
        java.util.Collection collection25 = defaultedMap23.values();
        boolean b26 = defaultedMap4.equals((java.lang.Object) defaultedMap23);
        java.lang.Object obj27 = new java.lang.Object();
        boolean b28 = defaultedMap4.containsKey(obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap30.putAll((java.util.Map) defaultedMap32);
        defaultedMap4.putAll((java.util.Map) defaultedMap30);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) 0L);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap38.putAll((java.util.Map) defaultedMap40);
        java.lang.String str42 = defaultedMap38.toString();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        java.lang.Object obj44 = defaultedMap38.get((java.lang.Object) filterIterator43);
        java.util.Iterator iterator45 = null;
        collections.Predicate predicate46 = null;
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator(iterator45, predicate46);
        filterIterator43.setIterator(iterator45);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap50.putAll((java.util.Map) defaultedMap52);
        java.lang.String str54 = defaultedMap50.toString();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = null;
        filterIterator55.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        filterIterator58.setPredicate(predicate59);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap50, predicate59, predicate61);
        filterIterator43.setPredicate(predicate59);
        boolean b64 = defaultedMap30.containsValue((java.lang.Object) predicate59);
        filterIterator0.setPredicate(predicate59);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 0 + "'", obj18.equals(0));
        org.junit.Assert.assertNotNull(collection19);
        org.junit.Assert.assertNotNull(collection25);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 0 + "'", obj44.equals(0));
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap1.putAll((java.util.Map) defaultedMap3);
        java.lang.String str5 = defaultedMap1.toString();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.lang.Object obj7 = defaultedMap1.get((java.lang.Object) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        java.util.Iterator iterator9 = filterIterator6.getIterator();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) (-1L));
        int i14 = defaultedMap11.size();
        defaultedMap11.clear();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b19 = defaultedMap17.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate20 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        java.util.Map map22 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate20, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap24.putAll((java.util.Map) defaultedMap26);
        java.lang.String str28 = defaultedMap24.toString();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        filterIterator32.setPredicate(predicate33);
        collections.Predicate predicate35 = collections.PredicateUtils.truePredicate();
        java.util.Map map36 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate33, predicate35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        collections.Predicate predicate38 = null;
        filterIterator37.setPredicate(predicate38);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator37);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        filterIterator40.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate(map22, predicate33, predicate41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b47 = defaultedMap45.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate48 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.truePredicate();
        java.util.Map map50 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate48, predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap52.putAll((java.util.Map) defaultedMap54);
        java.lang.String str56 = defaultedMap52.toString();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = null;
        filterIterator57.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator57);
        collections.Predicate predicate61 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate61);
        collections.Predicate predicate63 = collections.PredicateUtils.truePredicate();
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap52, predicate61, predicate63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = null;
        filterIterator65.setPredicate(predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        filterIterator68.setPredicate(predicate69);
        java.util.Map map71 = collections.map.PredicatedMap.decorate(map50, predicate61, predicate69);
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap11, predicate41, predicate69);
        filterIterator6.setPredicate(predicate69);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap75.putAll((java.util.Map) defaultedMap77);
        java.lang.String str79 = defaultedMap75.toString();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        java.lang.Object obj81 = defaultedMap75.get((java.lang.Object) filterIterator80);
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator80);
        java.util.Iterator iterator83 = filterIterator80.getIterator();
        filterIterator6.setIterator((java.util.Iterator) filterIterator80);
        try {
            filterIterator80.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 0 + "'", obj7.equals(0));
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(map50);
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "{}" + "'", str56.equals("{}"));
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(map71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + str79 + "' != '" + "{}" + "'", str79.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj81 + "' != '" + 0 + "'", obj81.equals(0));
        org.junit.Assert.assertNull(iterator83);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        int i13 = defaultedMap10.size();
        defaultedMap10.clear();
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) true);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.String str23 = defaultedMap19.toString();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.lang.Object obj25 = defaultedMap19.get((java.lang.Object) filterIterator24);
        java.util.Iterator iterator26 = null;
        collections.Predicate predicate27 = null;
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator(iterator26, predicate27);
        filterIterator24.setIterator(iterator26);
        collections.Predicate predicate30 = filterIterator24.getPredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) filterIterator31);
        collections.Predicate predicate33 = filterIterator31.getPredicate();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b37 = defaultedMap35.containsKey((java.lang.Object) (-1L));
        int i38 = defaultedMap35.size();
        defaultedMap35.clear();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b43 = defaultedMap41.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate45 = collections.PredicateUtils.truePredicate();
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap41, predicate44, predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap48.putAll((java.util.Map) defaultedMap50);
        java.lang.String str52 = defaultedMap48.toString();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = null;
        filterIterator53.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        collections.Predicate predicate57 = collections.PredicateUtils.truePredicate();
        filterIterator56.setPredicate(predicate57);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        java.util.Map map60 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap48, predicate57, predicate59);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = null;
        filterIterator61.setPredicate(predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.Predicate predicate65 = collections.PredicateUtils.truePredicate();
        filterIterator64.setPredicate(predicate65);
        java.util.Map map67 = collections.map.PredicatedMap.decorate(map46, predicate57, predicate65);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b71 = defaultedMap69.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate72 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        java.util.Map map74 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate72, predicate73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap78 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap76.putAll((java.util.Map) defaultedMap78);
        java.lang.String str80 = defaultedMap76.toString();
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = null;
        filterIterator81.setPredicate(predicate82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator81);
        collections.Predicate predicate85 = collections.PredicateUtils.truePredicate();
        filterIterator84.setPredicate(predicate85);
        collections.Predicate predicate87 = collections.PredicateUtils.truePredicate();
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate85, predicate87);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator();
        collections.Predicate predicate90 = null;
        filterIterator89.setPredicate(predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator89);
        collections.Predicate predicate93 = collections.PredicateUtils.truePredicate();
        filterIterator92.setPredicate(predicate93);
        java.util.Map map95 = collections.map.PredicatedMap.decorate(map74, predicate85, predicate93);
        java.util.Map map96 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate65, predicate93);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate65);
        java.util.Map map98 = collections.map.PredicatedMap.decorate(map16, predicate17, predicate65);
        boolean b99 = defaultedMap1.equals((java.lang.Object) predicate17);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 0 + "'", obj25.equals(0));
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue(i38 == 0);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNotNull(map60);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertTrue("'" + str80 + "' != '" + "{}" + "'", str80.equals("{}"));
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertNotNull(map95);
        org.junit.Assert.assertNotNull(map96);
        org.junit.Assert.assertNotNull(map98);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        int i4 = defaultedMap1.size();
        defaultedMap1.clear();
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b12 = defaultedMap10.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate13 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        java.util.Map map15 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate13, predicate14);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap19.putAll((java.util.Map) defaultedMap21);
        java.lang.Object obj23 = null;
        java.lang.Object obj24 = defaultedMap10.put((java.lang.Object) defaultedMap19, obj23);
        java.lang.Object obj25 = new java.lang.Object();
        boolean b26 = defaultedMap10.containsKey(obj25);
        defaultedMap1.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap29.putAll((java.util.Map) defaultedMap31);
        java.util.Collection collection33 = defaultedMap31.values();
        boolean b34 = defaultedMap1.equals((java.lang.Object) collection33);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(collection33);
        org.junit.Assert.assertTrue(b34 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap10.putAll((java.util.Map) defaultedMap12);
        java.lang.Object obj14 = null;
        java.lang.Object obj15 = defaultedMap1.put((java.lang.Object) defaultedMap10, obj14);
        java.util.Collection collection16 = defaultedMap1.values();
        java.lang.String str17 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(collection16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{{}=null}" + "'", str17.equals("{{}=null}"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator9.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate24);
        java.util.Iterator iterator27 = null;
        collections.Predicate predicate28 = null;
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator(iterator27, predicate28);
        collections.Predicate predicate30 = null;
        filterIterator29.setPredicate(predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b35 = defaultedMap33.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.truePredicate();
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate36, predicate37);
        int i39 = defaultedMap33.size();
        defaultedMap33.clear();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator();
        collections.Predicate predicate43 = null;
        filterIterator42.setPredicate(predicate43);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        filterIterator41.setIterator((java.util.Iterator) filterIterator45);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41, predicate47);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = null;
        filterIterator51.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        filterIterator50.setIterator((java.util.Iterator) filterIterator54);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50, predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate56);
        filterIterator29.setPredicate(predicate56);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate60);
        filterIterator16.setPredicate(predicate60);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue(i39 == 0);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(predicate60);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) filterIterator9);
        boolean b12 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b16 = defaultedMap14.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate17 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate18 = collections.PredicateUtils.truePredicate();
        java.util.Map map19 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate17, predicate18);
        java.util.Map map21 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap23.putAll((java.util.Map) defaultedMap25);
        java.lang.Object obj27 = null;
        java.lang.Object obj28 = defaultedMap14.put((java.lang.Object) defaultedMap23, obj27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b32 = defaultedMap30.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap30, predicate33, predicate34);
        java.lang.Object obj36 = defaultedMap23.remove((java.lang.Object) predicate34);
        java.lang.String str37 = defaultedMap23.toString();
        java.lang.Object obj38 = defaultedMap1.remove((java.lang.Object) defaultedMap23);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 0 + "'", obj10.equals(0));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map19);
        org.junit.Assert.assertNotNull(map21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNull(obj38);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) (-1L));
        collections.Predicate predicate4 = collections.PredicateUtils.truePredicate();
        collections.Predicate predicate5 = collections.PredicateUtils.truePredicate();
        java.util.Map map6 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate4, predicate5);
        int i7 = defaultedMap1.size();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = null;
        filterIterator10.setPredicate(predicate11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator9.setIterator((java.util.Iterator) filterIterator13);
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate15);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) filterIterator16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = null;
        filterIterator19.setPredicate(predicate20);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator18.setIterator((java.util.Iterator) filterIterator22);
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18, predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate24);
        java.util.Iterator iterator27 = filterIterator16.getIterator();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator28);
        filterIterator16.setIterator((java.util.Iterator) filterIterator29);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNotNull(iterator27);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 0);
        boolean b2 = defaultedMap1.isEmpty();
        java.lang.Object obj3 = null;
        boolean b4 = defaultedMap1.containsKey(obj3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 0);
        defaultedMap6.putAll((java.util.Map) defaultedMap8);
        java.lang.String str10 = defaultedMap6.toString();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.lang.Object obj12 = defaultedMap6.get((java.lang.Object) filterIterator11);
        java.util.Iterator iterator13 = null;
        collections.Predicate predicate14 = null;
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator(iterator13, predicate14);
        filterIterator11.setIterator(iterator13);
        collections.Predicate predicate17 = filterIterator11.getPredicate();
        collections.Predicate predicate18 = filterIterator11.getPredicate();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) filterIterator11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 0 + "'", obj12.equals(0));
        org.junit.Assert.assertNull(predicate17);
        org.junit.Assert.assertNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
    }
}

