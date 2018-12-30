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
        collections.Predicate predicate1 = collections.PredicateUtils.truePredicate();
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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.util.Map map0 = null;
        collections.iterators.FilterIterator filterIterator1 = new collections.iterators.FilterIterator();
        collections.Predicate predicate2 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator1, predicate2);
        try {
            java.util.Map map4 = collections.map.DefaultedMap.decorate(map0, (java.lang.Object) predicate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(predicate2);
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
        java.lang.Class class0 = null;
        try {
            collections.Predicate predicate1 = collections.PredicateUtils.instanceofPredicate(class0);
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
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.Transformer transformer13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        defaultedMap1.clear();
        collections.Factory factory7 = null;
        try {
            java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        defaultedMap7.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator15);
        java.util.Map map20 = collections.map.DefaultedMap.decorate(map18, (java.lang.Object) "");
        collections.Factory factory21 = null;
        try {
            java.util.Map map22 = collections.map.DefaultedMap.decorate(map18, factory21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(map20);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        boolean b13 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) defaultedMap6);
        java.lang.String str9 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{ ={}}" + "'", str9.equals("{ ={}}"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        boolean b36 = defaultedMap14.containsValue((java.lang.Object) 10.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b36 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        boolean b15 = defaultedMap11.containsValue((java.lang.Object) predicate14);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) predicate20);
        defaultedMap11.putAll((java.util.Map) defaultedMap17);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 1);
        java.lang.String str27 = defaultedMap24.toString();
        defaultedMap17.putAll((java.util.Map) defaultedMap24);
        java.lang.String str29 = defaultedMap24.toString();
        java.util.Set set30 = defaultedMap24.keySet();
        boolean b31 = defaultedMap9.containsValue((java.lang.Object) set30);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertNotNull(set30);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1);
        collections.Predicate predicate12 = collections.PredicateUtils.uniquePredicate();
        boolean b13 = defaultedMap9.containsValue((java.lang.Object) predicate12);
        filterIterator7.setPredicate(predicate12);
        java.lang.Object obj15 = defaultedMap1.get((java.lang.Object) predicate12);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNotNull(predicate12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 100L + "'", obj15.equals(100L));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) ' ');
        boolean b7 = defaultedMap1.containsKey((java.lang.Object) 1.0d);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 1);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) predicate6);
        filterIterator0.setPredicate(predicate6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        java.util.Collection collection9 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        int i20 = defaultedMap14.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(i20 == 0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.Transformer transformer5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        java.util.Iterator iterator4 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        filterIterator5.setPredicate(predicate6);
        filterIterator0.setIterator((java.util.Iterator) filterIterator5);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(iterator4);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        java.util.Iterator iterator23 = filterIterator19.getIterator();
        java.util.Iterator iterator24 = filterIterator19.getIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) predicate36);
        java.util.Set set38 = defaultedMap33.entrySet();
        java.lang.Object obj39 = defaultedMap29.get((java.lang.Object) defaultedMap33);
        boolean b40 = defaultedMap11.containsValue((java.lang.Object) defaultedMap29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + 100L + "'", obj39.equals(100L));
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        boolean b23 = defaultedMap7.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.Transformer transformer8 = null;
        try {
            java.util.Map map9 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        defaultedMap14.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.String str9 = defaultedMap1.toString();
        collections.Predicate predicate10 = null;
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) predicate21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.map.DefaultedMap defaultedMap25 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj27 = defaultedMap25.remove((java.lang.Object) 1);
        java.lang.String str28 = defaultedMap25.toString();
        defaultedMap18.putAll((java.util.Map) defaultedMap25);
        java.lang.String str30 = defaultedMap25.toString();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator();
        collections.Predicate predicate32 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator31, predicate32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.iterators.FilterIterator filterIterator35 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) predicate40);
        filterIterator35.setPredicate(predicate40);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate44);
        java.util.Map map46 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap25, predicate40, predicate44);
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate10, predicate44);
        boolean b48 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "{}" + "'", str28.equals("{}"));
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(map46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertTrue(b48 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        java.util.Set set18 = defaultedMap1.keySet();
        java.lang.String str19 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Factory factory11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap6, factory11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        java.lang.String str45 = defaultedMap42.toString();
        boolean b47 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) predicate58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        defaultedMap42.putAll((java.util.Map) defaultedMap55);
        defaultedMap26.putAll((java.util.Map) defaultedMap42);
        java.lang.Object obj64 = defaultedMap42.remove((java.lang.Object) ' ');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj64);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        boolean b20 = defaultedMap14.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        defaultedMap26.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        java.util.Iterator iterator3 = null;
        filterIterator0.setIterator(iterator3);
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        defaultedMap14.clear();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        boolean b58 = defaultedMap54.containsValue((java.lang.Object) predicate57);
        filterIterator52.setPredicate(predicate57);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate57, predicate60);
        java.util.Set set62 = defaultedMap14.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(set62);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap35.toString();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.String str40 = defaultedMap35.toString();
        java.util.Set set41 = defaultedMap35.keySet();
        boolean b42 = defaultedMap14.equals((java.lang.Object) defaultedMap35);
        java.lang.Object obj43 = null;
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b46 = defaultedMap45.isEmpty();
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj49 = defaultedMap45.get((java.lang.Object) 100L);
        boolean b51 = defaultedMap45.equals((java.lang.Object) (short) 1);
        java.util.Set set52 = defaultedMap45.entrySet();
        java.util.Collection collection53 = defaultedMap45.values();
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        java.lang.String str58 = defaultedMap55.toString();
        boolean b60 = defaultedMap55.equals((java.lang.Object) (-1.0f));
        java.util.Map map62 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap55, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate64);
        java.util.Iterator iterator66 = filterIterator63.getIterator();
        java.util.Iterator iterator67 = filterIterator63.getIterator();
        java.util.Iterator iterator68 = filterIterator63.getIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator(iterator68, predicate69);
        java.lang.Object obj71 = defaultedMap45.put((java.lang.Object) defaultedMap55, (java.lang.Object) filterIterator70);
        java.lang.Object obj72 = defaultedMap14.put(obj43, (java.lang.Object) defaultedMap55);
        int i73 = defaultedMap55.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertTrue("'" + obj49 + "' != '" + 100L + "'", obj49.equals(100L));
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNotNull(set52);
        org.junit.Assert.assertNotNull(collection53);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertNull(iterator68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNull(obj72);
        org.junit.Assert.assertTrue(i73 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        collections.Transformer transformer2 = null;
        try {
            java.util.Map map3 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.Predicate predicate2 = filterIterator0.getPredicate();
        collections.Predicate predicate3 = filterIterator0.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate2);
        org.junit.Assert.assertNull(predicate3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        java.util.Iterator iterator23 = filterIterator19.getIterator();
        java.util.Iterator iterator24 = filterIterator19.getIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator26);
        java.lang.String str28 = defaultedMap1.toString();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = filterIterator39.getPredicate();
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        java.lang.String str45 = defaultedMap42.toString();
        boolean b47 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        java.util.Map map49 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap42, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 1);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        boolean b61 = defaultedMap57.containsValue((java.lang.Object) predicate60);
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.uniquePredicate();
        filterIterator63.setPredicate(predicate64);
        collections.Predicate predicate66 = collections.PredicateUtils.truePredicate();
        java.util.Map map67 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap51, predicate64, predicate66);
        collections.map.DefaultedMap defaultedMap69 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj71 = defaultedMap69.remove((java.lang.Object) 1);
        collections.Predicate predicate72 = collections.PredicateUtils.uniquePredicate();
        boolean b73 = defaultedMap69.containsValue((java.lang.Object) predicate72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) 1);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        boolean b79 = defaultedMap75.containsValue((java.lang.Object) predicate78);
        defaultedMap69.putAll((java.util.Map) defaultedMap75);
        collections.iterators.FilterIterator filterIterator81 = new collections.iterators.FilterIterator();
        collections.Predicate predicate82 = collections.PredicateUtils.uniquePredicate();
        filterIterator81.setPredicate(predicate82);
        collections.Predicate predicate84 = collections.PredicateUtils.truePredicate();
        java.util.Map map85 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap69, predicate82, predicate84);
        java.util.Map map86 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap42, predicate66, predicate82);
        filterIterator39.setPredicate(predicate82);
        boolean b88 = defaultedMap26.equals((java.lang.Object) filterIterator39);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(predicate40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNotNull(map49);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNotNull(map67);
        org.junit.Assert.assertNull(obj71);
        org.junit.Assert.assertNotNull(predicate72);
        org.junit.Assert.assertTrue(b73 == false);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNotNull(predicate82);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertNotNull(map85);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b88 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) filterIterator39);
        java.util.Collection collection41 = defaultedMap26.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(collection41);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        defaultedMap14.clear();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        boolean b58 = defaultedMap54.containsValue((java.lang.Object) predicate57);
        filterIterator52.setPredicate(predicate57);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate57, predicate60);
        boolean b62 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap14);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = filterIterator3.getPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) predicate9);
        filterIterator3.setPredicate(predicate9);
        filterIterator0.setIterator((java.util.Iterator) filterIterator3);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator4.setIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        java.lang.Object obj19 = defaultedMap1.get((java.lang.Object) 1);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 100L + "'", obj19.equals(100L));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1);
        java.lang.String str39 = defaultedMap36.toString();
        boolean b41 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0d);
        boolean b44 = defaultedMap36.isEmpty();
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap14.get((java.lang.Object) "");
        java.util.Set set48 = defaultedMap14.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertNotNull(set48);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.lang.Object obj8 = defaultedMap1.put((java.lang.Object) ' ', (java.lang.Object) defaultedMap6);
        java.lang.String str9 = defaultedMap6.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        java.util.Set set11 = defaultedMap8.entrySet();
        boolean b12 = defaultedMap1.equals((java.lang.Object) defaultedMap8);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(set11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        boolean b12 = defaultedMap1.containsKey((java.lang.Object) filterIterator9);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1);
        java.lang.String str13 = defaultedMap10.toString();
        boolean b15 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        defaultedMap10.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) predicate40);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        boolean b45 = defaultedMap31.isEmpty();
        defaultedMap31.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100L + "'", obj44.equals(100L));
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        java.util.Set set18 = defaultedMap1.keySet();
        boolean b19 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        defaultedMap14.clear();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1);
        collections.Predicate predicate57 = collections.PredicateUtils.uniquePredicate();
        boolean b58 = defaultedMap54.containsValue((java.lang.Object) predicate57);
        filterIterator52.setPredicate(predicate57);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate57, predicate60);
        boolean b62 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj66 = defaultedMap64.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) 1);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        boolean b72 = defaultedMap68.containsValue((java.lang.Object) predicate71);
        java.util.Set set73 = defaultedMap68.entrySet();
        java.lang.Object obj74 = defaultedMap64.get((java.lang.Object) defaultedMap68);
        boolean b75 = defaultedMap14.containsKey((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertTrue(b58 == false);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertTrue(b62 == true);
        org.junit.Assert.assertNull(obj66);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(set73);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 100L + "'", obj74.equals(100L));
        org.junit.Assert.assertTrue(b75 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.util.Set set7 = defaultedMap6.entrySet();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(set7);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1);
        collections.Predicate predicate13 = collections.PredicateUtils.uniquePredicate();
        boolean b14 = defaultedMap10.containsValue((java.lang.Object) predicate13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 1);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) predicate19);
        defaultedMap10.putAll((java.util.Map) defaultedMap16);
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator();
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        filterIterator22.setPredicate(predicate23);
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        java.util.Map map26 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap10, predicate23, predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        boolean b38 = defaultedMap34.containsValue((java.lang.Object) predicate37);
        defaultedMap28.putAll((java.util.Map) defaultedMap34);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        filterIterator40.setPredicate(predicate41);
        collections.Predicate predicate43 = collections.PredicateUtils.truePredicate();
        java.util.Map map44 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap28, predicate41, predicate43);
        java.util.Map map45 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate25, predicate41);
        collections.Factory factory46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate(map45, factory46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(map26);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(predicate43);
        org.junit.Assert.assertNotNull(map44);
        org.junit.Assert.assertNotNull(map45);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap1.values();
        boolean b15 = defaultedMap1.equals((java.lang.Object) (short) 100);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        java.lang.String str20 = defaultedMap17.toString();
        boolean b22 = defaultedMap17.equals((java.lang.Object) (-1.0f));
        boolean b23 = defaultedMap17.isEmpty();
        boolean b24 = defaultedMap17.isEmpty();
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        java.lang.String str29 = defaultedMap26.toString();
        boolean b31 = defaultedMap26.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) predicate36);
        collections.map.DefaultedMap defaultedMap39 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj41 = defaultedMap39.remove((java.lang.Object) 1);
        collections.Predicate predicate42 = collections.PredicateUtils.uniquePredicate();
        boolean b43 = defaultedMap39.containsValue((java.lang.Object) predicate42);
        defaultedMap33.putAll((java.util.Map) defaultedMap39);
        defaultedMap26.putAll((java.util.Map) defaultedMap39);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 1);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 1);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) predicate56);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        defaultedMap39.putAll((java.util.Map) defaultedMap47);
        java.lang.Object obj60 = defaultedMap17.get((java.lang.Object) defaultedMap47);
        boolean b61 = defaultedMap1.containsValue(obj60);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "{}" + "'", str29.equals("{}"));
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue("'" + obj60 + "' != '" + 100L + "'", obj60.equals(100L));
        org.junit.Assert.assertTrue(b61 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.keySet();
        org.junit.Assert.assertNotNull(set2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b8 = defaultedMap1.isEmpty();
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap35.toString();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.String str40 = defaultedMap35.toString();
        java.util.Set set41 = defaultedMap35.keySet();
        java.util.Set set42 = defaultedMap35.entrySet();
        boolean b43 = defaultedMap14.equals((java.lang.Object) set42);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertNotNull(set42);
        org.junit.Assert.assertTrue(b43 == false);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1);
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0d);
        boolean b17 = defaultedMap9.isEmpty();
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) b17);
        java.util.Collection collection19 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        int i36 = defaultedMap14.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertTrue(i36 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        defaultedMap6.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        java.util.Set set36 = defaultedMap14.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNotNull(set36);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        java.util.Iterator iterator23 = filterIterator19.getIterator();
        java.util.Iterator iterator24 = filterIterator19.getIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator26);
        collections.Predicate predicate28 = filterIterator26.getPredicate();
        try {
            filterIterator26.remove();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        boolean b39 = defaultedMap26.isEmpty();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        java.util.Iterator iterator43 = filterIterator40.getIterator();
        java.util.Iterator iterator44 = filterIterator40.getIterator();
        java.lang.Object obj45 = defaultedMap26.remove((java.lang.Object) filterIterator40);
        collections.Predicate predicate46 = filterIterator40.getPredicate();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(iterator43);
        org.junit.Assert.assertNull(iterator44);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertNull(predicate46);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        defaultedMap14.clear();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) predicate58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 1);
        java.lang.String str65 = defaultedMap62.toString();
        defaultedMap55.putAll((java.util.Map) defaultedMap62);
        collections.map.DefaultedMap defaultedMap68 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj70 = defaultedMap68.remove((java.lang.Object) 1);
        collections.Predicate predicate71 = collections.PredicateUtils.uniquePredicate();
        boolean b72 = defaultedMap68.containsValue((java.lang.Object) predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) 1);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        boolean b78 = defaultedMap74.containsValue((java.lang.Object) predicate77);
        defaultedMap68.putAll((java.util.Map) defaultedMap74);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj83 = defaultedMap81.remove((java.lang.Object) 1);
        java.lang.String str84 = defaultedMap81.toString();
        defaultedMap74.putAll((java.util.Map) defaultedMap81);
        defaultedMap55.putAll((java.util.Map) defaultedMap74);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        java.lang.Object obj88 = defaultedMap74.remove((java.lang.Object) filterIterator87);
        java.lang.Object obj89 = defaultedMap14.get((java.lang.Object) filterIterator87);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertTrue("'" + str84 + "' != '" + "{}" + "'", str84.equals("{}"));
        org.junit.Assert.assertNull(obj88);
        org.junit.Assert.assertTrue("'" + obj89 + "' != '" + 100L + "'", obj89.equals(100L));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        java.lang.String str37 = defaultedMap34.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) predicate49);
        filterIterator44.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate49, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        java.util.Iterator iterator59 = filterIterator56.getIterator();
        collections.Predicate predicate60 = filterIterator56.getPredicate();
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) defaultedMap34, (java.lang.Object) filterIterator56);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) filterIterator56);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1);
        java.lang.String str39 = defaultedMap36.toString();
        boolean b41 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0d);
        boolean b44 = defaultedMap36.isEmpty();
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap14.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate51);
        boolean b53 = defaultedMap14.containsValue((java.lang.Object) filterIterator48);
        collections.Predicate predicate54 = null;
        filterIterator48.setPredicate(predicate54);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.String str9 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.Transformer transformer11 = null;
        try {
            java.util.Map map12 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap10, transformer11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.Factory factory5 = null;
        try {
            java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        java.lang.String str10 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        boolean b19 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        java.lang.String str37 = defaultedMap34.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        java.util.Set set39 = defaultedMap34.keySet();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) set39);
        java.lang.String str41 = defaultedMap11.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "{}" + "'", str41.equals("{}"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        java.lang.String str11 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.equals((java.lang.Object) (-1.0f));
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate30, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        boolean b39 = defaultedMap35.containsValue((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) predicate44);
        defaultedMap35.putAll((java.util.Map) defaultedMap41);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate32, predicate48);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate48);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator13, predicate14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15);
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) filterIterator15);
        java.util.Collection collection19 = defaultedMap7.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(collection19);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        java.lang.String str45 = defaultedMap42.toString();
        boolean b47 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        java.lang.String str52 = defaultedMap49.toString();
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap49, (java.lang.Object) 100.0f);
        int i55 = defaultedMap49.size();
        int i56 = defaultedMap49.size();
        defaultedMap42.putAll((java.util.Map) defaultedMap49);
        boolean b58 = defaultedMap26.containsValue((java.lang.Object) defaultedMap49);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "{}" + "'", str52.equals("{}"));
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertTrue(i55 == 0);
        org.junit.Assert.assertTrue(i56 == 0);
        org.junit.Assert.assertTrue(b58 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) ' ');
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator25, predicate26);
        java.util.Iterator iterator28 = filterIterator25.getIterator();
        collections.Predicate predicate29 = filterIterator25.getPredicate();
        java.lang.Object obj30 = defaultedMap20.get((java.lang.Object) filterIterator25);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 1);
        java.util.Collection collection35 = defaultedMap32.values();
        java.util.Collection collection36 = defaultedMap32.values();
        boolean b37 = defaultedMap20.containsKey((java.lang.Object) collection36);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(predicate29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100L + "'", obj30.equals(100L));
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(collection35);
        org.junit.Assert.assertNotNull(collection36);
        org.junit.Assert.assertTrue(b37 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        java.lang.String str11 = defaultedMap8.toString();
        java.util.Map map13 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 100.0f);
        int i14 = defaultedMap8.size();
        int i15 = defaultedMap8.size();
        defaultedMap1.putAll((java.util.Map) defaultedMap8);
        defaultedMap8.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertNotNull(map13);
        org.junit.Assert.assertTrue(i14 == 0);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1);
        java.lang.String str13 = defaultedMap10.toString();
        boolean b15 = defaultedMap10.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        defaultedMap10.putAll((java.util.Map) defaultedMap23);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) predicate40);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        defaultedMap23.putAll((java.util.Map) defaultedMap31);
        java.lang.Object obj44 = defaultedMap1.get((java.lang.Object) defaultedMap31);
        defaultedMap1.clear();
        collections.Transformer transformer46 = null;
        try {
            java.util.Map map47 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{}" + "'", str13.equals("{}"));
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 100L + "'", obj44.equals(100L));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap3.remove((java.lang.Object) 1);
        collections.Predicate predicate6 = collections.PredicateUtils.uniquePredicate();
        boolean b7 = defaultedMap3.containsValue((java.lang.Object) predicate6);
        filterIterator0.setPredicate(predicate6);
        java.util.Iterator iterator9 = filterIterator0.getIterator();
        org.junit.Assert.assertNull(predicate1);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(iterator9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) predicate9);
        defaultedMap1.putAll((java.util.Map) defaultedMap6);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator();
        collections.Predicate predicate13 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator14 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator12, predicate13);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator16 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator14);
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator();
        collections.Predicate predicate18 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator17, predicate18);
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19);
        filterIterator16.setIterator((java.util.Iterator) filterIterator21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) predicate33);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.uniquePredicate();
        filterIterator36.setPredicate(predicate37);
        collections.Predicate predicate39 = collections.PredicateUtils.truePredicate();
        java.util.Map map40 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap24, predicate37, predicate39);
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator16, predicate37);
        java.util.Iterator iterator42 = filterIterator41.getIterator();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate44);
        java.util.Iterator iterator46 = filterIterator43.getIterator();
        java.util.Iterator iterator47 = filterIterator43.getIterator();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator50 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate49);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator50);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator();
        collections.Predicate predicate54 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator53, predicate54);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55);
        filterIterator52.setIterator((java.util.Iterator) filterIterator57);
        filterIterator43.setIterator((java.util.Iterator) filterIterator52);
        java.lang.Object obj60 = defaultedMap1.put((java.lang.Object) iterator42, (java.lang.Object) filterIterator52);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(predicate13);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(map40);
        org.junit.Assert.assertNotNull(iterator42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(iterator46);
        org.junit.Assert.assertNull(iterator47);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.uniquePredicate();
        filterIterator0.setPredicate(predicate1);
        collections.map.DefaultedMap defaultedMap3 = new collections.map.DefaultedMap((java.lang.Object) predicate1);
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        java.lang.String str37 = defaultedMap34.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) predicate49);
        filterIterator44.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate49, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        java.util.Iterator iterator59 = filterIterator56.getIterator();
        collections.Predicate predicate60 = filterIterator56.getPredicate();
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) defaultedMap34, (java.lang.Object) filterIterator56);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.uniquePredicate();
        filterIterator62.setPredicate(predicate63);
        collections.Predicate predicate65 = filterIterator62.getPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator67 = filterIterator66.getIterator();
        java.util.Iterator iterator68 = filterIterator66.getIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        filterIterator66.setPredicate(predicate69);
        collections.Predicate predicate71 = filterIterator66.getPredicate();
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) 1);
        java.lang.String str78 = defaultedMap75.toString();
        boolean b80 = defaultedMap75.equals((java.lang.Object) (-1.0f));
        boolean b81 = defaultedMap75.isEmpty();
        java.lang.Object obj83 = defaultedMap75.get((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate85);
        boolean b87 = defaultedMap75.equals((java.lang.Object) predicate85);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator72, predicate85);
        java.util.Map map89 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate65, predicate85);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNull(iterator67);
        org.junit.Assert.assertNull(iterator68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertTrue("'" + str78 + "' != '" + "{}" + "'", str78.equals("{}"));
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertTrue(b81 == true);
        org.junit.Assert.assertTrue("'" + obj83 + "' != '" + 100L + "'", obj83.equals(100L));
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b87 == false);
        org.junit.Assert.assertNotNull(map89);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        int i7 = defaultedMap1.size();
        int i8 = defaultedMap1.size();
        collections.Transformer transformer9 = null;
        try {
            java.util.Map map10 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap6.get((java.lang.Object) 100L);
        boolean b12 = defaultedMap6.equals((java.lang.Object) (short) 1);
        java.util.Set set13 = defaultedMap6.entrySet();
        java.util.Collection collection14 = defaultedMap6.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 1);
        java.lang.String str19 = defaultedMap16.toString();
        boolean b21 = defaultedMap16.equals((java.lang.Object) (-1.0f));
        java.util.Map map23 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap16, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate25);
        java.util.Iterator iterator27 = filterIterator24.getIterator();
        java.util.Iterator iterator28 = filterIterator24.getIterator();
        java.util.Iterator iterator29 = filterIterator24.getIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator31 = new collections.iterators.FilterIterator(iterator29, predicate30);
        java.lang.Object obj32 = defaultedMap6.put((java.lang.Object) defaultedMap16, (java.lang.Object) filterIterator31);
        filterIterator0.setIterator((java.util.Iterator) filterIterator31);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNotNull(collection14);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(map23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(iterator27);
        org.junit.Assert.assertNull(iterator28);
        org.junit.Assert.assertNull(iterator29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        defaultedMap6.clear();
        java.lang.Object obj10 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 100L + "'", obj10.equals(100L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        java.lang.String str37 = defaultedMap34.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) predicate49);
        filterIterator44.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate49, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        java.util.Iterator iterator59 = filterIterator56.getIterator();
        collections.Predicate predicate60 = filterIterator56.getPredicate();
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) defaultedMap34, (java.lang.Object) filterIterator56);
        java.util.Iterator iterator62 = filterIterator56.getIterator();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator();
        collections.Predicate predicate64 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63, predicate64);
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate69);
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator70);
        filterIterator67.setIterator((java.util.Iterator) filterIterator72);
        collections.map.DefaultedMap defaultedMap75 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj77 = defaultedMap75.remove((java.lang.Object) 1);
        collections.Predicate predicate78 = collections.PredicateUtils.uniquePredicate();
        boolean b79 = defaultedMap75.containsValue((java.lang.Object) predicate78);
        collections.map.DefaultedMap defaultedMap81 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj83 = defaultedMap81.remove((java.lang.Object) 1);
        collections.Predicate predicate84 = collections.PredicateUtils.uniquePredicate();
        boolean b85 = defaultedMap81.containsValue((java.lang.Object) predicate84);
        defaultedMap75.putAll((java.util.Map) defaultedMap81);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator();
        collections.Predicate predicate88 = collections.PredicateUtils.uniquePredicate();
        filterIterator87.setPredicate(predicate88);
        collections.Predicate predicate90 = collections.PredicateUtils.truePredicate();
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap75, predicate88, predicate90);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67, predicate88);
        java.util.Iterator iterator93 = filterIterator92.getIterator();
        filterIterator56.setIterator(iterator93);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertNull(iterator62);
        org.junit.Assert.assertNotNull(predicate64);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNull(obj77);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
        org.junit.Assert.assertTrue(b85 == false);
        org.junit.Assert.assertNotNull(predicate88);
        org.junit.Assert.assertNotNull(predicate90);
        org.junit.Assert.assertNotNull(map91);
        org.junit.Assert.assertNotNull(iterator93);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 1.0d);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.util.Set set19 = defaultedMap14.keySet();
        boolean b21 = defaultedMap14.equals((java.lang.Object) '4');
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.Predicate predicate5 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map6 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate5);
        int i7 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1);
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        boolean b15 = defaultedMap9.isEmpty();
        java.util.Set set16 = defaultedMap9.keySet();
        java.lang.String str17 = defaultedMap9.toString();
        collections.Predicate predicate18 = null;
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        java.lang.String str38 = defaultedMap33.toString();
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator41 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39, predicate40);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator41);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) predicate48);
        filterIterator43.setPredicate(predicate48);
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator();
        collections.Predicate predicate52 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51, predicate52);
        java.util.Map map54 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap33, predicate48, predicate52);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate18, predicate52);
        boolean b56 = defaultedMap1.containsValue((java.lang.Object) map55);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(map6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertTrue(b56 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap35.toString();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.String str40 = defaultedMap35.toString();
        java.util.Set set41 = defaultedMap35.keySet();
        boolean b42 = defaultedMap14.equals((java.lang.Object) defaultedMap35);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        boolean b56 = defaultedMap52.containsValue((java.lang.Object) predicate55);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 1);
        java.lang.String str62 = defaultedMap59.toString();
        defaultedMap52.putAll((java.util.Map) defaultedMap59);
        java.lang.String str64 = defaultedMap59.toString();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj73 = defaultedMap71.remove((java.lang.Object) 1);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        boolean b75 = defaultedMap71.containsValue((java.lang.Object) predicate74);
        filterIterator69.setPredicate(predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate74, predicate78);
        filterIterator43.setPredicate(predicate78);
        java.lang.Object obj82 = defaultedMap14.remove((java.lang.Object) filterIterator43);
        collections.Predicate predicate83 = filterIterator43.getPredicate();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate83);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        collections.Factory factory18 = null;
        try {
            java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        collections.Transformer transformer10 = null;
        try {
            java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set10 = defaultedMap9.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.equals((java.lang.Object) (-1.0f));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) predicate36);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate40, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) predicate54);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate58, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate58);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        boolean b64 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        java.util.Collection collection65 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(collection65);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        java.lang.String str9 = defaultedMap1.toString();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) 10);
        defaultedMap1.clear();
        collections.Factory factory13 = null;
        try {
            java.util.Map map14 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100L + "'", obj11.equals(100L));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        defaultedMap7.clear();
        boolean b14 = defaultedMap7.isEmpty();
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        java.util.Iterator iterator18 = filterIterator15.getIterator();
        java.util.Iterator iterator19 = filterIterator15.getIterator();
        java.util.Iterator iterator20 = filterIterator15.getIterator();
        java.lang.Object obj21 = defaultedMap7.remove((java.lang.Object) iterator20);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNull(iterator18);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNull(obj21);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        java.util.Iterator iterator3 = filterIterator0.getIterator();
        collections.Predicate predicate4 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate6 = collections.PredicateUtils.truePredicate();
        filterIterator0.setPredicate(predicate6);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNull(iterator3);
        org.junit.Assert.assertNull(predicate4);
        org.junit.Assert.assertNotNull(predicate6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        collections.iterators.FilterIterator filterIterator18 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator19 = filterIterator18.getIterator();
        java.util.Iterator iterator20 = filterIterator18.getIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        filterIterator18.setPredicate(predicate21);
        collections.Predicate predicate23 = filterIterator18.getPredicate();
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator18);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        java.lang.String str30 = defaultedMap27.toString();
        boolean b32 = defaultedMap27.equals((java.lang.Object) (-1.0f));
        boolean b33 = defaultedMap27.isEmpty();
        java.lang.Object obj35 = defaultedMap27.get((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator36 = new collections.iterators.FilterIterator();
        collections.Predicate predicate37 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator36, predicate37);
        boolean b39 = defaultedMap27.equals((java.lang.Object) predicate37);
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator24, predicate37);
        java.lang.Object obj41 = defaultedMap1.get((java.lang.Object) filterIterator40);
        collections.Factory factory42 = null;
        try {
            java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, factory42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertNull(iterator19);
        org.junit.Assert.assertNull(iterator20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "{}" + "'", str30.equals("{}"));
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 100L + "'", obj35.equals(100L));
        org.junit.Assert.assertNotNull(predicate37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 100L + "'", obj41.equals(100L));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.lang.Object obj0 = null;
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap(obj0);
        boolean b2 = defaultedMap1.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap1.values();
        java.util.Collection collection14 = defaultedMap1.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(collection14);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 1);
        collections.Predicate predicate7 = collections.PredicateUtils.uniquePredicate();
        boolean b8 = defaultedMap4.containsValue((java.lang.Object) predicate7);
        filterIterator0.setPredicate(predicate7);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNotNull(predicate7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        boolean b47 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) predicate58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        java.util.Collection collection61 = defaultedMap55.values();
        java.lang.Object obj62 = defaultedMap14.remove((java.lang.Object) collection61);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(collection61);
        org.junit.Assert.assertNull(obj62);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.lang.String str10 = defaultedMap6.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        java.util.Collection collection13 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set16 = defaultedMap15.entrySet();
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        java.lang.String str21 = defaultedMap18.toString();
        boolean b23 = defaultedMap18.equals((java.lang.Object) (-1.0f));
        java.util.Map map25 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap18, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) predicate36);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        filterIterator39.setPredicate(predicate40);
        collections.Predicate predicate42 = collections.PredicateUtils.truePredicate();
        java.util.Map map43 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap27, predicate40, predicate42);
        collections.map.DefaultedMap defaultedMap45 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj47 = defaultedMap45.remove((java.lang.Object) 1);
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        boolean b49 = defaultedMap45.containsValue((java.lang.Object) predicate48);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) predicate54);
        defaultedMap45.putAll((java.util.Map) defaultedMap51);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator();
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        filterIterator57.setPredicate(predicate58);
        collections.Predicate predicate60 = collections.PredicateUtils.truePredicate();
        java.util.Map map61 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap45, predicate58, predicate60);
        java.util.Map map62 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate42, predicate58);
        defaultedMap15.putAll((java.util.Map) defaultedMap18);
        boolean b64 = defaultedMap1.equals((java.lang.Object) defaultedMap15);
        java.util.Set set65 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(collection13);
        org.junit.Assert.assertNotNull(set16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "{}" + "'", str21.equals("{}"));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(map25);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertNull(obj47);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNotNull(map61);
        org.junit.Assert.assertNotNull(map62);
        org.junit.Assert.assertTrue(b64 == true);
        org.junit.Assert.assertNotNull(set65);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        java.util.Set set20 = defaultedMap14.keySet();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) predicate33);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        defaultedMap30.putAll((java.util.Map) defaultedMap37);
        java.lang.String str42 = defaultedMap37.toString();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        filterIterator47.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate52, predicate56);
        filterIterator21.setPredicate(predicate56);
        java.lang.Object obj60 = defaultedMap14.remove((java.lang.Object) filterIterator21);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 1);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        boolean b66 = defaultedMap62.containsValue((java.lang.Object) predicate65);
        filterIterator21.setPredicate(predicate65);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        java.lang.String str38 = defaultedMap35.toString();
        defaultedMap28.putAll((java.util.Map) defaultedMap35);
        java.lang.String str40 = defaultedMap35.toString();
        java.util.Set set41 = defaultedMap35.keySet();
        boolean b42 = defaultedMap14.equals((java.lang.Object) defaultedMap35);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = filterIterator43.getPredicate();
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) predicate49);
        collections.map.DefaultedMap defaultedMap52 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj54 = defaultedMap52.remove((java.lang.Object) 1);
        collections.Predicate predicate55 = collections.PredicateUtils.uniquePredicate();
        boolean b56 = defaultedMap52.containsValue((java.lang.Object) predicate55);
        defaultedMap46.putAll((java.util.Map) defaultedMap52);
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 1);
        java.lang.String str62 = defaultedMap59.toString();
        defaultedMap52.putAll((java.util.Map) defaultedMap59);
        java.lang.String str64 = defaultedMap59.toString();
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator();
        collections.Predicate predicate66 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator65, predicate66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator67);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj73 = defaultedMap71.remove((java.lang.Object) 1);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        boolean b75 = defaultedMap71.containsValue((java.lang.Object) predicate74);
        filterIterator69.setPredicate(predicate74);
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator();
        collections.Predicate predicate78 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator79 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator77, predicate78);
        java.util.Map map80 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap59, predicate74, predicate78);
        filterIterator43.setPredicate(predicate78);
        java.lang.Object obj82 = defaultedMap14.remove((java.lang.Object) filterIterator43);
        collections.map.DefaultedMap defaultedMap83 = new collections.map.DefaultedMap(obj82);
        defaultedMap83.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "{}" + "'", str38.equals("{}"));
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertNotNull(set41);
        org.junit.Assert.assertTrue(b42 == true);
        org.junit.Assert.assertNull(predicate44);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue("'" + str64 + "' != '" + "{}" + "'", str64.equals("{}"));
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNotNull(predicate78);
        org.junit.Assert.assertNotNull(map80);
        org.junit.Assert.assertNull(obj82);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        java.lang.String str19 = defaultedMap11.toString();
        java.lang.Object obj21 = defaultedMap11.get((java.lang.Object) 10);
        defaultedMap11.clear();
        boolean b23 = defaultedMap9.containsValue((java.lang.Object) defaultedMap11);
        java.util.Set set24 = defaultedMap9.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj21 + "' != '" + 100L + "'", obj21.equals(100L));
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(set24);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        boolean b47 = defaultedMap14.isEmpty();
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) predicate58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 1);
        java.lang.String str65 = defaultedMap62.toString();
        defaultedMap55.putAll((java.util.Map) defaultedMap62);
        java.lang.Object obj67 = defaultedMap14.get((java.lang.Object) defaultedMap62);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "{}" + "'", str65.equals("{}"));
        org.junit.Assert.assertTrue("'" + obj67 + "' != '" + 100L + "'", obj67.equals(100L));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        int i9 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        boolean b19 = defaultedMap11.isEmpty();
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        java.lang.String str37 = defaultedMap34.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        java.util.Set set39 = defaultedMap34.keySet();
        java.lang.Object obj40 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) set39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        java.util.Set set45 = defaultedMap42.entrySet();
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 1);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) predicate50);
        collections.map.DefaultedMap defaultedMap53 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj55 = defaultedMap53.remove((java.lang.Object) 1);
        collections.Predicate predicate56 = collections.PredicateUtils.uniquePredicate();
        boolean b57 = defaultedMap53.containsValue((java.lang.Object) predicate56);
        defaultedMap47.putAll((java.util.Map) defaultedMap53);
        defaultedMap53.clear();
        boolean b60 = defaultedMap42.equals((java.lang.Object) defaultedMap53);
        java.lang.Object obj61 = defaultedMap1.remove((java.lang.Object) defaultedMap53);
        java.lang.String str62 = defaultedMap1.toString();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(set45);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj55);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertTrue(b57 == false);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertNotNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        collections.Transformer transformer6 = null;
        try {
            java.util.Map map7 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, transformer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        java.lang.String str45 = defaultedMap42.toString();
        boolean b47 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) predicate58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        defaultedMap42.putAll((java.util.Map) defaultedMap55);
        defaultedMap26.putAll((java.util.Map) defaultedMap42);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        filterIterator68.setIterator((java.util.Iterator) filterIterator73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) 1);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        boolean b80 = defaultedMap76.containsValue((java.lang.Object) predicate79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) 1);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap82.containsValue((java.lang.Object) predicate85);
        defaultedMap76.putAll((java.util.Map) defaultedMap82);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        filterIterator88.setPredicate(predicate89);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate89, predicate91);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate89);
        java.lang.Object obj94 = defaultedMap42.put((java.lang.Object) (short) 100, (java.lang.Object) predicate89);
        java.util.Set set95 = defaultedMap42.entrySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.util.Set set19 = defaultedMap14.keySet();
        java.lang.String str20 = defaultedMap14.toString();
        boolean b21 = defaultedMap14.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNotNull(set19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "{}" + "'", str20.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator4.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) predicate21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate25);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1);
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (-1.0f));
        boolean b37 = defaultedMap31.isEmpty();
        java.util.Set set38 = defaultedMap31.keySet();
        java.lang.String str39 = defaultedMap31.toString();
        collections.Predicate predicate40 = null;
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 1);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) predicate51);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        java.lang.String str58 = defaultedMap55.toString();
        defaultedMap48.putAll((java.util.Map) defaultedMap55);
        java.lang.String str60 = defaultedMap55.toString();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator();
        collections.Predicate predicate62 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61, predicate62);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.iterators.FilterIterator filterIterator65 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) 1);
        collections.Predicate predicate70 = collections.PredicateUtils.uniquePredicate();
        boolean b71 = defaultedMap67.containsValue((java.lang.Object) predicate70);
        filterIterator65.setPredicate(predicate70);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator();
        collections.Predicate predicate74 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator73, predicate74);
        java.util.Map map76 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap55, predicate70, predicate74);
        java.util.Map map77 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate40, predicate74);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate40);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "{}" + "'", str60.equals("{}"));
        org.junit.Assert.assertNotNull(predicate62);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertTrue(b71 == false);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertNotNull(map76);
        org.junit.Assert.assertNotNull(map77);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) predicate35);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate39, predicate41);
        boolean b43 = defaultedMap20.equals((java.lang.Object) defaultedMap26);
        java.util.Collection collection44 = defaultedMap20.values();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(collection44);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        java.lang.Object obj24 = defaultedMap20.remove((java.lang.Object) ' ');
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) predicate35);
        defaultedMap26.putAll((java.util.Map) defaultedMap32);
        collections.iterators.FilterIterator filterIterator38 = new collections.iterators.FilterIterator();
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        filterIterator38.setPredicate(predicate39);
        collections.Predicate predicate41 = collections.PredicateUtils.truePredicate();
        java.util.Map map42 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap26, predicate39, predicate41);
        boolean b43 = defaultedMap20.equals((java.lang.Object) defaultedMap26);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator();
        collections.Predicate predicate45 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator44, predicate45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator46);
        collections.iterators.FilterIterator filterIterator49 = new collections.iterators.FilterIterator();
        collections.Predicate predicate50 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator51 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator49, predicate50);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator51);
        filterIterator48.setIterator((java.util.Iterator) filterIterator53);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 1);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        boolean b60 = defaultedMap56.containsValue((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 1);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        boolean b66 = defaultedMap62.containsValue((java.lang.Object) predicate65);
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate69, predicate71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator48, predicate69);
        java.lang.Object obj74 = defaultedMap20.get((java.lang.Object) predicate69);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNotNull(map42);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 100L + "'", obj74.equals(100L));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) filterIterator39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        java.lang.String str45 = defaultedMap42.toString();
        boolean b47 = defaultedMap42.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        collections.Predicate predicate58 = collections.PredicateUtils.uniquePredicate();
        boolean b59 = defaultedMap55.containsValue((java.lang.Object) predicate58);
        defaultedMap49.putAll((java.util.Map) defaultedMap55);
        defaultedMap42.putAll((java.util.Map) defaultedMap55);
        defaultedMap26.putAll((java.util.Map) defaultedMap42);
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator();
        collections.Predicate predicate65 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator66 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator64, predicate65);
        collections.iterators.FilterIterator filterIterator67 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator66);
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator();
        collections.Predicate predicate70 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator71 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator69, predicate70);
        collections.iterators.FilterIterator filterIterator72 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        collections.iterators.FilterIterator filterIterator73 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator71);
        filterIterator68.setIterator((java.util.Iterator) filterIterator73);
        collections.map.DefaultedMap defaultedMap76 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj78 = defaultedMap76.remove((java.lang.Object) 1);
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        boolean b80 = defaultedMap76.containsValue((java.lang.Object) predicate79);
        collections.map.DefaultedMap defaultedMap82 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj84 = defaultedMap82.remove((java.lang.Object) 1);
        collections.Predicate predicate85 = collections.PredicateUtils.uniquePredicate();
        boolean b86 = defaultedMap82.containsValue((java.lang.Object) predicate85);
        defaultedMap76.putAll((java.util.Map) defaultedMap82);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator();
        collections.Predicate predicate89 = collections.PredicateUtils.uniquePredicate();
        filterIterator88.setPredicate(predicate89);
        collections.Predicate predicate91 = collections.PredicateUtils.truePredicate();
        java.util.Map map92 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap76, predicate89, predicate91);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator68, predicate89);
        java.lang.Object obj94 = defaultedMap42.put((java.lang.Object) (short) 100, (java.lang.Object) predicate89);
        java.util.Set set95 = defaultedMap42.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertTrue("'" + str45 + "' != '" + "{}" + "'", str45.equals("{}"));
        org.junit.Assert.assertTrue(b47 == false);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(predicate58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertNotNull(predicate70);
        org.junit.Assert.assertNull(obj78);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertTrue(b80 == false);
        org.junit.Assert.assertNull(obj84);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertTrue(b86 == false);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(predicate91);
        org.junit.Assert.assertNotNull(map92);
        org.junit.Assert.assertNull(obj94);
        org.junit.Assert.assertNotNull(set95);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Collection collection4 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        boolean b6 = defaultedMap1.isEmpty();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1);
        java.util.Set set13 = defaultedMap10.entrySet();
        boolean b14 = defaultedMap1.containsKey((java.lang.Object) set13);
        int i15 = defaultedMap1.size();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(i15 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.util.Set set8 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj12 = defaultedMap10.remove((java.lang.Object) 1);
        java.util.Set set13 = defaultedMap10.entrySet();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        defaultedMap21.clear();
        boolean b28 = defaultedMap10.equals((java.lang.Object) defaultedMap21);
        java.util.Set set29 = defaultedMap21.entrySet();
        java.lang.Object obj30 = defaultedMap1.get((java.lang.Object) set29);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(set13);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set29);
        org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 100L + "'", obj30.equals(100L));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator4.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) predicate21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate25);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) filterIterator0);
        java.lang.String str7 = defaultedMap6.toString();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        boolean b8 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap1);
        java.util.Set set10 = defaultedMap1.keySet();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        java.util.Collection collection15 = defaultedMap12.values();
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) defaultedMap12);
        java.lang.Object obj17 = defaultedMap1.get((java.lang.Object) defaultedMap12);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(collection15);
        org.junit.Assert.assertTrue("'" + obj17 + "' != '" + 100L + "'", obj17.equals(100L));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Collection collection4 = defaultedMap1.values();
        java.util.Collection collection5 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        java.lang.String str10 = defaultedMap7.toString();
        boolean b12 = defaultedMap7.equals((java.lang.Object) (-1.0f));
        int i13 = defaultedMap7.size();
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1);
        java.lang.String str18 = defaultedMap15.toString();
        boolean b20 = defaultedMap15.equals((java.lang.Object) (-1.0f));
        java.util.Map map22 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap15, (java.lang.Object) 1.0d);
        boolean b23 = defaultedMap15.isEmpty();
        java.util.Map map24 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) b23);
        java.lang.Object obj25 = defaultedMap1.get((java.lang.Object) b23);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(collection4);
        org.junit.Assert.assertNotNull(collection5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{}" + "'", str10.equals("{}"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "{}" + "'", str18.equals("{}"));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(map22);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertNotNull(map24);
        org.junit.Assert.assertTrue("'" + obj25 + "' != '" + 100L + "'", obj25.equals(100L));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.lang.Object obj40 = defaultedMap26.remove((java.lang.Object) filterIterator39);
        boolean b42 = defaultedMap26.equals((java.lang.Object) 100.0d);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 1);
        java.lang.String str47 = defaultedMap44.toString();
        boolean b49 = defaultedMap44.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1);
        collections.Predicate predicate54 = collections.PredicateUtils.uniquePredicate();
        boolean b55 = defaultedMap51.containsValue((java.lang.Object) predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 1);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        boolean b61 = defaultedMap57.containsValue((java.lang.Object) predicate60);
        defaultedMap51.putAll((java.util.Map) defaultedMap57);
        defaultedMap44.putAll((java.util.Map) defaultedMap57);
        collections.map.DefaultedMap defaultedMap65 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj67 = defaultedMap65.remove((java.lang.Object) 1);
        collections.Predicate predicate68 = collections.PredicateUtils.uniquePredicate();
        boolean b69 = defaultedMap65.containsValue((java.lang.Object) predicate68);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj73 = defaultedMap71.remove((java.lang.Object) 1);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        boolean b75 = defaultedMap71.containsValue((java.lang.Object) predicate74);
        defaultedMap65.putAll((java.util.Map) defaultedMap71);
        defaultedMap57.putAll((java.util.Map) defaultedMap65);
        collections.map.DefaultedMap defaultedMap79 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj81 = defaultedMap79.remove((java.lang.Object) 1);
        java.lang.String str82 = defaultedMap79.toString();
        boolean b84 = defaultedMap79.equals((java.lang.Object) (-1.0f));
        java.util.Map map86 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap79, (java.lang.Object) 1.0d);
        boolean b87 = defaultedMap79.isEmpty();
        java.lang.Object obj88 = defaultedMap57.get((java.lang.Object) b87);
        defaultedMap26.putAll((java.util.Map) defaultedMap57);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertTrue(b49 == false);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertNotNull(predicate68);
        org.junit.Assert.assertTrue(b69 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj81);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "{}" + "'", str82.equals("{}"));
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(map86);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertTrue("'" + obj88 + "' != '" + 100L + "'", obj88.equals(100L));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Collection collection8 = defaultedMap1.values();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(collection8);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        boolean b17 = defaultedMap11.isEmpty();
        java.util.Set set18 = defaultedMap11.keySet();
        boolean b19 = defaultedMap1.containsKey((java.lang.Object) defaultedMap11);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        defaultedMap21.putAll((java.util.Map) defaultedMap27);
        collections.map.DefaultedMap defaultedMap34 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj36 = defaultedMap34.remove((java.lang.Object) 1);
        java.lang.String str37 = defaultedMap34.toString();
        defaultedMap27.putAll((java.util.Map) defaultedMap34);
        java.lang.String str39 = defaultedMap34.toString();
        collections.iterators.FilterIterator filterIterator40 = new collections.iterators.FilterIterator();
        collections.Predicate predicate41 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator40, predicate41);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.iterators.FilterIterator filterIterator44 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator42);
        collections.map.DefaultedMap defaultedMap46 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj48 = defaultedMap46.remove((java.lang.Object) 1);
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        boolean b50 = defaultedMap46.containsValue((java.lang.Object) predicate49);
        filterIterator44.setPredicate(predicate49);
        collections.iterators.FilterIterator filterIterator52 = new collections.iterators.FilterIterator();
        collections.Predicate predicate53 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator52, predicate53);
        java.util.Map map55 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap34, predicate49, predicate53);
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator();
        collections.Predicate predicate57 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56, predicate57);
        java.util.Iterator iterator59 = filterIterator56.getIterator();
        collections.Predicate predicate60 = filterIterator56.getPredicate();
        java.lang.Object obj61 = defaultedMap1.put((java.lang.Object) defaultedMap34, (java.lang.Object) filterIterator56);
        collections.Factory factory62 = null;
        try {
            java.util.Map map63 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap34, factory62);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertTrue("'" + str37 + "' != '" + "{}" + "'", str37.equals("{}"));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertNull(obj48);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertNotNull(predicate53);
        org.junit.Assert.assertNotNull(map55);
        org.junit.Assert.assertNotNull(predicate57);
        org.junit.Assert.assertNull(iterator59);
        org.junit.Assert.assertNull(predicate60);
        org.junit.Assert.assertNull(obj61);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.Predicate predicate8 = filterIterator7.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(predicate8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator();
        collections.Predicate predicate6 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5, predicate6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7);
        filterIterator4.setIterator((java.util.Iterator) filterIterator9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) predicate15);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) predicate21);
        defaultedMap12.putAll((java.util.Map) defaultedMap18);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        filterIterator24.setPredicate(predicate25);
        collections.Predicate predicate27 = collections.PredicateUtils.truePredicate();
        java.util.Map map28 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap12, predicate25, predicate27);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate25);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator30, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) predicate39);
        filterIterator34.setPredicate(predicate39);
        collections.iterators.FilterIterator filterIterator42 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator29, predicate39);
        collections.Predicate predicate43 = filterIterator29.getPredicate();
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate6);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertNotNull(map28);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(predicate43);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator();
        collections.Predicate predicate14 = collections.PredicateUtils.uniquePredicate();
        filterIterator13.setPredicate(predicate14);
        collections.Predicate predicate16 = collections.PredicateUtils.truePredicate();
        java.util.Map map17 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap1, predicate14, predicate16);
        int i18 = defaultedMap1.size();
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        java.lang.String str23 = defaultedMap20.toString();
        boolean b25 = defaultedMap20.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap27 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj29 = defaultedMap27.remove((java.lang.Object) 1);
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        boolean b31 = defaultedMap27.containsValue((java.lang.Object) predicate30);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        collections.Predicate predicate36 = collections.PredicateUtils.uniquePredicate();
        boolean b37 = defaultedMap33.containsValue((java.lang.Object) predicate36);
        defaultedMap27.putAll((java.util.Map) defaultedMap33);
        defaultedMap20.putAll((java.util.Map) defaultedMap33);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) predicate44);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 1);
        collections.Predicate predicate50 = collections.PredicateUtils.uniquePredicate();
        boolean b51 = defaultedMap47.containsValue((java.lang.Object) predicate50);
        defaultedMap41.putAll((java.util.Map) defaultedMap47);
        collections.map.DefaultedMap defaultedMap54 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj56 = defaultedMap54.remove((java.lang.Object) 1);
        java.lang.String str57 = defaultedMap54.toString();
        defaultedMap47.putAll((java.util.Map) defaultedMap54);
        java.lang.String str59 = defaultedMap54.toString();
        java.util.Set set60 = defaultedMap54.keySet();
        boolean b61 = defaultedMap33.equals((java.lang.Object) defaultedMap54);
        java.lang.Object obj62 = defaultedMap1.remove((java.lang.Object) b61);
        collections.map.DefaultedMap defaultedMap64 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b65 = defaultedMap64.isEmpty();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj68 = defaultedMap64.get((java.lang.Object) 100L);
        boolean b69 = defaultedMap64.isEmpty();
        java.lang.Object obj70 = defaultedMap1.get((java.lang.Object) defaultedMap64);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(predicate14);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertNotNull(map17);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "{}" + "'", str23.equals("{}"));
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertTrue(b31 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(predicate36);
        org.junit.Assert.assertTrue(b37 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertTrue(b51 == false);
        org.junit.Assert.assertNull(obj56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "{}" + "'", str57.equals("{}"));
        org.junit.Assert.assertTrue("'" + str59 + "' != '" + "{}" + "'", str59.equals("{}"));
        org.junit.Assert.assertNotNull(set60);
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNull(obj62);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue("'" + obj68 + "' != '" + 100L + "'", obj68.equals(100L));
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertTrue("'" + obj70 + "' != '" + 100L + "'", obj70.equals(100L));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.util.Set set2 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj6 = defaultedMap4.remove((java.lang.Object) 1);
        java.lang.String str7 = defaultedMap4.toString();
        boolean b9 = defaultedMap4.equals((java.lang.Object) (-1.0f));
        java.util.Map map11 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap4, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap13 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj15 = defaultedMap13.remove((java.lang.Object) 1);
        collections.Predicate predicate16 = collections.PredicateUtils.uniquePredicate();
        boolean b17 = defaultedMap13.containsValue((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap19 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj21 = defaultedMap19.remove((java.lang.Object) 1);
        collections.Predicate predicate22 = collections.PredicateUtils.uniquePredicate();
        boolean b23 = defaultedMap19.containsValue((java.lang.Object) predicate22);
        defaultedMap13.putAll((java.util.Map) defaultedMap19);
        collections.iterators.FilterIterator filterIterator25 = new collections.iterators.FilterIterator();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        filterIterator25.setPredicate(predicate26);
        collections.Predicate predicate28 = collections.PredicateUtils.truePredicate();
        java.util.Map map29 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap13, predicate26, predicate28);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1);
        collections.Predicate predicate34 = collections.PredicateUtils.uniquePredicate();
        boolean b35 = defaultedMap31.containsValue((java.lang.Object) predicate34);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        collections.Predicate predicate40 = collections.PredicateUtils.uniquePredicate();
        boolean b41 = defaultedMap37.containsValue((java.lang.Object) predicate40);
        defaultedMap31.putAll((java.util.Map) defaultedMap37);
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        filterIterator43.setPredicate(predicate44);
        collections.Predicate predicate46 = collections.PredicateUtils.truePredicate();
        java.util.Map map47 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap31, predicate44, predicate46);
        java.util.Map map48 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap4, predicate28, predicate44);
        defaultedMap1.putAll((java.util.Map) defaultedMap4);
        collections.map.DefaultedMap defaultedMap51 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj53 = defaultedMap51.remove((java.lang.Object) 1);
        java.lang.String str54 = defaultedMap51.toString();
        boolean b56 = defaultedMap51.equals((java.lang.Object) (-1.0f));
        int i57 = defaultedMap51.size();
        collections.map.DefaultedMap defaultedMap59 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj61 = defaultedMap59.remove((java.lang.Object) 1);
        java.lang.String str62 = defaultedMap59.toString();
        boolean b64 = defaultedMap59.equals((java.lang.Object) (-1.0f));
        java.util.Map map66 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap59, (java.lang.Object) 1.0d);
        boolean b67 = defaultedMap59.isEmpty();
        java.util.Map map68 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap51, (java.lang.Object) b67);
        boolean b69 = defaultedMap1.containsKey((java.lang.Object) b67);
        org.junit.Assert.assertNotNull(set2);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "{}" + "'", str7.equals("{}"));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map11);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNull(obj21);
        org.junit.Assert.assertNotNull(predicate22);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(map29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNotNull(predicate34);
        org.junit.Assert.assertTrue(b35 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertNotNull(predicate40);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNotNull(predicate46);
        org.junit.Assert.assertNotNull(map47);
        org.junit.Assert.assertNotNull(map48);
        org.junit.Assert.assertNull(obj53);
        org.junit.Assert.assertTrue("'" + str54 + "' != '" + "{}" + "'", str54.equals("{}"));
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertTrue(i57 == 0);
        org.junit.Assert.assertNull(obj61);
        org.junit.Assert.assertTrue("'" + str62 + "' != '" + "{}" + "'", str62.equals("{}"));
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(map66);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertNotNull(map68);
        org.junit.Assert.assertTrue(b69 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        boolean b5 = defaultedMap1.containsKey((java.lang.Object) ' ');
        defaultedMap1.clear();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        boolean b7 = defaultedMap1.isEmpty();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator();
        collections.Predicate predicate11 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10, predicate11);
        boolean b13 = defaultedMap1.equals((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1);
        java.util.Set set18 = defaultedMap15.entrySet();
        defaultedMap1.putAll((java.util.Map) defaultedMap15);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        java.lang.String str24 = defaultedMap21.toString();
        boolean b26 = defaultedMap21.equals((java.lang.Object) (-1.0f));
        boolean b27 = defaultedMap21.isEmpty();
        java.lang.Object obj29 = defaultedMap21.get((java.lang.Object) 100L);
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1);
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (-1.0f));
        boolean b37 = defaultedMap31.isEmpty();
        java.util.Set set38 = defaultedMap31.keySet();
        boolean b39 = defaultedMap21.containsKey((java.lang.Object) defaultedMap31);
        boolean b40 = defaultedMap1.containsKey((java.lang.Object) defaultedMap31);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(set18);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue("'" + obj29 + "' != '" + 100L + "'", obj29.equals(100L));
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(set38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue(b40 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.Factory factory35 = null;
        try {
            java.util.Map map36 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap22, factory35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        java.util.Map map8 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) 1.0d);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(map8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        collections.iterators.FilterIterator filterIterator20 = new collections.iterators.FilterIterator();
        collections.Predicate predicate21 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator22 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator20, predicate21);
        collections.iterators.FilterIterator filterIterator23 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.iterators.FilterIterator filterIterator24 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator22);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        filterIterator24.setPredicate(predicate29);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator();
        collections.Predicate predicate33 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator34 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator32, predicate33);
        java.util.Map map35 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap14, predicate29, predicate33);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        boolean b42 = defaultedMap37.equals((java.lang.Object) (-1.0f));
        boolean b43 = defaultedMap37.isEmpty();
        java.lang.Object obj45 = defaultedMap37.get((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap14.remove((java.lang.Object) defaultedMap37);
        java.lang.String str47 = defaultedMap37.toString();
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate51);
        boolean b53 = defaultedMap37.containsKey((java.lang.Object) predicate51);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map35);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue(b43 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + "{}" + "'", str47.equals("{}"));
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b53 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b21 = defaultedMap20.isEmpty();
        defaultedMap7.putAll((java.util.Map) defaultedMap20);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 1);
        java.lang.String str27 = defaultedMap24.toString();
        boolean b29 = defaultedMap24.equals((java.lang.Object) (-1.0f));
        int i30 = defaultedMap24.size();
        java.util.Map map31 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap7, (java.lang.Object) i30);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "{}" + "'", str27.equals("{}"));
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue(i30 == 0);
        org.junit.Assert.assertNotNull(map31);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        collections.Predicate predicate23 = collections.PredicateUtils.uniquePredicate();
        boolean b24 = defaultedMap20.containsValue((java.lang.Object) predicate23);
        collections.map.DefaultedMap defaultedMap26 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj28 = defaultedMap26.remove((java.lang.Object) 1);
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        boolean b30 = defaultedMap26.containsValue((java.lang.Object) predicate29);
        defaultedMap20.putAll((java.util.Map) defaultedMap26);
        collections.map.DefaultedMap defaultedMap33 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj35 = defaultedMap33.remove((java.lang.Object) 1);
        java.lang.String str36 = defaultedMap33.toString();
        defaultedMap26.putAll((java.util.Map) defaultedMap33);
        defaultedMap7.putAll((java.util.Map) defaultedMap26);
        java.util.Set set39 = defaultedMap26.entrySet();
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 1);
        java.lang.String str44 = defaultedMap41.toString();
        boolean b46 = defaultedMap41.equals((java.lang.Object) (-1.0f));
        boolean b47 = defaultedMap41.isEmpty();
        boolean b48 = defaultedMap41.isEmpty();
        collections.map.DefaultedMap defaultedMap50 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj52 = defaultedMap50.remove((java.lang.Object) 1);
        java.lang.String str53 = defaultedMap50.toString();
        boolean b55 = defaultedMap50.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj59 = defaultedMap57.remove((java.lang.Object) 1);
        collections.Predicate predicate60 = collections.PredicateUtils.uniquePredicate();
        boolean b61 = defaultedMap57.containsValue((java.lang.Object) predicate60);
        collections.map.DefaultedMap defaultedMap63 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj65 = defaultedMap63.remove((java.lang.Object) 1);
        collections.Predicate predicate66 = collections.PredicateUtils.uniquePredicate();
        boolean b67 = defaultedMap63.containsValue((java.lang.Object) predicate66);
        defaultedMap57.putAll((java.util.Map) defaultedMap63);
        defaultedMap50.putAll((java.util.Map) defaultedMap63);
        collections.map.DefaultedMap defaultedMap71 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj73 = defaultedMap71.remove((java.lang.Object) 1);
        collections.Predicate predicate74 = collections.PredicateUtils.uniquePredicate();
        boolean b75 = defaultedMap71.containsValue((java.lang.Object) predicate74);
        collections.map.DefaultedMap defaultedMap77 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj79 = defaultedMap77.remove((java.lang.Object) 1);
        collections.Predicate predicate80 = collections.PredicateUtils.uniquePredicate();
        boolean b81 = defaultedMap77.containsValue((java.lang.Object) predicate80);
        defaultedMap71.putAll((java.util.Map) defaultedMap77);
        defaultedMap63.putAll((java.util.Map) defaultedMap71);
        java.lang.Object obj84 = defaultedMap41.get((java.lang.Object) defaultedMap71);
        defaultedMap41.clear();
        defaultedMap26.putAll((java.util.Map) defaultedMap41);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(predicate23);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "{}" + "'", str36.equals("{}"));
        org.junit.Assert.assertNotNull(set39);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "{}" + "'", str44.equals("{}"));
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertTrue(b47 == true);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "{}" + "'", str53.equals("{}"));
        org.junit.Assert.assertTrue(b55 == false);
        org.junit.Assert.assertNull(obj59);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNull(obj65);
        org.junit.Assert.assertNotNull(predicate66);
        org.junit.Assert.assertTrue(b67 == false);
        org.junit.Assert.assertNull(obj73);
        org.junit.Assert.assertNotNull(predicate74);
        org.junit.Assert.assertTrue(b75 == false);
        org.junit.Assert.assertNull(obj79);
        org.junit.Assert.assertNotNull(predicate80);
        org.junit.Assert.assertTrue(b81 == false);
        org.junit.Assert.assertTrue("'" + obj84 + "' != '" + 100L + "'", obj84.equals(100L));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b6 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        java.lang.String str24 = defaultedMap21.toString();
        defaultedMap14.putAll((java.util.Map) defaultedMap21);
        java.util.Set set26 = defaultedMap21.keySet();
        java.lang.Object obj27 = defaultedMap1.get((java.lang.Object) set26);
        boolean b28 = defaultedMap1.isEmpty();
        java.util.Collection collection29 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap31 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj33 = defaultedMap31.remove((java.lang.Object) 1);
        java.lang.String str34 = defaultedMap31.toString();
        boolean b36 = defaultedMap31.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap38 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj40 = defaultedMap38.remove((java.lang.Object) 1);
        collections.Predicate predicate41 = collections.PredicateUtils.uniquePredicate();
        boolean b42 = defaultedMap38.containsValue((java.lang.Object) predicate41);
        collections.map.DefaultedMap defaultedMap44 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj46 = defaultedMap44.remove((java.lang.Object) 1);
        collections.Predicate predicate47 = collections.PredicateUtils.uniquePredicate();
        boolean b48 = defaultedMap44.containsValue((java.lang.Object) predicate47);
        defaultedMap38.putAll((java.util.Map) defaultedMap44);
        defaultedMap31.putAll((java.util.Map) defaultedMap44);
        boolean b51 = defaultedMap1.containsKey((java.lang.Object) defaultedMap44);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "{}" + "'", str24.equals("{}"));
        org.junit.Assert.assertNotNull(set26);
        org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 100L + "'", obj27.equals(100L));
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(collection29);
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "{}" + "'", str34.equals("{}"));
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(obj40);
        org.junit.Assert.assertNotNull(predicate41);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertNotNull(predicate47);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertTrue(b51 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.Predicate predicate3 = filterIterator2.getPredicate();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1);
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        boolean b18 = defaultedMap6.equals((java.lang.Object) predicate16);
        collections.map.DefaultedMap defaultedMap20 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj22 = defaultedMap20.remove((java.lang.Object) 1);
        java.util.Set set23 = defaultedMap20.entrySet();
        defaultedMap6.putAll((java.util.Map) defaultedMap20);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        java.util.Map map27 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap6, predicate25, predicate26);
        filterIterator2.setPredicate(predicate26);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(predicate3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertNotNull(set23);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertNotNull(map27);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        java.lang.String str11 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.equals((java.lang.Object) (-1.0f));
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate30, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        boolean b39 = defaultedMap35.containsValue((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) predicate44);
        defaultedMap35.putAll((java.util.Map) defaultedMap41);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate32, predicate48);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate48);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate54);
        collections.map.DefaultedMap defaultedMap57 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b58 = defaultedMap57.isEmpty();
        collections.map.DefaultedMap defaultedMap60 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj61 = defaultedMap57.get((java.lang.Object) 100L);
        boolean b63 = defaultedMap57.equals((java.lang.Object) (short) 1);
        java.util.Set set64 = defaultedMap57.entrySet();
        java.util.Collection collection65 = defaultedMap57.values();
        collections.map.DefaultedMap defaultedMap67 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj69 = defaultedMap67.remove((java.lang.Object) 1);
        java.lang.String str70 = defaultedMap67.toString();
        boolean b72 = defaultedMap67.equals((java.lang.Object) (-1.0f));
        java.util.Map map74 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap67, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator75 = new collections.iterators.FilterIterator();
        collections.Predicate predicate76 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator77 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator75, predicate76);
        java.util.Iterator iterator78 = filterIterator75.getIterator();
        java.util.Iterator iterator79 = filterIterator75.getIterator();
        java.util.Iterator iterator80 = filterIterator75.getIterator();
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator82 = new collections.iterators.FilterIterator(iterator80, predicate81);
        java.lang.Object obj83 = defaultedMap57.put((java.lang.Object) defaultedMap67, (java.lang.Object) filterIterator82);
        collections.Predicate predicate84 = filterIterator82.getPredicate();
        collections.iterators.FilterIterator filterIterator85 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate84);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue("'" + obj61 + "' != '" + 100L + "'", obj61.equals(100L));
        org.junit.Assert.assertTrue(b63 == false);
        org.junit.Assert.assertNotNull(set64);
        org.junit.Assert.assertNotNull(collection65);
        org.junit.Assert.assertNull(obj69);
        org.junit.Assert.assertTrue("'" + str70 + "' != '" + "{}" + "'", str70.equals("{}"));
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(map74);
        org.junit.Assert.assertNotNull(predicate76);
        org.junit.Assert.assertNull(iterator78);
        org.junit.Assert.assertNull(iterator79);
        org.junit.Assert.assertNull(iterator80);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNull(obj83);
        org.junit.Assert.assertNotNull(predicate84);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        java.util.Set set20 = defaultedMap14.keySet();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator22 = filterIterator21.getIterator();
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) predicate27);
        collections.map.DefaultedMap defaultedMap30 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj32 = defaultedMap30.remove((java.lang.Object) 1);
        collections.Predicate predicate33 = collections.PredicateUtils.uniquePredicate();
        boolean b34 = defaultedMap30.containsValue((java.lang.Object) predicate33);
        defaultedMap24.putAll((java.util.Map) defaultedMap30);
        collections.map.DefaultedMap defaultedMap37 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj39 = defaultedMap37.remove((java.lang.Object) 1);
        java.lang.String str40 = defaultedMap37.toString();
        defaultedMap30.putAll((java.util.Map) defaultedMap37);
        java.lang.String str42 = defaultedMap37.toString();
        collections.iterators.FilterIterator filterIterator43 = new collections.iterators.FilterIterator();
        collections.Predicate predicate44 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator43, predicate44);
        collections.iterators.FilterIterator filterIterator46 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45);
        collections.map.DefaultedMap defaultedMap49 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj51 = defaultedMap49.remove((java.lang.Object) 1);
        collections.Predicate predicate52 = collections.PredicateUtils.uniquePredicate();
        boolean b53 = defaultedMap49.containsValue((java.lang.Object) predicate52);
        filterIterator47.setPredicate(predicate52);
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator();
        collections.Predicate predicate56 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator55, predicate56);
        java.util.Map map58 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap37, predicate52, predicate56);
        filterIterator21.setPredicate(predicate56);
        java.lang.Object obj60 = defaultedMap14.remove((java.lang.Object) filterIterator21);
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator21);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNull(obj39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + "{}" + "'", str40.equals("{}"));
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{}" + "'", str42.equals("{}"));
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(predicate52);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate56);
        org.junit.Assert.assertNotNull(map58);
        org.junit.Assert.assertNull(obj60);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        boolean b6 = defaultedMap1.equals((java.lang.Object) (-1.0f));
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        collections.Predicate predicate11 = collections.PredicateUtils.uniquePredicate();
        boolean b12 = defaultedMap8.containsValue((java.lang.Object) predicate11);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        collections.Predicate predicate17 = collections.PredicateUtils.uniquePredicate();
        boolean b18 = defaultedMap14.containsValue((java.lang.Object) predicate17);
        defaultedMap8.putAll((java.util.Map) defaultedMap14);
        defaultedMap1.putAll((java.util.Map) defaultedMap14);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        collections.map.DefaultedMap defaultedMap28 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj30 = defaultedMap28.remove((java.lang.Object) 1);
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        boolean b32 = defaultedMap28.containsValue((java.lang.Object) predicate31);
        defaultedMap22.putAll((java.util.Map) defaultedMap28);
        defaultedMap14.putAll((java.util.Map) defaultedMap22);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1);
        java.lang.String str39 = defaultedMap36.toString();
        boolean b41 = defaultedMap36.equals((java.lang.Object) (-1.0f));
        java.util.Map map43 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap36, (java.lang.Object) 1.0d);
        boolean b44 = defaultedMap36.isEmpty();
        java.lang.Object obj45 = defaultedMap14.get((java.lang.Object) b44);
        java.lang.Object obj47 = defaultedMap14.get((java.lang.Object) "");
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator49 = filterIterator48.getIterator();
        java.util.Iterator iterator50 = filterIterator48.getIterator();
        collections.Predicate predicate51 = collections.PredicateUtils.notNullPredicate();
        filterIterator48.setPredicate(predicate51);
        boolean b53 = defaultedMap14.containsValue((java.lang.Object) filterIterator48);
        collections.iterators.FilterIterator filterIterator54 = new collections.iterators.FilterIterator();
        collections.Predicate predicate55 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator56 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator54, predicate55);
        collections.iterators.FilterIterator filterIterator57 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator58 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator56);
        collections.iterators.FilterIterator filterIterator59 = new collections.iterators.FilterIterator();
        collections.Predicate predicate60 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator61 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator59, predicate60);
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        collections.iterators.FilterIterator filterIterator63 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator61);
        filterIterator58.setIterator((java.util.Iterator) filterIterator63);
        collections.map.DefaultedMap defaultedMap66 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj68 = defaultedMap66.remove((java.lang.Object) 1);
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        boolean b70 = defaultedMap66.containsValue((java.lang.Object) predicate69);
        collections.map.DefaultedMap defaultedMap72 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj74 = defaultedMap72.remove((java.lang.Object) 1);
        collections.Predicate predicate75 = collections.PredicateUtils.uniquePredicate();
        boolean b76 = defaultedMap72.containsValue((java.lang.Object) predicate75);
        defaultedMap66.putAll((java.util.Map) defaultedMap72);
        collections.iterators.FilterIterator filterIterator78 = new collections.iterators.FilterIterator();
        collections.Predicate predicate79 = collections.PredicateUtils.uniquePredicate();
        filterIterator78.setPredicate(predicate79);
        collections.Predicate predicate81 = collections.PredicateUtils.truePredicate();
        java.util.Map map82 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap66, predicate79, predicate81);
        collections.iterators.FilterIterator filterIterator83 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator58, predicate79);
        collections.iterators.FilterIterator filterIterator84 = new collections.iterators.FilterIterator();
        collections.Predicate predicate85 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator84, predicate85);
        collections.iterators.FilterIterator filterIterator87 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        collections.iterators.FilterIterator filterIterator88 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator86);
        collections.map.DefaultedMap defaultedMap90 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj92 = defaultedMap90.remove((java.lang.Object) 1);
        collections.Predicate predicate93 = collections.PredicateUtils.uniquePredicate();
        boolean b94 = defaultedMap90.containsValue((java.lang.Object) predicate93);
        filterIterator88.setPredicate(predicate93);
        collections.iterators.FilterIterator filterIterator96 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator83, predicate93);
        filterIterator48.setPredicate(predicate93);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(predicate11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(predicate17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(map43);
        org.junit.Assert.assertTrue(b44 == true);
        org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 100L + "'", obj45.equals(100L));
        org.junit.Assert.assertTrue("'" + obj47 + "' != '" + 100L + "'", obj47.equals(100L));
        org.junit.Assert.assertNull(iterator49);
        org.junit.Assert.assertNull(iterator50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b53 == false);
        org.junit.Assert.assertNotNull(predicate55);
        org.junit.Assert.assertNotNull(predicate60);
        org.junit.Assert.assertNull(obj68);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertTrue(b70 == false);
        org.junit.Assert.assertNull(obj74);
        org.junit.Assert.assertNotNull(predicate75);
        org.junit.Assert.assertTrue(b76 == false);
        org.junit.Assert.assertNotNull(predicate79);
        org.junit.Assert.assertNotNull(predicate81);
        org.junit.Assert.assertNotNull(map82);
        org.junit.Assert.assertNotNull(predicate85);
        org.junit.Assert.assertNull(obj92);
        org.junit.Assert.assertNotNull(predicate93);
        org.junit.Assert.assertTrue(b94 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        defaultedMap1.clear();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1);
        java.lang.String str9 = defaultedMap6.toString();
        boolean b11 = defaultedMap6.equals((java.lang.Object) (-1.0f));
        boolean b12 = defaultedMap6.isEmpty();
        java.lang.Object obj14 = defaultedMap6.get((java.lang.Object) 100L);
        collections.iterators.FilterIterator filterIterator15 = new collections.iterators.FilterIterator();
        collections.Predicate predicate16 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator17 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator15, predicate16);
        boolean b18 = defaultedMap6.equals((java.lang.Object) predicate16);
        java.util.Map map19 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap1, (java.lang.Object) predicate16);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "{}" + "'", str9.equals("{}"));
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100L + "'", obj14.equals(100L));
        org.junit.Assert.assertNotNull(predicate16);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(map19);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.Predicate predicate4 = collections.PredicateUtils.uniquePredicate();
        boolean b5 = defaultedMap1.containsValue((java.lang.Object) predicate4);
        collections.map.DefaultedMap defaultedMap7 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj9 = defaultedMap7.remove((java.lang.Object) 1);
        collections.Predicate predicate10 = collections.PredicateUtils.uniquePredicate();
        boolean b11 = defaultedMap7.containsValue((java.lang.Object) predicate10);
        defaultedMap1.putAll((java.util.Map) defaultedMap7);
        collections.map.DefaultedMap defaultedMap14 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj16 = defaultedMap14.remove((java.lang.Object) 1);
        java.lang.String str17 = defaultedMap14.toString();
        defaultedMap7.putAll((java.util.Map) defaultedMap14);
        java.lang.String str19 = defaultedMap14.toString();
        java.util.Set set20 = defaultedMap14.keySet();
        java.util.Set set21 = defaultedMap14.entrySet();
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) predicate26);
        collections.map.DefaultedMap defaultedMap29 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj31 = defaultedMap29.remove((java.lang.Object) 1);
        collections.Predicate predicate32 = collections.PredicateUtils.uniquePredicate();
        boolean b33 = defaultedMap29.containsValue((java.lang.Object) predicate32);
        defaultedMap23.putAll((java.util.Map) defaultedMap29);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1);
        java.lang.String str39 = defaultedMap36.toString();
        defaultedMap29.putAll((java.util.Map) defaultedMap36);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) predicate45);
        collections.map.DefaultedMap defaultedMap48 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj50 = defaultedMap48.remove((java.lang.Object) 1);
        collections.Predicate predicate51 = collections.PredicateUtils.uniquePredicate();
        boolean b52 = defaultedMap48.containsValue((java.lang.Object) predicate51);
        defaultedMap42.putAll((java.util.Map) defaultedMap48);
        collections.map.DefaultedMap defaultedMap55 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj57 = defaultedMap55.remove((java.lang.Object) 1);
        java.lang.String str58 = defaultedMap55.toString();
        defaultedMap48.putAll((java.util.Map) defaultedMap55);
        defaultedMap29.putAll((java.util.Map) defaultedMap48);
        boolean b61 = defaultedMap48.isEmpty();
        collections.iterators.FilterIterator filterIterator62 = new collections.iterators.FilterIterator();
        collections.Predicate predicate63 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator64 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate63);
        java.util.Iterator iterator65 = filterIterator62.getIterator();
        java.util.Iterator iterator66 = filterIterator62.getIterator();
        java.lang.Object obj67 = defaultedMap48.remove((java.lang.Object) filterIterator62);
        collections.Predicate predicate68 = null;
        collections.iterators.FilterIterator filterIterator69 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62, predicate68);
        collections.iterators.FilterIterator filterIterator70 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator62);
        boolean b71 = defaultedMap14.equals((java.lang.Object) filterIterator62);
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "{}" + "'", str17.equals("{}"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "{}" + "'", str19.equals("{}"));
        org.junit.Assert.assertNotNull(set20);
        org.junit.Assert.assertNotNull(set21);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "{}" + "'", str39.equals("{}"));
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNull(obj50);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertTrue("'" + str58 + "' != '" + "{}" + "'", str58.equals("{}"));
        org.junit.Assert.assertTrue(b61 == true);
        org.junit.Assert.assertNotNull(predicate63);
        org.junit.Assert.assertNull(iterator65);
        org.junit.Assert.assertNull(iterator66);
        org.junit.Assert.assertNull(obj67);
        org.junit.Assert.assertTrue(b71 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        collections.map.DefaultedMap defaultedMap5 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj7 = defaultedMap5.remove((java.lang.Object) 1);
        collections.Predicate predicate8 = collections.PredicateUtils.uniquePredicate();
        boolean b9 = defaultedMap5.containsValue((java.lang.Object) predicate8);
        java.util.Set set10 = defaultedMap5.entrySet();
        java.lang.Object obj11 = defaultedMap1.get((java.lang.Object) defaultedMap5);
        defaultedMap5.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(predicate8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(set10);
        org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100L + "'", obj11.equals(100L));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.util.Set set4 = defaultedMap1.entrySet();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj8 = defaultedMap6.remove((java.lang.Object) 1);
        collections.Predicate predicate9 = collections.PredicateUtils.uniquePredicate();
        boolean b10 = defaultedMap6.containsValue((java.lang.Object) predicate9);
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        collections.Predicate predicate15 = collections.PredicateUtils.uniquePredicate();
        boolean b16 = defaultedMap12.containsValue((java.lang.Object) predicate15);
        defaultedMap6.putAll((java.util.Map) defaultedMap12);
        defaultedMap12.clear();
        boolean b19 = defaultedMap1.equals((java.lang.Object) defaultedMap12);
        java.util.Set set20 = defaultedMap1.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertNotNull(set4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNotNull(predicate15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertNotNull(set20);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator();
        collections.Predicate predicate4 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator3, predicate4);
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator5);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator();
        collections.Predicate predicate9 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator10 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate9);
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator10);
        filterIterator7.setIterator((java.util.Iterator) filterIterator12);
        collections.map.DefaultedMap defaultedMap15 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj17 = defaultedMap15.remove((java.lang.Object) 1);
        collections.Predicate predicate18 = collections.PredicateUtils.uniquePredicate();
        boolean b19 = defaultedMap15.containsValue((java.lang.Object) predicate18);
        collections.map.DefaultedMap defaultedMap21 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj23 = defaultedMap21.remove((java.lang.Object) 1);
        collections.Predicate predicate24 = collections.PredicateUtils.uniquePredicate();
        boolean b25 = defaultedMap21.containsValue((java.lang.Object) predicate24);
        defaultedMap15.putAll((java.util.Map) defaultedMap21);
        collections.iterators.FilterIterator filterIterator27 = new collections.iterators.FilterIterator();
        collections.Predicate predicate28 = collections.PredicateUtils.uniquePredicate();
        filterIterator27.setPredicate(predicate28);
        collections.Predicate predicate30 = collections.PredicateUtils.truePredicate();
        java.util.Map map31 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap15, predicate28, predicate30);
        collections.iterators.FilterIterator filterIterator32 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator7, predicate28);
        java.util.Iterator iterator33 = filterIterator32.getIterator();
        java.util.Iterator iterator34 = filterIterator32.getIterator();
        filterIterator2.setIterator(iterator34);
        org.junit.Assert.assertNotNull(predicate1);
        org.junit.Assert.assertNotNull(predicate4);
        org.junit.Assert.assertNotNull(predicate9);
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertNotNull(predicate18);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNotNull(predicate24);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(map31);
        org.junit.Assert.assertNotNull(iterator33);
        org.junit.Assert.assertNotNull(iterator34);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (-1.0f));
        boolean b18 = defaultedMap12.isEmpty();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 100L);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        defaultedMap1.clear();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.map.DefaultedMap defaultedMap9 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj11 = defaultedMap9.remove((java.lang.Object) 1);
        java.lang.String str12 = defaultedMap9.toString();
        boolean b14 = defaultedMap9.equals((java.lang.Object) (-1.0f));
        java.util.Map map16 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap9, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap18 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj20 = defaultedMap18.remove((java.lang.Object) 1);
        collections.Predicate predicate21 = collections.PredicateUtils.uniquePredicate();
        boolean b22 = defaultedMap18.containsValue((java.lang.Object) predicate21);
        collections.map.DefaultedMap defaultedMap24 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj26 = defaultedMap24.remove((java.lang.Object) 1);
        collections.Predicate predicate27 = collections.PredicateUtils.uniquePredicate();
        boolean b28 = defaultedMap24.containsValue((java.lang.Object) predicate27);
        defaultedMap18.putAll((java.util.Map) defaultedMap24);
        collections.iterators.FilterIterator filterIterator30 = new collections.iterators.FilterIterator();
        collections.Predicate predicate31 = collections.PredicateUtils.uniquePredicate();
        filterIterator30.setPredicate(predicate31);
        collections.Predicate predicate33 = collections.PredicateUtils.truePredicate();
        java.util.Map map34 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap18, predicate31, predicate33);
        collections.map.DefaultedMap defaultedMap36 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj38 = defaultedMap36.remove((java.lang.Object) 1);
        collections.Predicate predicate39 = collections.PredicateUtils.uniquePredicate();
        boolean b40 = defaultedMap36.containsValue((java.lang.Object) predicate39);
        collections.map.DefaultedMap defaultedMap42 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj44 = defaultedMap42.remove((java.lang.Object) 1);
        collections.Predicate predicate45 = collections.PredicateUtils.uniquePredicate();
        boolean b46 = defaultedMap42.containsValue((java.lang.Object) predicate45);
        defaultedMap36.putAll((java.util.Map) defaultedMap42);
        collections.iterators.FilterIterator filterIterator48 = new collections.iterators.FilterIterator();
        collections.Predicate predicate49 = collections.PredicateUtils.uniquePredicate();
        filterIterator48.setPredicate(predicate49);
        collections.Predicate predicate51 = collections.PredicateUtils.truePredicate();
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap36, predicate49, predicate51);
        java.util.Map map53 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap9, predicate33, predicate49);
        filterIterator7.setPredicate(predicate49);
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{}" + "'", str12.equals("{}"));
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(map16);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(predicate21);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(predicate27);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(predicate33);
        org.junit.Assert.assertNotNull(map34);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNotNull(predicate39);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(predicate45);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(predicate49);
        org.junit.Assert.assertNotNull(predicate51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(map53);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        java.util.Set set8 = defaultedMap1.entrySet();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap11 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj13 = defaultedMap11.remove((java.lang.Object) 1);
        java.lang.String str14 = defaultedMap11.toString();
        boolean b16 = defaultedMap11.equals((java.lang.Object) (-1.0f));
        java.util.Map map18 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap11, (java.lang.Object) 1.0d);
        collections.iterators.FilterIterator filterIterator19 = new collections.iterators.FilterIterator();
        collections.Predicate predicate20 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator21 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator19, predicate20);
        java.util.Iterator iterator22 = filterIterator19.getIterator();
        java.util.Iterator iterator23 = filterIterator19.getIterator();
        java.util.Iterator iterator24 = filterIterator19.getIterator();
        collections.Predicate predicate25 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator26 = new collections.iterators.FilterIterator(iterator24, predicate25);
        java.lang.Object obj27 = defaultedMap1.put((java.lang.Object) defaultedMap11, (java.lang.Object) filterIterator26);
        collections.Predicate predicate28 = filterIterator26.getPredicate();
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = filterIterator29.getPredicate();
        collections.map.DefaultedMap defaultedMap32 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj34 = defaultedMap32.remove((java.lang.Object) 1);
        collections.Predicate predicate35 = collections.PredicateUtils.uniquePredicate();
        boolean b36 = defaultedMap32.containsValue((java.lang.Object) predicate35);
        filterIterator29.setPredicate(predicate35);
        filterIterator26.setPredicate(predicate35);
        collections.iterators.FilterIterator filterIterator39 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator40 = filterIterator39.getIterator();
        java.util.Iterator iterator41 = filterIterator39.getIterator();
        collections.Predicate predicate42 = collections.PredicateUtils.notNullPredicate();
        filterIterator39.setPredicate(predicate42);
        collections.Predicate predicate44 = filterIterator39.getPredicate();
        collections.iterators.FilterIterator filterIterator45 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator39);
        collections.map.DefaultedMap defaultedMap47 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj49 = defaultedMap47.remove((java.lang.Object) 1);
        java.lang.String str50 = defaultedMap47.toString();
        boolean b52 = defaultedMap47.equals((java.lang.Object) (-1.0f));
        java.util.Map map54 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap47, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap56 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj58 = defaultedMap56.remove((java.lang.Object) 1);
        collections.Predicate predicate59 = collections.PredicateUtils.uniquePredicate();
        boolean b60 = defaultedMap56.containsValue((java.lang.Object) predicate59);
        collections.map.DefaultedMap defaultedMap62 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj64 = defaultedMap62.remove((java.lang.Object) 1);
        collections.Predicate predicate65 = collections.PredicateUtils.uniquePredicate();
        boolean b66 = defaultedMap62.containsValue((java.lang.Object) predicate65);
        defaultedMap56.putAll((java.util.Map) defaultedMap62);
        collections.iterators.FilterIterator filterIterator68 = new collections.iterators.FilterIterator();
        collections.Predicate predicate69 = collections.PredicateUtils.uniquePredicate();
        filterIterator68.setPredicate(predicate69);
        collections.Predicate predicate71 = collections.PredicateUtils.truePredicate();
        java.util.Map map72 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap56, predicate69, predicate71);
        collections.map.DefaultedMap defaultedMap74 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj76 = defaultedMap74.remove((java.lang.Object) 1);
        collections.Predicate predicate77 = collections.PredicateUtils.uniquePredicate();
        boolean b78 = defaultedMap74.containsValue((java.lang.Object) predicate77);
        collections.map.DefaultedMap defaultedMap80 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj82 = defaultedMap80.remove((java.lang.Object) 1);
        collections.Predicate predicate83 = collections.PredicateUtils.uniquePredicate();
        boolean b84 = defaultedMap80.containsValue((java.lang.Object) predicate83);
        defaultedMap74.putAll((java.util.Map) defaultedMap80);
        collections.iterators.FilterIterator filterIterator86 = new collections.iterators.FilterIterator();
        collections.Predicate predicate87 = collections.PredicateUtils.uniquePredicate();
        filterIterator86.setPredicate(predicate87);
        collections.Predicate predicate89 = collections.PredicateUtils.truePredicate();
        java.util.Map map90 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap74, predicate87, predicate89);
        java.util.Map map91 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap47, predicate71, predicate87);
        collections.iterators.FilterIterator filterIterator92 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator45, predicate87);
        collections.iterators.FilterIterator filterIterator93 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26, predicate87);
        collections.iterators.FilterIterator filterIterator94 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator26);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertNotNull(collection9);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "{}" + "'", str14.equals("{}"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(map18);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertNull(iterator22);
        org.junit.Assert.assertNull(iterator23);
        org.junit.Assert.assertNull(iterator24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(predicate28);
        org.junit.Assert.assertNull(predicate30);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(predicate35);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertNull(iterator40);
        org.junit.Assert.assertNull(iterator41);
        org.junit.Assert.assertNotNull(predicate42);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertNull(obj49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{}" + "'", str50.equals("{}"));
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertNotNull(map54);
        org.junit.Assert.assertNull(obj58);
        org.junit.Assert.assertNotNull(predicate59);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertNull(obj64);
        org.junit.Assert.assertNotNull(predicate65);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(predicate69);
        org.junit.Assert.assertNotNull(predicate71);
        org.junit.Assert.assertNotNull(map72);
        org.junit.Assert.assertNull(obj76);
        org.junit.Assert.assertNotNull(predicate77);
        org.junit.Assert.assertTrue(b78 == false);
        org.junit.Assert.assertNull(obj82);
        org.junit.Assert.assertNotNull(predicate83);
        org.junit.Assert.assertTrue(b84 == false);
        org.junit.Assert.assertNotNull(predicate87);
        org.junit.Assert.assertNotNull(predicate89);
        org.junit.Assert.assertNotNull(map90);
        org.junit.Assert.assertNotNull(map91);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        java.util.Set set3 = defaultedMap1.keySet();
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator();
        collections.Predicate predicate5 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator4, predicate5);
        collections.iterators.FilterIterator filterIterator7 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator8 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6);
        collections.iterators.FilterIterator filterIterator9 = new collections.iterators.FilterIterator();
        collections.Predicate predicate10 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator11 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator9, predicate10);
        collections.iterators.FilterIterator filterIterator12 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        collections.iterators.FilterIterator filterIterator13 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator11);
        filterIterator8.setIterator((java.util.Iterator) filterIterator13);
        collections.map.DefaultedMap defaultedMap16 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj18 = defaultedMap16.remove((java.lang.Object) 1);
        collections.Predicate predicate19 = collections.PredicateUtils.uniquePredicate();
        boolean b20 = defaultedMap16.containsValue((java.lang.Object) predicate19);
        collections.map.DefaultedMap defaultedMap22 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj24 = defaultedMap22.remove((java.lang.Object) 1);
        collections.Predicate predicate25 = collections.PredicateUtils.uniquePredicate();
        boolean b26 = defaultedMap22.containsValue((java.lang.Object) predicate25);
        defaultedMap16.putAll((java.util.Map) defaultedMap22);
        collections.iterators.FilterIterator filterIterator28 = new collections.iterators.FilterIterator();
        collections.Predicate predicate29 = collections.PredicateUtils.uniquePredicate();
        filterIterator28.setPredicate(predicate29);
        collections.Predicate predicate31 = collections.PredicateUtils.truePredicate();
        java.util.Map map32 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap16, predicate29, predicate31);
        collections.iterators.FilterIterator filterIterator33 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator8, predicate29);
        java.lang.Object obj34 = defaultedMap1.get((java.lang.Object) predicate29);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(set3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNotNull(predicate10);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(predicate19);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNull(obj24);
        org.junit.Assert.assertNotNull(predicate25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(predicate29);
        org.junit.Assert.assertNotNull(predicate31);
        org.junit.Assert.assertNotNull(map32);
        org.junit.Assert.assertTrue("'" + obj34 + "' != '" + 100L + "'", obj34.equals(100L));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b2 = defaultedMap1.isEmpty();
        collections.map.DefaultedMap defaultedMap4 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj5 = defaultedMap1.get((java.lang.Object) 100L);
        boolean b7 = defaultedMap1.equals((java.lang.Object) (short) 1);
        boolean b8 = defaultedMap1.isEmpty();
        java.util.Collection collection9 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap10 = new collections.map.DefaultedMap((java.lang.Object) collection9);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 100L + "'", obj5.equals(100L));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(collection9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        collections.map.DefaultedMap defaultedMap1 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj3 = defaultedMap1.remove((java.lang.Object) 1);
        java.lang.String str4 = defaultedMap1.toString();
        collections.map.DefaultedMap defaultedMap6 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        boolean b7 = defaultedMap6.isEmpty();
        java.util.Set set8 = defaultedMap6.keySet();
        java.lang.Object obj9 = defaultedMap1.get((java.lang.Object) defaultedMap6);
        java.util.Collection collection10 = defaultedMap1.values();
        collections.map.DefaultedMap defaultedMap12 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj14 = defaultedMap12.remove((java.lang.Object) 1);
        java.lang.String str15 = defaultedMap12.toString();
        boolean b17 = defaultedMap12.equals((java.lang.Object) (-1.0f));
        boolean b18 = defaultedMap12.isEmpty();
        java.lang.Object obj20 = defaultedMap12.get((java.lang.Object) 100L);
        defaultedMap1.putAll((java.util.Map) defaultedMap12);
        java.util.Set set22 = defaultedMap12.keySet();
        org.junit.Assert.assertNull(obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{}" + "'", str4.equals("{}"));
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(set8);
        org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L + "'", obj9.equals(100L));
        org.junit.Assert.assertNotNull(collection10);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "{}" + "'", str15.equals("{}"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 100L + "'", obj20.equals(100L));
        org.junit.Assert.assertNotNull(set22);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        collections.Predicate predicate1 = collections.PredicateUtils.notNullPredicate();
        collections.iterators.FilterIterator filterIterator2 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0, predicate1);
        collections.iterators.FilterIterator filterIterator3 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator4 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        collections.iterators.FilterIterator filterIterator5 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator2);
        org.junit.Assert.assertNotNull(predicate1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        collections.iterators.FilterIterator filterIterator0 = new collections.iterators.FilterIterator();
        java.util.Iterator iterator1 = filterIterator0.getIterator();
        java.util.Iterator iterator2 = filterIterator0.getIterator();
        collections.Predicate predicate3 = collections.PredicateUtils.notNullPredicate();
        filterIterator0.setPredicate(predicate3);
        collections.Predicate predicate5 = filterIterator0.getPredicate();
        collections.iterators.FilterIterator filterIterator6 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator0);
        collections.map.DefaultedMap defaultedMap8 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj10 = defaultedMap8.remove((java.lang.Object) 1);
        java.lang.String str11 = defaultedMap8.toString();
        boolean b13 = defaultedMap8.equals((java.lang.Object) (-1.0f));
        java.util.Map map15 = collections.map.DefaultedMap.decorate((java.util.Map) defaultedMap8, (java.lang.Object) 1.0d);
        collections.map.DefaultedMap defaultedMap17 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj19 = defaultedMap17.remove((java.lang.Object) 1);
        collections.Predicate predicate20 = collections.PredicateUtils.uniquePredicate();
        boolean b21 = defaultedMap17.containsValue((java.lang.Object) predicate20);
        collections.map.DefaultedMap defaultedMap23 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj25 = defaultedMap23.remove((java.lang.Object) 1);
        collections.Predicate predicate26 = collections.PredicateUtils.uniquePredicate();
        boolean b27 = defaultedMap23.containsValue((java.lang.Object) predicate26);
        defaultedMap17.putAll((java.util.Map) defaultedMap23);
        collections.iterators.FilterIterator filterIterator29 = new collections.iterators.FilterIterator();
        collections.Predicate predicate30 = collections.PredicateUtils.uniquePredicate();
        filterIterator29.setPredicate(predicate30);
        collections.Predicate predicate32 = collections.PredicateUtils.truePredicate();
        java.util.Map map33 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap17, predicate30, predicate32);
        collections.map.DefaultedMap defaultedMap35 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj37 = defaultedMap35.remove((java.lang.Object) 1);
        collections.Predicate predicate38 = collections.PredicateUtils.uniquePredicate();
        boolean b39 = defaultedMap35.containsValue((java.lang.Object) predicate38);
        collections.map.DefaultedMap defaultedMap41 = new collections.map.DefaultedMap((java.lang.Object) 100L);
        java.lang.Object obj43 = defaultedMap41.remove((java.lang.Object) 1);
        collections.Predicate predicate44 = collections.PredicateUtils.uniquePredicate();
        boolean b45 = defaultedMap41.containsValue((java.lang.Object) predicate44);
        defaultedMap35.putAll((java.util.Map) defaultedMap41);
        collections.iterators.FilterIterator filterIterator47 = new collections.iterators.FilterIterator();
        collections.Predicate predicate48 = collections.PredicateUtils.uniquePredicate();
        filterIterator47.setPredicate(predicate48);
        collections.Predicate predicate50 = collections.PredicateUtils.truePredicate();
        java.util.Map map51 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap35, predicate48, predicate50);
        java.util.Map map52 = collections.map.PredicatedMap.decorate((java.util.Map) defaultedMap8, predicate32, predicate48);
        collections.iterators.FilterIterator filterIterator53 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate48);
        collections.Predicate predicate54 = collections.PredicateUtils.truePredicate();
        collections.iterators.FilterIterator filterIterator55 = new collections.iterators.FilterIterator((java.util.Iterator) filterIterator6, predicate54);
        collections.Predicate predicate56 = filterIterator55.getPredicate();
        org.junit.Assert.assertNull(iterator1);
        org.junit.Assert.assertNull(iterator2);
        org.junit.Assert.assertNotNull(predicate3);
        org.junit.Assert.assertNotNull(predicate5);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{}" + "'", str11.equals("{}"));
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(map15);
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(predicate20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertNotNull(predicate26);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(predicate30);
        org.junit.Assert.assertNotNull(predicate32);
        org.junit.Assert.assertNotNull(map33);
        org.junit.Assert.assertNull(obj37);
        org.junit.Assert.assertNotNull(predicate38);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertNull(obj43);
        org.junit.Assert.assertNotNull(predicate44);
        org.junit.Assert.assertTrue(b45 == false);
        org.junit.Assert.assertNotNull(predicate48);
        org.junit.Assert.assertNotNull(predicate50);
        org.junit.Assert.assertNotNull(map51);
        org.junit.Assert.assertNotNull(map52);
        org.junit.Assert.assertNotNull(predicate54);
        org.junit.Assert.assertNotNull(predicate56);
    }
}

