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
        java.util.Map map0 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (-1.0f));
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
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.util.Map map0 = null;
        collections.Transformer transformer1 = null;
        try {
            java.util.Map map2 = collections.map.DefaultedMap.decorate(map0, transformer1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.util.Map map0 = null;
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        try {
            java.util.Map map3 = collections.map.PredicatedMap.decorate(map0, predicate1, predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate2);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.Transformer transformer4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate(map3, transformer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        int i21 = defaultedMap16.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        collections.Factory factory6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) (byte) 10, (java.lang.Object) (-1.0f));
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.String str6 = defaultedMap1.toString();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        boolean b6 = defaultedMap1.isEmpty();
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        try {
            boolean b8 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b6 = defaultedMap1.isEmpty();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.Transformer transformer33 = null;
        try {
            java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, transformer33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap6.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 1);
        boolean b24 = defaultedMap18.equals((java.lang.Object) 10L);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) true);
        java.util.Set set30 = defaultedMap27.keySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) 1);
        boolean b39 = defaultedMap33.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0f);
        defaultedMap18.putAll((java.util.Map) defaultedMap33);
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj45 = defaultedMap18.get((java.lang.Object) predicate44);
        java.lang.Object obj46 = defaultedMap1.get(obj45);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100.0f + "'", obj22.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        collections.Factory factory4 = null;
        try {
            java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        boolean b43 = defaultedMap22.containsValue((java.lang.Object) filterIterator42);
        java.lang.Object obj44 = null;
        boolean b45 = defaultedMap22.equals(obj44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b45 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.isEmpty();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        boolean b6 = defaultedMap1.containsKey((java.lang.Object) iterator5);
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) false);
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap6.isEmpty();
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator15.setIterator(iterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate26);
        java.util.Map map30 = collections.map.DefaultedMap.decorate(map28, (java.lang.Object) (byte) 10);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(map30);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        try {
            boolean b6 = filterIterator0.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) false);
        defaultedMap11.clear();
        java.util.Collection collection15 = defaultedMap11.values();
        boolean b16 = defaultedMap1.equals((java.lang.Object) collection15);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b21 = defaultedMap16.isEmpty();
        defaultedMap16.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 100);
        defaultedMap16.clear();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap(obj25);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.util.Set set37 = defaultedMap34.keySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) filterIterator38);
        java.lang.Object obj43 = defaultedMap7.get((java.lang.Object) filterIterator38);
        java.lang.String str44 = defaultedMap7.toString();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj50 = defaultedMap46.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b54 = defaultedMap52.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj56 = defaultedMap52.get((java.lang.Object) 1);
        boolean b58 = defaultedMap52.equals((java.lang.Object) 10L);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap61, (java.lang.Object) true);
        java.util.Set set64 = defaultedMap61.keySet();
        defaultedMap52.putAll((java.util.Map) defaultedMap61);
        boolean b67 = defaultedMap61.containsValue((java.lang.Object) 100);
        defaultedMap61.clear();
        boolean b69 = defaultedMap7.containsKey((java.lang.Object) defaultedMap61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + obj50 + "' != '" + 100.0f + "'", obj50.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 100.0f + "'", obj56.equals(100.0f));
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(map63);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) false);
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap6.isEmpty();
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator15.setIterator(iterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate26);
        java.lang.String str29 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0.0d);
        boolean b19 = defaultedMap16.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        boolean b24 = defaultedMap21.isEmpty();
        boolean b25 = defaultedMap16.containsKey((java.lang.Object) defaultedMap21);
        int i26 = defaultedMap16.size();
        java.lang.Object obj27 = defaultedMap6.remove((java.lang.Object) i26);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(i26 == 0);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 1);
        boolean b54 = defaultedMap48.equals((java.lang.Object) 10L);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) true);
        java.util.Set set60 = defaultedMap57.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 1);
        boolean b69 = defaultedMap63.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap63);
        boolean b74 = defaultedMap16.equals((java.lang.Object) defaultedMap63);
        java.lang.String str75 = defaultedMap63.toString();
        int i76 = defaultedMap63.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "{}" + "'", str75.equals("{}"));
        org.junit.Assert.assertTrue(i76 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) defaultedMap14, (java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set22 = defaultedMap21.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.lang.Object obj7 = defaultedMap1.remove((java.lang.Object) 0.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 1);
        boolean b54 = defaultedMap48.equals((java.lang.Object) 10L);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) true);
        java.util.Set set60 = defaultedMap57.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 1);
        boolean b69 = defaultedMap63.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap63);
        boolean b74 = defaultedMap16.equals((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap63.containsKey((java.lang.Object) defaultedMap76);
        boolean b78 = defaultedMap63.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b78 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.lang.Object obj3 = null;
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap(obj3);
        java.lang.Object obj5 = defaultedMap1.get(obj3);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.isEmpty();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        defaultedMap1.clear();
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) true);
        java.util.Set set6 = defaultedMap3.keySet();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (-1.0f));
        java.util.Set set9 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(set9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        int i19 = defaultedMap5.size();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap5, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 100);
        defaultedMap16.clear();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0.0d);
        java.util.Set set30 = defaultedMap27.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate33);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) filterIterator31);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator31);
        collections.Transformer transformer39 = null;
        try {
            java.util.Map map40 = collections.map.DefaultedMap.decorate(map38, transformer39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.Predicate predicate8 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate8);
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate10);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate17);
        collections.Predicate predicate19 = filterIterator13.getPredicate();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj31 = defaultedMap27.get((java.lang.Object) 1);
        boolean b33 = defaultedMap27.equals((java.lang.Object) 10L);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) true);
        java.util.Set set39 = defaultedMap36.keySet();
        defaultedMap27.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        boolean b48 = defaultedMap42.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map51 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 100.0f);
        defaultedMap27.putAll((java.util.Map) defaultedMap42);
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj54 = defaultedMap27.get((java.lang.Object) predicate53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate53);
        filterIterator6.setPredicate(predicate53);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        filterIterator60.setIterator(iterator63);
        collections.Predicate predicate65 = filterIterator60.getPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        filterIterator60.setPredicate(predicate66);
        collections.Predicate predicate68 = collections.PredicateUtils.truePredicate();
        filterIterator60.setPredicate(predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b73 = defaultedMap71.containsKey((java.lang.Object) false);
        boolean b75 = defaultedMap71.containsValue((java.lang.Object) (-1.0d));
        boolean b76 = defaultedMap71.isEmpty();
        boolean b78 = defaultedMap71.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate79 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator80 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator81 = filterIterator80.getIterator();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator83 = filterIterator82.getIterator();
        filterIterator80.setIterator(iterator83);
        collections.Predicate predicate85 = filterIterator80.getPredicate();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        filterIterator80.setPredicate(predicate86);
        java.util.Map map88 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap71, predicate79, predicate86);
        collections.iterators.FilterIterator filterIterator89 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60, predicate86);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate58, predicate86);
        java.util.Collection collection91 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + obj31 + "' != '" + 100.0f + "'", obj31.equals(100.0f));
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue("'" + obj54 + "' != '" + 100.0f + "'", obj54.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNull(iterator81);
        org.junit.Assert.assertNull(iterator83);
        org.junit.Assert.assertNull(predicate85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(map88);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(collection91);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        boolean b6 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        java.lang.Object obj9 = null;
        java.lang.Object obj10 = defaultedMap1.get(obj9);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.Transformer transformer15 = null;
        try {
            java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) true);
        boolean b37 = defaultedMap7.containsValue((java.lang.Object) defaultedMap34);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator41 = filterIterator40.getIterator();
        filterIterator38.setIterator(iterator41);
        collections.Predicate predicate43 = filterIterator38.getPredicate();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0.0d);
        java.util.Set set50 = defaultedMap47.keySet();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate53);
        boolean b55 = defaultedMap47.containsValue((java.lang.Object) filterIterator51);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate56);
        filterIterator38.setPredicate(predicate56);
        java.lang.Object obj59 = defaultedMap34.get((java.lang.Object) predicate56);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNull(predicate43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0f + "'", obj49.equals(100.0f));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100.0f + "'", obj59.equals(100.0f));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection15 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b19 = defaultedMap17.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj21 = defaultedMap17.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b25 = defaultedMap23.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj27 = defaultedMap23.get((java.lang.Object) 1);
        boolean b29 = defaultedMap23.equals((java.lang.Object) 10L);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map34 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, (java.lang.Object) true);
        java.util.Set set35 = defaultedMap32.keySet();
        defaultedMap23.putAll((java.util.Map) defaultedMap32);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) 1);
        boolean b50 = defaultedMap44.equals((java.lang.Object) 10L);
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) true);
        java.util.Set set56 = defaultedMap53.keySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj63 = defaultedMap59.get((java.lang.Object) 1);
        boolean b65 = defaultedMap59.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100.0f);
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj71 = defaultedMap44.get((java.lang.Object) predicate70);
        java.util.Set set72 = defaultedMap44.keySet();
        java.lang.Object obj73 = new java.lang.Object();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator75 = filterIterator74.getIterator();
        java.util.Iterator iterator76 = filterIterator74.getIterator();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        filterIterator74.setPredicate(predicate77);
        java.lang.Object obj79 = defaultedMap44.put(obj73, (java.lang.Object) filterIterator74);
        java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap32, obj79);
        defaultedMap1.putAll(map80);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100.0f + "'", obj21.equals(100.0f));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100.0f + "'", obj27.equals(100.0f));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100.0f + "'", obj42.equals(100.0f));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100.0f + "'", obj48.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100.0f + "'", obj63.equals(100.0f));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100.0f + "'", obj71.equals(100.0f));
        org.junit.Assert.assertNotNull(set72);
        org.junit.Assert.assertNull(iterator75);
        org.junit.Assert.assertNull(iterator76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(map80);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) defaultedMap14, (java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        int i22 = defaultedMap21.size();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        int i5 = defaultedMap1.size();
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        boolean b8 = defaultedMap1.isEmpty();
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 1);
        boolean b54 = defaultedMap48.equals((java.lang.Object) 10L);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) true);
        java.util.Set set60 = defaultedMap57.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 1);
        boolean b69 = defaultedMap63.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap63);
        boolean b74 = defaultedMap16.equals((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap63.containsKey((java.lang.Object) defaultedMap76);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b81 = defaultedMap79.containsValue((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b85 = defaultedMap83.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj87 = defaultedMap83.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap89 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b91 = defaultedMap89.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj93 = defaultedMap89.get((java.lang.Object) 1);
        boolean b95 = defaultedMap89.equals((java.lang.Object) 10L);
        defaultedMap83.putAll((java.util.Map) defaultedMap89);
        int i97 = defaultedMap83.size();
        boolean b98 = defaultedMap79.equals((java.lang.Object) defaultedMap83);
        boolean b99 = defaultedMap76.equals((java.lang.Object) b98);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertTrue("'" + obj87 + "' != '" + 100.0f + "'", obj87.equals(100.0f));
        org.junit.Assert.assertTrue(b91 == false);
        org.junit.Assert.assertTrue("'" + obj93 + "' != '" + 100.0f + "'", obj93.equals(100.0f));
        org.junit.Assert.assertTrue(b95 == false);
        org.junit.Assert.assertTrue(i97 == 0);
        org.junit.Assert.assertTrue(b98 == true);
        org.junit.Assert.assertTrue(b99 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 100);
        defaultedMap16.clear();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b29 = defaultedMap27.containsValue((java.lang.Object) 0.0f);
        java.lang.String str30 = defaultedMap27.toString();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b34 = defaultedMap32.containsKey((java.lang.Object) false);
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) (-1.0d));
        boolean b37 = defaultedMap32.isEmpty();
        boolean b39 = defaultedMap32.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate40 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        filterIterator41.setIterator(iterator44);
        collections.Predicate predicate46 = filterIterator41.getPredicate();
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        filterIterator41.setPredicate(predicate47);
        java.util.Map map49 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap32, predicate40, predicate47);
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator50.setPredicate(predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate47, predicate52);
        boolean b55 = defaultedMap16.containsValue((java.lang.Object) predicate47);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj59 = defaultedMap57.get((java.lang.Object) 0.0d);
        java.util.Collection collection60 = defaultedMap57.values();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap57);
        defaultedMap16.putAll((java.util.Map) defaultedMap61);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(iterator42);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(predicate46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 100.0f + "'", obj59.equals(100.0f));
        org.junit.Assert.assertNotNull(collection60);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.keySet();
        java.lang.String str5 = defaultedMap1.toString();
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "{}" + "'", str5.equals("{}"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = null;
        filterIterator0.setIterator(iterator2);
        org.junit.Assert.assertNull(iterator1);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.util.Set set12 = defaultedMap9.keySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate18);
        filterIterator0.setPredicate(predicate18);
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) true);
        java.util.Set set27 = defaultedMap24.keySet();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        filterIterator28.setIterator(iterator31);
        collections.Predicate predicate33 = filterIterator28.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate36, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        java.util.Iterator iterator48 = filterIterator46.getIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        java.util.Iterator iterator52 = filterIterator46.getIterator();
        filterIterator45.setIterator((java.util.Iterator) filterIterator46);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(iterator52);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator2 = filterIterator1.getIterator();
        java.util.Iterator iterator3 = filterIterator1.getIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator1.setPredicate(predicate4);
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicate4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNotNull(predicate4);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 100);
        defaultedMap16.clear();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0.0d);
        java.util.Set set30 = defaultedMap27.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate33);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) filterIterator31);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator31);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj42 = defaultedMap40.get((java.lang.Object) 0.0d);
        java.util.Collection collection43 = defaultedMap40.values();
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap40);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap46.clear();
        java.util.Set set48 = defaultedMap46.keySet();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) set48);
        defaultedMap44.putAll((java.util.Map) defaultedMap49);
        java.lang.Object obj51 = defaultedMap16.get((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100.0f + "'", obj42.equals(100.0f));
        org.junit.Assert.assertNotNull(collection43);
        org.junit.Assert.assertNotNull(set48);
        org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 100.0f + "'", obj51.equals(100.0f));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 1);
        boolean b18 = defaultedMap12.equals((java.lang.Object) 10L);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        boolean b20 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 1);
        boolean b54 = defaultedMap48.equals((java.lang.Object) 10L);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) true);
        java.util.Set set60 = defaultedMap57.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 1);
        boolean b69 = defaultedMap63.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap63);
        boolean b74 = defaultedMap16.equals((java.lang.Object) defaultedMap63);
        java.util.Set set75 = defaultedMap16.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertNotNull(set75);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) false);
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap6.isEmpty();
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator15.setIterator(iterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate26);
        boolean b30 = defaultedMap1.containsValue((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertTrue(b30 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 1);
        boolean b19 = defaultedMap13.equals((java.lang.Object) 10L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) true);
        java.util.Set set25 = defaultedMap22.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b36 = defaultedMap34.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj38 = defaultedMap34.get((java.lang.Object) 1);
        boolean b40 = defaultedMap34.equals((java.lang.Object) 10L);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap43, (java.lang.Object) true);
        java.util.Set set46 = defaultedMap43.keySet();
        defaultedMap34.putAll((java.util.Map) defaultedMap43);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b51 = defaultedMap49.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj53 = defaultedMap49.get((java.lang.Object) 1);
        boolean b55 = defaultedMap49.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map58 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 100.0f);
        defaultedMap34.putAll((java.util.Map) defaultedMap49);
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj61 = defaultedMap34.get((java.lang.Object) predicate60);
        java.util.Set set62 = defaultedMap34.keySet();
        java.lang.Object obj63 = new java.lang.Object();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator65 = filterIterator64.getIterator();
        java.util.Iterator iterator66 = filterIterator64.getIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator64.setPredicate(predicate67);
        java.lang.Object obj69 = defaultedMap34.put(obj63, (java.lang.Object) filterIterator64);
        java.util.Map map70 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, obj69);
        java.lang.Object obj71 = defaultedMap1.remove((java.lang.Object) map70);
        java.util.Collection collection72 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100.0f + "'", obj32.equals(100.0f));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + obj38 + "' != '" + 100.0f + "'", obj38.equals(100.0f));
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100.0f + "'", obj53.equals(100.0f));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100.0f + "'", obj61.equals(100.0f));
        org.junit.Assert.assertNotNull(set62);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(map70);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(collection72);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator9 = filterIterator8.getIterator();
        filterIterator6.setIterator(iterator9);
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) filterIterator6);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) true);
        java.util.Set set4 = defaultedMap1.entrySet();
        java.lang.Object obj5 = null;
        boolean b6 = defaultedMap1.equals(obj5);
        org.junit.Assert.assertNotNull(map3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator15.setIterator(iterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.util.Set set27 = defaultedMap24.keySet();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate30);
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) filterIterator28);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate33);
        filterIterator15.setPredicate(predicate33);
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) true);
        java.util.Set set42 = defaultedMap39.keySet();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        filterIterator43.setIterator(iterator46);
        collections.Predicate predicate48 = filterIterator43.getPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator43.setPredicate(predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate51, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate51);
        boolean b61 = defaultedMap6.containsValue((java.lang.Object) filterIterator15);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator15.setIterator(iterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj26 = defaultedMap24.get((java.lang.Object) 0.0d);
        java.util.Set set27 = defaultedMap24.keySet();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate30);
        boolean b32 = defaultedMap24.containsValue((java.lang.Object) filterIterator28);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate33);
        filterIterator15.setPredicate(predicate33);
        collections.Predicate predicate36 = null;
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) true);
        java.util.Set set42 = defaultedMap39.keySet();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator44 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        filterIterator43.setIterator(iterator46);
        collections.Predicate predicate48 = filterIterator43.getPredicate();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        filterIterator43.setPredicate(predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        filterIterator43.setPredicate(predicate51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate57);
        java.util.Map map59 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap39, predicate51, predicate57);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate51);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map64 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap62, (java.lang.Object) true);
        java.lang.Object obj65 = defaultedMap1.put((java.lang.Object) filterIterator15, (java.lang.Object) defaultedMap62);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(predicate48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(obj65);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (short) 1);
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 0.0d);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.util.Set set12 = defaultedMap9.keySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate18);
        filterIterator0.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        filterIterator21.setIterator(iterator24);
        filterIterator0.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) defaultedMap14, (java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        java.util.Set set21 = defaultedMap12.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) (-1.0f));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 1);
        boolean b54 = defaultedMap48.equals((java.lang.Object) 10L);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) true);
        java.util.Set set60 = defaultedMap57.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 1);
        boolean b69 = defaultedMap63.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap63);
        boolean b74 = defaultedMap16.equals((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap63.containsKey((java.lang.Object) defaultedMap76);
        defaultedMap63.clear();
        collections.Transformer transformer79 = null;
        try {
            java.util.Map map80 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, transformer79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator5.setPredicate(predicate7);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set11 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0.0d);
        boolean b8 = defaultedMap5.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj12 = defaultedMap10.get((java.lang.Object) 0.0d);
        boolean b13 = defaultedMap10.isEmpty();
        boolean b14 = defaultedMap5.containsKey((java.lang.Object) defaultedMap10);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) b14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj19 = defaultedMap17.get((java.lang.Object) 0.0d);
        boolean b20 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj24 = defaultedMap22.get((java.lang.Object) 0.0d);
        boolean b25 = defaultedMap22.isEmpty();
        boolean b26 = defaultedMap17.containsKey((java.lang.Object) defaultedMap22);
        boolean b27 = defaultedMap1.containsKey((java.lang.Object) defaultedMap22);
        boolean b28 = defaultedMap1.isEmpty();
        java.lang.String str29 = defaultedMap1.toString();
        java.util.Set set30 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100.0f + "'", obj7.equals(100.0f));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100.0f + "'", obj19.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 100.0f + "'", obj24.equals(100.0f));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        boolean b43 = defaultedMap22.containsValue((java.lang.Object) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Iterator iterator45 = filterIterator42.getIterator();
        try {
            filterIterator42.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(iterator45);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) defaultedMap14, (java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.Transformer transformer21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b40 = defaultedMap38.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj42 = defaultedMap38.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b46 = defaultedMap44.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj48 = defaultedMap44.get((java.lang.Object) 1);
        boolean b50 = defaultedMap44.equals((java.lang.Object) 10L);
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map55 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap53, (java.lang.Object) true);
        java.util.Set set56 = defaultedMap53.keySet();
        defaultedMap44.putAll((java.util.Map) defaultedMap53);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b61 = defaultedMap59.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj63 = defaultedMap59.get((java.lang.Object) 1);
        boolean b65 = defaultedMap59.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 100.0f);
        defaultedMap44.putAll((java.util.Map) defaultedMap59);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj73 = defaultedMap71.get((java.lang.Object) 0.0d);
        java.util.Set set74 = defaultedMap71.keySet();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator76 = filterIterator75.getIterator();
        collections.Predicate predicate77 = collections.PredicateUtils.notNullPredicate();
        filterIterator75.setPredicate(predicate77);
        boolean b79 = defaultedMap71.containsValue((java.lang.Object) filterIterator75);
        java.lang.Object obj80 = defaultedMap44.get((java.lang.Object) filterIterator75);
        boolean b81 = defaultedMap22.containsValue((java.lang.Object) filterIterator75);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 100.0f + "'", obj42.equals(100.0f));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100.0f + "'", obj48.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(set56);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertTrue("'" + obj63 + "' != '" + 100.0f + "'", obj63.equals(100.0f));
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue("'" + obj73 + "' != '" + 100.0f + "'", obj73.equals(100.0f));
        org.junit.Assert.assertNotNull(set74);
        org.junit.Assert.assertNull(iterator76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + obj80 + "' != '" + 100.0f + "'", obj80.equals(100.0f));
        org.junit.Assert.assertTrue(b81 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b11 = defaultedMap9.containsKey((java.lang.Object) false);
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) (-1.0d));
        boolean b14 = defaultedMap9.isEmpty();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 0.0f);
        java.lang.String str19 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.containsKey((java.lang.Object) false);
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) (-1.0d));
        boolean b26 = defaultedMap21.isEmpty();
        boolean b28 = defaultedMap21.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate29 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        filterIterator30.setIterator(iterator33);
        collections.Predicate predicate35 = filterIterator30.getPredicate();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator30.setPredicate(predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap21, predicate29, predicate36);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate36, predicate41);
        collections.Predicate predicate44 = collections.PredicateUtils.truePredicate();
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate36, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        filterIterator46.setIterator(iterator49);
        collections.Predicate predicate51 = filterIterator46.getPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 0.0d);
        java.util.Set set58 = defaultedMap55.keySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate61);
        boolean b63 = defaultedMap55.containsValue((java.lang.Object) filterIterator59);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate64);
        filterIterator46.setPredicate(predicate64);
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate36, predicate64);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNull(predicate35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100.0f + "'", obj57.equals(100.0f));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map67);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        filterIterator4.setIterator(iterator7);
        collections.Predicate predicate9 = filterIterator4.getPredicate();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator4.setPredicate(predicate10);
        collections.Predicate predicate12 = collections.PredicateUtils.truePredicate();
        filterIterator4.setPredicate(predicate12);
        java.lang.Object obj14 = defaultedMap1.remove((java.lang.Object) filterIterator4);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(predicate9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.util.Set set12 = defaultedMap9.keySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate18);
        filterIterator0.setPredicate(predicate18);
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) true);
        java.util.Set set27 = defaultedMap24.keySet();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        filterIterator28.setIterator(iterator31);
        collections.Predicate predicate33 = filterIterator28.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate36, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) false);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap26.isEmpty();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        filterIterator35.setIterator(iterator38);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate41);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj53 = defaultedMap51.get((java.lang.Object) 0.0d);
        java.util.Collection collection54 = defaultedMap51.values();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        java.util.Iterator iterator57 = filterIterator55.getIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.notNullPredicate();
        filterIterator55.setPredicate(predicate58);
        boolean b60 = defaultedMap51.equals((java.lang.Object) predicate58);
        java.lang.Object obj61 = defaultedMap20.put((java.lang.Object) defaultedMap47, (java.lang.Object) predicate58);
        java.lang.String str62 = defaultedMap47.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0f + "'", obj49.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj53 + "' != '" + 100.0f + "'", obj53.equals(100.0f));
        org.junit.Assert.assertNotNull(collection54);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj46 = defaultedMap42.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b50 = defaultedMap48.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj52 = defaultedMap48.get((java.lang.Object) 1);
        boolean b54 = defaultedMap48.equals((java.lang.Object) 10L);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map59 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap57, (java.lang.Object) true);
        java.util.Set set60 = defaultedMap57.keySet();
        defaultedMap48.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b65 = defaultedMap63.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj67 = defaultedMap63.get((java.lang.Object) 1);
        boolean b69 = defaultedMap63.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap63, (java.lang.Object) 100.0f);
        defaultedMap48.putAll((java.util.Map) defaultedMap63);
        boolean b74 = defaultedMap16.equals((java.lang.Object) defaultedMap63);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b77 = defaultedMap63.containsKey((java.lang.Object) defaultedMap76);
        java.lang.String str78 = defaultedMap63.toString();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + obj52 + "' != '" + 100.0f + "'", obj52.equals(100.0f));
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(map59);
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b65 == false);
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100.0f + "'", obj67.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue(b74 == true);
        org.junit.Assert.assertTrue(b77 == false);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap7.clear();
        java.util.Set set9 = defaultedMap7.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) set9);
        defaultedMap5.putAll((java.util.Map) defaultedMap10);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj17 = defaultedMap13.remove((java.lang.Object) 100L);
        java.lang.String str18 = defaultedMap13.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        defaultedMap13.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap25.containsKey((java.lang.Object) false);
        boolean b29 = defaultedMap25.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b33 = defaultedMap31.containsValue((java.lang.Object) 0.0f);
        java.util.Set set34 = defaultedMap31.keySet();
        boolean b35 = defaultedMap25.equals((java.lang.Object) set34);
        java.lang.Object obj36 = defaultedMap10.put((java.lang.Object) defaultedMap13, (java.lang.Object) set34);
        java.lang.Object obj37 = null;
        boolean b38 = defaultedMap10.containsValue(obj37);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue(b38 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        boolean b43 = defaultedMap22.containsValue((java.lang.Object) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 0.0f);
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) false);
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) (-1.0d));
        boolean b56 = defaultedMap51.isEmpty();
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        filterIterator60.setIterator(iterator63);
        collections.Predicate predicate65 = filterIterator60.getPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        filterIterator60.setPredicate(predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate59, predicate66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        filterIterator69.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate66, predicate71);
        filterIterator42.setPredicate(predicate71);
        try {
            java.lang.Object obj75 = filterIterator42.next();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj20 = defaultedMap16.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map33 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap31, (java.lang.Object) true);
        java.util.Set set34 = defaultedMap31.keySet();
        defaultedMap22.putAll((java.util.Map) defaultedMap31);
        boolean b37 = defaultedMap31.containsValue((java.lang.Object) 100);
        defaultedMap31.clear();
        java.lang.Object obj40 = defaultedMap31.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b44 = defaultedMap42.containsValue((java.lang.Object) 0.0f);
        java.lang.String str45 = defaultedMap42.toString();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b49 = defaultedMap47.containsKey((java.lang.Object) false);
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) (-1.0d));
        boolean b52 = defaultedMap47.isEmpty();
        boolean b54 = defaultedMap47.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate55 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator57 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        filterIterator56.setIterator(iterator59);
        collections.Predicate predicate61 = filterIterator56.getPredicate();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        filterIterator56.setPredicate(predicate62);
        java.util.Map map64 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate55, predicate62);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator66 = filterIterator65.getIterator();
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator65.setPredicate(predicate67);
        java.util.Map map69 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate62, predicate67);
        boolean b70 = defaultedMap31.containsValue((java.lang.Object) predicate62);
        collections.Predicate predicate71 = null;
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate62, predicate71);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100.0f + "'", obj40.equals(100.0f));
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNull(iterator57);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate61);
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNotNull(map64);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNotNull(map69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNotNull(map72);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b30 = defaultedMap28.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj32 = defaultedMap28.get((java.lang.Object) 1);
        boolean b34 = defaultedMap28.equals((java.lang.Object) 10L);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map39 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap37, (java.lang.Object) true);
        java.util.Set set40 = defaultedMap37.keySet();
        defaultedMap28.putAll((java.util.Map) defaultedMap37);
        boolean b42 = defaultedMap37.isEmpty();
        java.util.Set set43 = defaultedMap37.entrySet();
        java.lang.String str44 = defaultedMap37.toString();
        java.util.Set set45 = defaultedMap37.entrySet();
        boolean b46 = defaultedMap16.equals((java.lang.Object) set45);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100.0f + "'", obj32.equals(100.0f));
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertNotNull(set40);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNotNull(set43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue(b46 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.util.Set set37 = defaultedMap34.keySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) filterIterator38);
        java.lang.Object obj43 = defaultedMap7.get((java.lang.Object) filterIterator38);
        java.util.Iterator iterator44 = filterIterator38.getIterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertNull(iterator44);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator5.setPredicate(predicate7);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set11 = defaultedMap10.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set11);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        int i5 = defaultedMap1.size();
        int i6 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) i6);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 1);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 10L);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) true);
        java.util.Set set26 = defaultedMap23.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 1);
        boolean b35 = defaultedMap29.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap14.get((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate40);
        java.util.Iterator iterator43 = filterIterator42.getIterator();
        java.util.Iterator iterator44 = filterIterator42.getIterator();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0f + "'", obj33.equals(100.0f));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100.0f + "'", obj41.equals(100.0f));
        org.junit.Assert.assertNotNull(iterator43);
        org.junit.Assert.assertNotNull(iterator44);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        boolean b43 = defaultedMap22.containsValue((java.lang.Object) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        try {
            filterIterator44.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(iterator45);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        int i15 = defaultedMap1.size();
        collections.Transformer transformer16 = null;
        try {
            java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.util.Set set12 = defaultedMap9.keySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate18);
        filterIterator0.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        filterIterator21.setIterator(iterator24);
        filterIterator0.setIterator((java.util.Iterator) filterIterator21);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator27, predicate28);
        java.util.Iterator iterator30 = filterIterator27.getIterator();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(iterator30);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.String str15 = defaultedMap6.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{{}=-1.0}" + "'", str15.equals("{{}=-1.0}"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator7.getPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 1);
        boolean b27 = defaultedMap21.equals((java.lang.Object) 10L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) true);
        java.util.Set set33 = defaultedMap30.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap36.get((java.lang.Object) 1);
        boolean b42 = defaultedMap36.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj48 = defaultedMap21.get((java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate47);
        filterIterator0.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) filterIterator51);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100.0f + "'", obj19.equals(100.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100.0f + "'", obj40.equals(100.0f));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100.0f + "'", obj48.equals(100.0f));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set6 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(set6);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        java.lang.Object obj22 = defaultedMap7.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap24.clear();
        java.util.Set set26 = defaultedMap24.keySet();
        boolean b27 = defaultedMap7.containsValue((java.lang.Object) set26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b21 = defaultedMap16.isEmpty();
        java.util.Set set22 = defaultedMap16.entrySet();
        java.lang.String str23 = defaultedMap16.toString();
        boolean b25 = defaultedMap16.equals((java.lang.Object) (short) 0);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(set22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.util.Set set37 = defaultedMap34.keySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) filterIterator38);
        java.lang.Object obj43 = defaultedMap7.get((java.lang.Object) filterIterator38);
        collections.Predicate predicate44 = filterIterator38.getPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        filterIterator46.setIterator(iterator49);
        collections.Predicate predicate51 = filterIterator46.getPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 0.0d);
        java.util.Set set58 = defaultedMap55.keySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate61);
        boolean b63 = defaultedMap55.containsValue((java.lang.Object) filterIterator59);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate64);
        filterIterator46.setPredicate(predicate64);
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate67);
        collections.map.DefaultedMap defaultedMap70 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map72 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap70, (java.lang.Object) true);
        java.util.Set set73 = defaultedMap70.keySet();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator75 = filterIterator74.getIterator();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator77 = filterIterator76.getIterator();
        filterIterator74.setIterator(iterator77);
        collections.Predicate predicate79 = filterIterator74.getPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        filterIterator74.setPredicate(predicate80);
        collections.Predicate predicate82 = collections.PredicateUtils.truePredicate();
        filterIterator74.setPredicate(predicate82);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator85 = filterIterator84.getIterator();
        collections.Predicate predicate86 = collections.PredicateUtils.notNullPredicate();
        filterIterator84.setPredicate(predicate86);
        collections.Predicate predicate88 = collections.PredicateUtils.notNullPredicate();
        filterIterator84.setPredicate(predicate88);
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap70, predicate82, predicate88);
        collections.iterators.FilterIterator filterIterator91 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate82);
        filterIterator45.setPredicate(predicate82);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100.0f + "'", obj57.equals(100.0f));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertNull(iterator75);
        org.junit.Assert.assertNull(iterator77);
        org.junit.Assert.assertNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNull(iterator85);
        org.junit.Assert.assertNotNull(predicate86);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map90);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj16 = defaultedMap6.remove((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.util.Collection collection21 = defaultedMap18.values();
        java.lang.Object obj22 = defaultedMap6.get((java.lang.Object) collection21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b26 = defaultedMap24.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj28 = defaultedMap24.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b32 = defaultedMap30.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj34 = defaultedMap30.get((java.lang.Object) 1);
        boolean b36 = defaultedMap30.equals((java.lang.Object) 10L);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map41 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap39, (java.lang.Object) true);
        java.util.Set set42 = defaultedMap39.keySet();
        defaultedMap30.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b47 = defaultedMap45.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) 1);
        boolean b51 = defaultedMap45.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap45, (java.lang.Object) 100.0f);
        defaultedMap30.putAll((java.util.Map) defaultedMap45);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj57 = defaultedMap30.get((java.lang.Object) predicate56);
        defaultedMap6.putAll((java.util.Map) defaultedMap30);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(collection21);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100.0f + "'", obj22.equals(100.0f));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100.0f + "'", obj34.equals(100.0f));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(map41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0f + "'", obj49.equals(100.0f));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100.0f + "'", obj57.equals(100.0f));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        int i5 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj9 = defaultedMap7.get((java.lang.Object) 0.0d);
        java.util.Set set10 = defaultedMap7.keySet();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate13);
        boolean b15 = defaultedMap7.containsValue((java.lang.Object) filterIterator11);
        defaultedMap7.clear();
        defaultedMap7.clear();
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj12 = defaultedMap8.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b16 = defaultedMap14.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj18 = defaultedMap14.get((java.lang.Object) 1);
        boolean b20 = defaultedMap14.equals((java.lang.Object) 10L);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) true);
        java.util.Set set26 = defaultedMap23.keySet();
        defaultedMap14.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b31 = defaultedMap29.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj33 = defaultedMap29.get((java.lang.Object) 1);
        boolean b35 = defaultedMap29.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap29, (java.lang.Object) 100.0f);
        defaultedMap14.putAll((java.util.Map) defaultedMap29);
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj41 = defaultedMap14.get((java.lang.Object) predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate40);
        collections.map.DefaultedMap defaultedMap43 = new collections.map.DefaultedMap((java.lang.Object) filterIterator42);
        int i44 = defaultedMap43.size();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertTrue("'" + obj33 + "' != '" + 100.0f + "'", obj33.equals(100.0f));
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(map38);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100.0f + "'", obj41.equals(100.0f));
        org.junit.Assert.assertTrue(i44 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        boolean b7 = defaultedMap1.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap14, (java.lang.Object) true);
        java.util.Set set17 = defaultedMap14.keySet();
        java.lang.Object obj19 = defaultedMap12.put((java.lang.Object) defaultedMap14, (java.lang.Object) (-1.0f));
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        java.util.Iterator iterator23 = filterIterator21.getIterator();
        collections.Predicate predicate24 = collections.PredicateUtils.notNullPredicate();
        filterIterator21.setPredicate(predicate24);
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        java.util.Iterator iterator27 = filterIterator21.getIterator();
        boolean b28 = defaultedMap12.containsValue((java.lang.Object) filterIterator21);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNotNull(set17);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.util.Set set12 = defaultedMap9.keySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate18);
        filterIterator0.setPredicate(predicate18);
        collections.Predicate predicate21 = null;
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map26 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap24, (java.lang.Object) true);
        java.util.Set set27 = defaultedMap24.keySet();
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator29 = filterIterator28.getIterator();
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator31 = filterIterator30.getIterator();
        filterIterator28.setIterator(iterator31);
        collections.Predicate predicate33 = filterIterator28.getPredicate();
        collections.Predicate predicate34 = collections.PredicateUtils.notNullPredicate();
        filterIterator28.setPredicate(predicate34);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        filterIterator28.setPredicate(predicate36);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate42);
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate36, predicate42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate36);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate50);
        collections.Predicate predicate52 = filterIterator46.getPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator54 = filterIterator53.getIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate55);
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        filterIterator53.setPredicate(predicate57);
        collections.Predicate predicate59 = filterIterator53.getPredicate();
        collections.map.DefaultedMap defaultedMap61 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b63 = defaultedMap61.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj65 = defaultedMap61.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b69 = defaultedMap67.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj71 = defaultedMap67.get((java.lang.Object) 1);
        boolean b73 = defaultedMap67.equals((java.lang.Object) 10L);
        defaultedMap61.putAll((java.util.Map) defaultedMap67);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map78 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap76, (java.lang.Object) true);
        java.util.Set set79 = defaultedMap76.keySet();
        defaultedMap67.putAll((java.util.Map) defaultedMap76);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b84 = defaultedMap82.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj86 = defaultedMap82.get((java.lang.Object) 1);
        boolean b88 = defaultedMap82.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map91 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap82, (java.lang.Object) 100.0f);
        defaultedMap67.putAll((java.util.Map) defaultedMap82);
        collections.Predicate predicate93 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj94 = defaultedMap67.get((java.lang.Object) predicate93);
        collections.iterators.FilterIterator filterIterator95 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate93);
        filterIterator46.setPredicate(predicate93);
        collections.iterators.FilterIterator filterIterator97 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate93);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNotNull(set27);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNull(predicate33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNull(iterator54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertTrue("'" + obj65 + "' != '" + 100.0f + "'", obj65.equals(100.0f));
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue("'" + obj71 + "' != '" + 100.0f + "'", obj71.equals(100.0f));
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNotNull(map78);
        org.junit.Assert.assertNotNull(set79);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertTrue("'" + obj86 + "' != '" + 100.0f + "'", obj86.equals(100.0f));
        org.junit.Assert.assertTrue(b88 == false);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertTrue("'" + obj94 + "' != '" + 100.0f + "'", obj94.equals(100.0f));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        boolean b22 = defaultedMap16.containsValue((java.lang.Object) 100);
        defaultedMap16.clear();
        java.lang.Object obj25 = defaultedMap16.get((java.lang.Object) 10.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj29 = defaultedMap27.get((java.lang.Object) 0.0d);
        java.util.Set set30 = defaultedMap27.keySet();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate33);
        boolean b35 = defaultedMap27.containsValue((java.lang.Object) filterIterator31);
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate36);
        java.util.Map map38 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) filterIterator31);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) map38);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set7 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.Predicate predicate42 = filterIterator37.getPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate43);
        java.lang.Object obj45 = defaultedMap22.get((java.lang.Object) filterIterator37);
        java.util.Set set46 = defaultedMap22.keySet();
        boolean b47 = defaultedMap22.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
        org.junit.Assert.assertNotNull(set46);
        org.junit.Assert.assertTrue(b47 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        int i4 = defaultedMap1.size();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) true);
        java.lang.Object obj9 = defaultedMap1.remove((java.lang.Object) true);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap(obj9);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.remove((java.lang.Object) 100L);
        java.lang.String str6 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, (java.lang.Object) true);
        java.util.Set set13 = defaultedMap10.keySet();
        java.lang.Object obj15 = defaultedMap8.put((java.lang.Object) defaultedMap10, (java.lang.Object) (-1.0f));
        java.lang.Object obj16 = defaultedMap1.get((java.lang.Object) defaultedMap10);
        java.util.Set set17 = defaultedMap1.entrySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "{}" + "'", str6.equals("{}"));
        org.junit.Assert.assertNotNull(map12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertNotNull(set17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 100L);
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) true);
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.Object obj25 = defaultedMap6.get((java.lang.Object) (byte) 0);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) false);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap26.isEmpty();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        filterIterator35.setIterator(iterator38);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate41);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        boolean b4 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) 100L);
        java.lang.String str11 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) true);
        defaultedMap6.putAll((java.util.Map) defaultedMap13);
        defaultedMap1.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b21 = defaultedMap19.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj23 = defaultedMap19.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b27 = defaultedMap25.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj29 = defaultedMap25.get((java.lang.Object) 1);
        boolean b31 = defaultedMap25.equals((java.lang.Object) 10L);
        defaultedMap19.putAll((java.util.Map) defaultedMap25);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, (java.lang.Object) true);
        java.util.Set set37 = defaultedMap34.keySet();
        defaultedMap25.putAll((java.util.Map) defaultedMap34);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj44 = defaultedMap40.get((java.lang.Object) 1);
        boolean b46 = defaultedMap40.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) 100.0f);
        defaultedMap25.putAll((java.util.Map) defaultedMap40);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        java.util.Iterator iterator53 = filterIterator51.getIterator();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap40, (java.lang.Object) iterator53);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator56 = filterIterator55.getIterator();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator58 = filterIterator57.getIterator();
        filterIterator55.setIterator(iterator58);
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator(iterator58);
        boolean b61 = defaultedMap40.containsValue((java.lang.Object) filterIterator60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator60);
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        boolean b64 = defaultedMap13.containsValue((java.lang.Object) iterator63);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100.0f + "'", obj29.equals(100.0f));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100.0f + "'", obj44.equals(100.0f));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(iterator56);
        org.junit.Assert.assertNull(iterator58);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(iterator63);
        org.junit.Assert.assertTrue(b64 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection15 = defaultedMap1.values();
        java.util.Set set16 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertNotNull(set16);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        defaultedMap1.clear();
        int i5 = defaultedMap1.size();
        boolean b6 = defaultedMap1.isEmpty();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator7 = filterIterator6.getIterator();
        java.util.Iterator iterator8 = filterIterator6.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator6.setPredicate(predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate12 = filterIterator6.getPredicate();
        filterIterator0.setIterator((java.util.Iterator) filterIterator6);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator7);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate12);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.lang.String str15 = defaultedMap7.toString();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator21 = filterIterator20.getIterator();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        filterIterator20.setIterator(iterator23);
        collections.Predicate predicate25 = filterIterator20.getPredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator20.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap7, predicate18, predicate26);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator21);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 100L);
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) true);
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 1L);
        java.lang.Object obj26 = defaultedMap1.remove((java.lang.Object) defaultedMap25);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj7 = defaultedMap5.get((java.lang.Object) 0.0d);
        java.util.Collection collection8 = defaultedMap5.values();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap5);
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap9);
        int i11 = defaultedMap9.size();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100.0f + "'", obj7.equals(100.0f));
        org.junit.Assert.assertNotNull(collection8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100.0f + "'", obj10.equals(100.0f));
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj11 = defaultedMap9.get((java.lang.Object) 0.0d);
        java.util.Set set12 = defaultedMap9.keySet();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        collections.Predicate predicate15 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate15);
        boolean b17 = defaultedMap9.containsValue((java.lang.Object) filterIterator13);
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator13.setPredicate(predicate18);
        filterIterator0.setPredicate(predicate18);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator24 = filterIterator23.getIterator();
        filterIterator21.setIterator(iterator24);
        filterIterator0.setIterator((java.util.Iterator) filterIterator21);
        collections.Predicate predicate27 = filterIterator21.getPredicate();
        try {
            boolean b28 = filterIterator21.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertNotNull(set12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNull(predicate27);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator5.setPredicate(predicate7);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj13 = defaultedMap11.get((java.lang.Object) 0.0d);
        java.util.Set set14 = defaultedMap11.keySet();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b18 = defaultedMap16.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj20 = defaultedMap16.remove((java.lang.Object) 100L);
        java.lang.String str21 = defaultedMap16.toString();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap23, (java.lang.Object) true);
        defaultedMap16.putAll((java.util.Map) defaultedMap23);
        java.util.Map map27 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) defaultedMap16);
        java.lang.Object obj28 = defaultedMap1.remove((java.lang.Object) defaultedMap11);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        java.util.Iterator iterator31 = filterIterator29.getIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        collections.Predicate predicate36 = collections.PredicateUtils.notNullPredicate();
        filterIterator34.setPredicate(predicate36);
        java.util.Map map38 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate32, predicate36);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj13 + "' != '" + 100.0f + "'", obj13.equals(100.0f));
        org.junit.Assert.assertNotNull(set14);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNotNull(map27);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map38);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        boolean b43 = defaultedMap22.containsValue((java.lang.Object) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        try {
            boolean b46 = filterIterator45.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.util.Set set10 = defaultedMap7.keySet();
        boolean b11 = defaultedMap1.equals((java.lang.Object) set10);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) b11);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        java.util.Set set9 = defaultedMap6.keySet();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.remove((java.lang.Object) 100L);
        java.lang.String str16 = defaultedMap11.toString();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map20 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) true);
        defaultedMap11.putAll((java.util.Map) defaultedMap18);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, (java.lang.Object) defaultedMap11);
        boolean b23 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.lang.String str24 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertNotNull(set9);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "{}" + "'", str16.equals("{}"));
        org.junit.Assert.assertNotNull(map20);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        defaultedMap1.clear();
        java.util.Set set5 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(set5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) false);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap26.isEmpty();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        filterIterator35.setIterator(iterator38);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate41);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        java.util.Set set46 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNotNull(set46);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator6 = filterIterator5.getIterator();
        collections.Predicate predicate7 = collections.PredicateUtils.notNullPredicate();
        filterIterator5.setPredicate(predicate7);
        boolean b9 = defaultedMap1.containsValue((java.lang.Object) filterIterator5);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator12 = filterIterator11.getIterator();
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator14 = filterIterator13.getIterator();
        filterIterator11.setIterator(iterator14);
        collections.Predicate predicate16 = filterIterator11.getPredicate();
        collections.Predicate predicate17 = collections.PredicateUtils.notNullPredicate();
        filterIterator11.setPredicate(predicate17);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj22 = defaultedMap20.get((java.lang.Object) 0.0d);
        java.util.Set set23 = defaultedMap20.keySet();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate26);
        boolean b28 = defaultedMap20.containsValue((java.lang.Object) filterIterator24);
        collections.Predicate predicate29 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate29);
        filterIterator11.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator35 = filterIterator34.getIterator();
        filterIterator32.setIterator(iterator35);
        filterIterator11.setIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator38, predicate39);
        java.lang.Object obj41 = defaultedMap10.get((java.lang.Object) filterIterator38);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertNull(iterator14);
        org.junit.Assert.assertNull(predicate16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100.0f + "'", obj22.equals(100.0f));
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNull(iterator33);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(obj41);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator3 = filterIterator2.getIterator();
        filterIterator0.setIterator(iterator3);
        java.util.Iterator iterator5 = filterIterator0.getIterator();
        try {
            filterIterator0.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        java.util.Set set15 = defaultedMap1.entrySet();
        java.util.Collection collection16 = defaultedMap1.values();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNotNull(collection16);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator(iterator40);
        boolean b43 = defaultedMap22.containsValue((java.lang.Object) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        java.util.Iterator iterator46 = filterIterator45.getIterator();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(iterator46);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj10 = defaultedMap6.remove((java.lang.Object) 100L);
        java.lang.String str11 = defaultedMap6.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap13, (java.lang.Object) true);
        defaultedMap6.putAll((java.util.Map) defaultedMap13);
        java.util.Map map17 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) defaultedMap6);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap6.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 0.0d);
        java.util.Set set15 = defaultedMap12.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate18);
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) filterIterator16);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator16);
        int i22 = defaultedMap1.size();
        collections.Factory factory23 = null;
        try {
            java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100.0f + "'", obj14.equals(100.0f));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue(i22 == 0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b8 = defaultedMap6.containsKey((java.lang.Object) false);
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) (-1.0d));
        boolean b11 = defaultedMap6.isEmpty();
        boolean b13 = defaultedMap6.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate14 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator16 = filterIterator15.getIterator();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator18 = filterIterator17.getIterator();
        filterIterator15.setIterator(iterator18);
        collections.Predicate predicate20 = filterIterator15.getPredicate();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator15.setPredicate(predicate21);
        java.util.Map map23 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate14, predicate21);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        filterIterator24.setPredicate(predicate26);
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate21, predicate26);
        java.util.Collection collection29 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNull(iterator16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(predicate20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(collection29);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator5 = filterIterator4.getIterator();
        boolean b6 = defaultedMap1.containsValue((java.lang.Object) filterIterator4);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj12 = defaultedMap1.get((java.lang.Object) defaultedMap8);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(iterator5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue("'" + obj12 + "' != '" + 100.0f + "'", obj12.equals(100.0f));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap6.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b14 = defaultedMap12.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj16 = defaultedMap12.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap18.get((java.lang.Object) 1);
        boolean b24 = defaultedMap18.equals((java.lang.Object) 10L);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map29 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap27, (java.lang.Object) true);
        java.util.Set set30 = defaultedMap27.keySet();
        defaultedMap18.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b35 = defaultedMap33.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj37 = defaultedMap33.get((java.lang.Object) 1);
        boolean b39 = defaultedMap33.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map42 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) 100.0f);
        defaultedMap18.putAll((java.util.Map) defaultedMap33);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator45 = filterIterator44.getIterator();
        java.util.Iterator iterator46 = filterIterator44.getIterator();
        java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) iterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator51 = filterIterator50.getIterator();
        filterIterator48.setIterator(iterator51);
        collections.Predicate predicate53 = filterIterator48.getPredicate();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate54);
        java.lang.Object obj56 = defaultedMap33.get((java.lang.Object) filterIterator48);
        defaultedMap1.putAll((java.util.Map) defaultedMap33);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj16 + "' != '" + 100.0f + "'", obj16.equals(100.0f));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 100.0f + "'", obj22.equals(100.0f));
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNull(iterator45);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator51);
        org.junit.Assert.assertNull(predicate53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue("'" + obj56 + "' != '" + 100.0f + "'", obj56.equals(100.0f));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate4);
        java.util.Iterator iterator6 = filterIterator0.getIterator();
        java.util.Iterator iterator7 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator(iterator7);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(iterator6);
        org.junit.Assert.assertNull(iterator7);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsKey((java.lang.Object) false);
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) (-1.0d));
        boolean b27 = defaultedMap22.isEmpty();
        boolean b29 = defaultedMap22.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        filterIterator31.setIterator(iterator34);
        collections.Predicate predicate36 = filterIterator31.getPredicate();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate37);
        java.util.Map map39 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap22, predicate30, predicate37);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj44 = defaultedMap42.get((java.lang.Object) 0.0d);
        java.util.Set set45 = defaultedMap42.keySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0.0d);
        boolean b50 = defaultedMap47.isEmpty();
        boolean b51 = defaultedMap42.equals((java.lang.Object) b50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b55 = defaultedMap53.containsKey((java.lang.Object) false);
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) (-1.0d));
        boolean b58 = defaultedMap53.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b62 = defaultedMap60.containsValue((java.lang.Object) 0.0f);
        java.lang.String str63 = defaultedMap60.toString();
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b67 = defaultedMap65.containsKey((java.lang.Object) false);
        boolean b69 = defaultedMap65.containsValue((java.lang.Object) (-1.0d));
        boolean b70 = defaultedMap65.isEmpty();
        boolean b72 = defaultedMap65.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate73 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator75 = filterIterator74.getIterator();
        collections.iterators.FilterIterator filterIterator76 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator77 = filterIterator76.getIterator();
        filterIterator74.setIterator(iterator77);
        collections.Predicate predicate79 = filterIterator74.getPredicate();
        collections.Predicate predicate80 = collections.PredicateUtils.notNullPredicate();
        filterIterator74.setPredicate(predicate80);
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap65, predicate73, predicate80);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator84 = filterIterator83.getIterator();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        filterIterator83.setPredicate(predicate85);
        java.util.Map map87 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap60, predicate80, predicate85);
        collections.Predicate predicate88 = collections.PredicateUtils.truePredicate();
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap53, predicate80, predicate88);
        defaultedMap42.putAll((java.util.Map) defaultedMap53);
        boolean b91 = defaultedMap16.equals((java.lang.Object) defaultedMap42);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(predicate36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(map39);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100.0f + "'", obj44.equals(100.0f));
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0f + "'", obj49.equals(100.0f));
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + str63 + "' != '" + "{}" + "'", str63.equals("{}"));
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(predicate73);
        org.junit.Assert.assertNull(iterator75);
        org.junit.Assert.assertNull(iterator77);
        org.junit.Assert.assertNull(predicate79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNull(iterator84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(map89);
        org.junit.Assert.assertTrue(b91 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        defaultedMap1.clear();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        java.util.Iterator iterator9 = filterIterator7.getIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate10);
        java.util.Iterator iterator12 = filterIterator7.getIterator();
        boolean b13 = defaultedMap1.containsKey((java.lang.Object) filterIterator7);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNull(iterator9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(iterator12);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        boolean b6 = defaultedMap1.isEmpty();
        java.util.Collection collection7 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(collection7);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Set set4 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj8 = defaultedMap6.get((java.lang.Object) 0.0d);
        boolean b9 = defaultedMap6.isEmpty();
        boolean b10 = defaultedMap1.equals((java.lang.Object) b9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj14 = defaultedMap12.get((java.lang.Object) 0.0d);
        java.util.Set set15 = defaultedMap12.keySet();
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator17 = filterIterator16.getIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        filterIterator16.setPredicate(predicate18);
        boolean b20 = defaultedMap12.containsValue((java.lang.Object) filterIterator16);
        java.lang.Object obj21 = defaultedMap1.remove((java.lang.Object) filterIterator16);
        java.lang.String str22 = defaultedMap1.toString();
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100.0f + "'", obj8.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100.0f + "'", obj14.equals(100.0f));
        org.junit.Assert.assertNotNull(set15);
        org.junit.Assert.assertNull(iterator17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "{}" + "'", str22.equals("{}"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj36 = defaultedMap34.get((java.lang.Object) 0.0d);
        java.util.Set set37 = defaultedMap34.keySet();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        boolean b42 = defaultedMap34.containsValue((java.lang.Object) filterIterator38);
        java.lang.Object obj43 = defaultedMap7.get((java.lang.Object) filterIterator38);
        collections.Predicate predicate44 = filterIterator38.getPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b48 = defaultedMap46.containsValue((java.lang.Object) 0.0f);
        java.lang.String str49 = defaultedMap46.toString();
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b53 = defaultedMap51.containsKey((java.lang.Object) false);
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) (-1.0d));
        boolean b56 = defaultedMap51.isEmpty();
        boolean b58 = defaultedMap51.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate59 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator60 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator61 = filterIterator60.getIterator();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        filterIterator60.setIterator(iterator63);
        collections.Predicate predicate65 = filterIterator60.getPredicate();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        filterIterator60.setPredicate(predicate66);
        java.util.Map map68 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate59, predicate66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        filterIterator69.setPredicate(predicate71);
        java.util.Map map73 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap46, predicate66, predicate71);
        filterIterator38.setPredicate(predicate66);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertTrue("'" + obj36 + "' != '" + 100.0f + "'", obj36.equals(100.0f));
        org.junit.Assert.assertNotNull(set37);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj43 + "' != '" + 100.0f + "'", obj43.equals(100.0f));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue("'" + str49 + "' != '" + "{}" + "'", str49.equals("{}"));
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertTrue(b56 == true);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertNull(iterator61);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNull(predicate65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map73);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap13.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj17 = defaultedMap13.get((java.lang.Object) 1);
        boolean b19 = defaultedMap13.equals((java.lang.Object) 10L);
        defaultedMap7.putAll((java.util.Map) defaultedMap13);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) true);
        java.util.Set set25 = defaultedMap22.keySet();
        defaultedMap13.putAll((java.util.Map) defaultedMap22);
        boolean b27 = defaultedMap22.isEmpty();
        java.util.Set set28 = defaultedMap22.entrySet();
        java.lang.String str29 = defaultedMap22.toString();
        defaultedMap1.putAll((java.util.Map) defaultedMap22);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100.0f + "'", obj17.equals(100.0f));
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertNotNull(set25);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(set28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate2);
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate4);
        collections.Predicate predicate6 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator8 = filterIterator7.getIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate9);
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        filterIterator7.setPredicate(predicate11);
        collections.Predicate predicate13 = filterIterator7.getPredicate();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj19 = defaultedMap15.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b23 = defaultedMap21.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj25 = defaultedMap21.get((java.lang.Object) 1);
        boolean b27 = defaultedMap21.equals((java.lang.Object) 10L);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map32 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap30, (java.lang.Object) true);
        java.util.Set set33 = defaultedMap30.keySet();
        defaultedMap21.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b38 = defaultedMap36.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj40 = defaultedMap36.get((java.lang.Object) 1);
        boolean b42 = defaultedMap36.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map45 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 100.0f);
        defaultedMap21.putAll((java.util.Map) defaultedMap36);
        collections.Predicate predicate47 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj48 = defaultedMap21.get((java.lang.Object) predicate47);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate47);
        filterIterator0.setPredicate(predicate47);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator53 = filterIterator52.getIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        filterIterator52.setPredicate(predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate54);
        collections.map.DefaultedMap defaultedMap58 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj60 = defaultedMap58.get((java.lang.Object) 0.0d);
        java.util.Set set61 = defaultedMap58.keySet();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator63 = filterIterator62.getIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator62.setPredicate(predicate64);
        boolean b66 = defaultedMap58.containsValue((java.lang.Object) filterIterator62);
        collections.Predicate predicate67 = collections.PredicateUtils.notNullPredicate();
        filterIterator62.setPredicate(predicate67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator70 = filterIterator69.getIterator();
        collections.Predicate predicate71 = collections.PredicateUtils.notNullPredicate();
        filterIterator69.setPredicate(predicate71);
        filterIterator62.setPredicate(predicate71);
        collections.iterators.FilterIterator filterIterator74 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate71);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNotNull(predicate2);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(iterator8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100.0f + "'", obj19.equals(100.0f));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100.0f + "'", obj25.equals(100.0f));
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertNotNull(set33);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + obj40 + "' != '" + 100.0f + "'", obj40.equals(100.0f));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNotNull(map45);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue("'" + obj48 + "' != '" + 100.0f + "'", obj48.equals(100.0f));
        org.junit.Assert.assertNull(iterator53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100.0f + "'", obj60.equals(100.0f));
        org.junit.Assert.assertNotNull(set61);
        org.junit.Assert.assertNull(iterator63);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate67);
        org.junit.Assert.assertNull(iterator70);
        org.junit.Assert.assertNotNull(predicate71);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj4 = null;
        java.lang.Object obj5 = defaultedMap1.get(obj4);
        java.util.Set set6 = defaultedMap1.entrySet();
        boolean b7 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap7.get((java.lang.Object) predicate33);
        java.util.Set set35 = defaultedMap7.keySet();
        java.lang.Object obj36 = new java.lang.Object();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate40);
        java.lang.Object obj42 = defaultedMap7.put(obj36, (java.lang.Object) filterIterator37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 0.0d);
        java.util.Set set47 = defaultedMap44.keySet();
        int i48 = defaultedMap44.size();
        defaultedMap7.putAll((java.util.Map) defaultedMap44);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100.0f + "'", obj34.equals(100.0f));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertNotNull(set47);
        org.junit.Assert.assertTrue(i48 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        java.util.Collection collection6 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap8.containsKey((java.lang.Object) false);
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) (-1.0d));
        boolean b13 = defaultedMap8.isEmpty();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b17 = defaultedMap15.containsValue((java.lang.Object) 0.0f);
        java.lang.String str18 = defaultedMap15.toString();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b22 = defaultedMap20.containsKey((java.lang.Object) false);
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) (-1.0d));
        boolean b25 = defaultedMap20.isEmpty();
        boolean b27 = defaultedMap20.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator30 = filterIterator29.getIterator();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        filterIterator29.setIterator(iterator32);
        collections.Predicate predicate34 = filterIterator29.getPredicate();
        collections.Predicate predicate35 = collections.PredicateUtils.notNullPredicate();
        filterIterator29.setPredicate(predicate35);
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap20, predicate28, predicate35);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator39 = filterIterator38.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator38.setPredicate(predicate40);
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate35, predicate40);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate35, predicate43);
        java.lang.Object obj45 = defaultedMap1.get((java.lang.Object) predicate43);
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(collection6);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(iterator30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNull(predicate34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.util.Iterator iterator0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator(iterator0);
        collections.map.DefaultedMap defaultedMap2 = new collections.map.DefaultedMap((java.lang.Object) iterator0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        java.lang.Object obj34 = defaultedMap7.get((java.lang.Object) predicate33);
        java.util.Set set35 = defaultedMap7.keySet();
        java.lang.Object obj36 = new java.lang.Object();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        java.util.Iterator iterator39 = filterIterator37.getIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate40);
        java.lang.Object obj42 = defaultedMap7.put(obj36, (java.lang.Object) filterIterator37);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj46 = defaultedMap44.get((java.lang.Object) 0.0d);
        java.util.Collection collection47 = defaultedMap44.values();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate51);
        boolean b53 = defaultedMap44.equals((java.lang.Object) predicate51);
        filterIterator37.setPredicate(predicate51);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100.0f + "'", obj34.equals(100.0f));
        org.junit.Assert.assertNotNull(set35);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj42);
        org.junit.Assert.assertTrue("'" + obj46 + "' != '" + 100.0f + "'", obj46.equals(100.0f));
        org.junit.Assert.assertNotNull(collection47);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        boolean b6 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate9 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator11 = filterIterator10.getIterator();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator13 = filterIterator12.getIterator();
        filterIterator10.setIterator(iterator13);
        collections.Predicate predicate15 = filterIterator10.getPredicate();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        filterIterator10.setPredicate(predicate16);
        java.util.Map map18 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate9, predicate16);
        java.lang.Object obj20 = defaultedMap1.get((java.lang.Object) 100L);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(iterator11);
        org.junit.Assert.assertNull(iterator13);
        org.junit.Assert.assertNull(predicate15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100.0f + "'", obj20.equals(100.0f));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) false);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap26.isEmpty();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        filterIterator35.setIterator(iterator38);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate41);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator47 = filterIterator46.getIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        filterIterator46.setIterator(iterator49);
        collections.Predicate predicate51 = filterIterator46.getPredicate();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        filterIterator46.setPredicate(predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj57 = defaultedMap55.get((java.lang.Object) 0.0d);
        java.util.Set set58 = defaultedMap55.keySet();
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator60 = filterIterator59.getIterator();
        collections.Predicate predicate61 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate61);
        boolean b63 = defaultedMap55.containsValue((java.lang.Object) filterIterator59);
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        filterIterator59.setPredicate(predicate64);
        filterIterator46.setPredicate(predicate64);
        collections.Predicate predicate67 = null;
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46, predicate67);
        java.lang.Object obj69 = defaultedMap1.remove((java.lang.Object) filterIterator46);
        try {
            boolean b70 = filterIterator46.hasNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(predicate51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue("'" + obj57 + "' != '" + 100.0f + "'", obj57.equals(100.0f));
        org.junit.Assert.assertNotNull(set58);
        org.junit.Assert.assertNull(iterator60);
        org.junit.Assert.assertNotNull(predicate61);
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(obj69);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) true);
        java.util.Set set19 = defaultedMap16.keySet();
        defaultedMap7.putAll((java.util.Map) defaultedMap16);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b24 = defaultedMap22.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj26 = defaultedMap22.get((java.lang.Object) 1);
        boolean b28 = defaultedMap22.equals((java.lang.Object) 10L);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) 100.0f);
        defaultedMap7.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator34 = filterIterator33.getIterator();
        java.util.Iterator iterator35 = filterIterator33.getIterator();
        java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, (java.lang.Object) iterator35);
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        filterIterator37.setIterator(iterator40);
        collections.Predicate predicate42 = filterIterator37.getPredicate();
        collections.Predicate predicate43 = collections.PredicateUtils.notNullPredicate();
        filterIterator37.setPredicate(predicate43);
        java.lang.Object obj45 = defaultedMap22.get((java.lang.Object) filterIterator37);
        java.lang.Object obj47 = defaultedMap22.get((java.lang.Object) 'a');
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + obj26 + "' != '" + 100.0f + "'", obj26.equals(100.0f));
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNull(iterator34);
        org.junit.Assert.assertNull(iterator35);
        org.junit.Assert.assertNotNull(map36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(predicate42);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100.0f + "'", obj45.equals(100.0f));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100.0f + "'", obj47.equals(100.0f));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.PredicateUtils predicateUtils0 = new collections.PredicateUtils();
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) predicateUtils0);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap1.clear();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        boolean b26 = defaultedMap20.containsValue((java.lang.Object) 100);
        boolean b27 = defaultedMap1.equals((java.lang.Object) 100);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap29.clear();
        java.util.Set set31 = defaultedMap29.keySet();
        java.lang.Object obj32 = defaultedMap1.get((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(set31);
        org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 100.0f + "'", obj32.equals(100.0f));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsKey((java.lang.Object) false);
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) (-1.0d));
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b10 = defaultedMap8.containsValue((java.lang.Object) 0.0f);
        java.lang.String str11 = defaultedMap8.toString();
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b15 = defaultedMap13.containsKey((java.lang.Object) false);
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) (-1.0d));
        boolean b18 = defaultedMap13.isEmpty();
        boolean b20 = defaultedMap13.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate21 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator23 = filterIterator22.getIterator();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator25 = filterIterator24.getIterator();
        filterIterator22.setIterator(iterator25);
        collections.Predicate predicate27 = filterIterator22.getPredicate();
        collections.Predicate predicate28 = collections.PredicateUtils.notNullPredicate();
        filterIterator22.setPredicate(predicate28);
        java.util.Map map30 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate21, predicate28);
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator32 = filterIterator31.getIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        filterIterator31.setPredicate(predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate28, predicate33);
        collections.Predicate predicate36 = collections.PredicateUtils.truePredicate();
        java.util.Map map37 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate28, predicate36);
        java.util.Set set38 = defaultedMap1.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator25);
        org.junit.Assert.assertNull(predicate27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map30);
        org.junit.Assert.assertNull(iterator32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertNotNull(set38);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) true);
        java.util.Set set11 = defaultedMap8.keySet();
        java.lang.Object obj13 = defaultedMap6.put((java.lang.Object) defaultedMap8, (java.lang.Object) (-1.0f));
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) defaultedMap6);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj18 = defaultedMap16.get((java.lang.Object) 0.0d);
        java.util.Set set19 = defaultedMap16.keySet();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj23 = defaultedMap21.get((java.lang.Object) 0.0d);
        java.util.Set set24 = defaultedMap21.keySet();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj30 = defaultedMap26.remove((java.lang.Object) 100L);
        java.lang.String str31 = defaultedMap26.toString();
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map35 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap33, (java.lang.Object) true);
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        java.util.Map map37 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap21, (java.lang.Object) defaultedMap26);
        boolean b38 = defaultedMap16.containsKey((java.lang.Object) defaultedMap21);
        collections.map.DefaultedMap defaultedMap40 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b42 = defaultedMap40.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj43 = null;
        java.lang.Object obj44 = defaultedMap40.get(obj43);
        defaultedMap21.putAll((java.util.Map) defaultedMap40);
        defaultedMap6.putAll((java.util.Map) defaultedMap40);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(map10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 100.0f + "'", obj18.equals(100.0f));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 100.0f + "'", obj23.equals(100.0f));
        org.junit.Assert.assertNotNull(set24);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "{}" + "'", str31.equals("{}"));
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(map37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100.0f + "'", obj44.equals(100.0f));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        boolean b4 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        int i19 = defaultedMap5.size();
        boolean b20 = defaultedMap1.equals((java.lang.Object) defaultedMap5);
        java.util.Set set21 = defaultedMap5.keySet();
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(i19 == 0);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(set21);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b3 = defaultedMap1.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b9 = defaultedMap7.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj11 = defaultedMap7.get((java.lang.Object) 1);
        boolean b13 = defaultedMap7.equals((java.lang.Object) 10L);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection15 = defaultedMap1.values();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b20 = defaultedMap18.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj22 = defaultedMap18.remove((java.lang.Object) 100L);
        java.lang.String str23 = defaultedMap18.toString();
        boolean b24 = defaultedMap18.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj28 = defaultedMap26.get((java.lang.Object) 0.0d);
        java.util.Collection collection29 = defaultedMap26.values();
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap26);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        defaultedMap32.clear();
        java.util.Set set34 = defaultedMap32.keySet();
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) set34);
        defaultedMap30.putAll((java.util.Map) defaultedMap35);
        java.lang.Object obj37 = defaultedMap18.get((java.lang.Object) defaultedMap35);
        defaultedMap1.putAll((java.util.Map) defaultedMap35);
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100.0f + "'", obj5.equals(100.0f));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100.0f + "'", obj11.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + 100.0f + "'", obj28.equals(100.0f));
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNotNull(set34);
        org.junit.Assert.assertTrue("'" + obj37 + "' != '" + 100.0f + "'", obj37.equals(100.0f));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj3 = defaultedMap1.get((java.lang.Object) 0.0d);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b7 = defaultedMap5.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj9 = defaultedMap5.get((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsValue((java.lang.Object) 0.0f);
        java.lang.Object obj15 = defaultedMap11.get((java.lang.Object) 1);
        boolean b17 = defaultedMap11.equals((java.lang.Object) 10L);
        defaultedMap5.putAll((java.util.Map) defaultedMap11);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap20, (java.lang.Object) true);
        java.util.Set set23 = defaultedMap20.keySet();
        defaultedMap11.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b28 = defaultedMap26.containsKey((java.lang.Object) false);
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) (-1.0d));
        boolean b31 = defaultedMap26.isEmpty();
        boolean b33 = defaultedMap26.containsKey((java.lang.Object) 100.0f);
        collections.Predicate predicate34 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator36 = filterIterator35.getIterator();
        collections.iterators.FilterIterator filterIterator37 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator38 = filterIterator37.getIterator();
        filterIterator35.setIterator(iterator38);
        collections.Predicate predicate40 = filterIterator35.getPredicate();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        filterIterator35.setPredicate(predicate41);
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate34, predicate41);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        defaultedMap1.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.lang.Object obj49 = defaultedMap47.get((java.lang.Object) 0.0d);
        java.util.Set set50 = defaultedMap47.keySet();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator52 = filterIterator51.getIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate53);
        boolean b55 = defaultedMap47.containsValue((java.lang.Object) filterIterator51);
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        filterIterator51.setPredicate(predicate56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator59 = filterIterator58.getIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        filterIterator58.setPredicate(predicate60);
        filterIterator51.setPredicate(predicate60);
        boolean b63 = defaultedMap1.containsKey((java.lang.Object) predicate60);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100.0f + "'", obj3.equals(100.0f));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100.0f + "'", obj9.equals(100.0f));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100.0f + "'", obj15.equals(100.0f));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertNull(iterator36);
        org.junit.Assert.assertNull(iterator38);
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100.0f + "'", obj49.equals(100.0f));
        org.junit.Assert.assertNotNull(set50);
        org.junit.Assert.assertNull(iterator52);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b63 == false);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        java.util.Map map5 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap3, (java.lang.Object) true);
        java.util.Set set6 = defaultedMap3.keySet();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) defaultedMap3, (java.lang.Object) (-1.0f));
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100.0f);
        boolean b13 = defaultedMap11.containsKey((java.lang.Object) false);
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) (-1.0d));
        java.util.Set set16 = defaultedMap11.keySet();
        boolean b17 = defaultedMap1.containsValue((java.lang.Object) defaultedMap11);
        collections.Transformer transformer18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, transformer18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(map5);
        org.junit.Assert.assertNotNull(set6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue(b17 == false);
    }
}

